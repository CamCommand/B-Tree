import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Vector;


public class Kmean_clustering {


    int number_of_cluster;
    HashMap<String, Integer> freq_btree;
    Vector dataset_index = new Vector();
    Vector dataset_value = new Vector();
    Vector selected_value = new Vector();
    HashMap<Integer, List<Integer>> current_mean = new HashMap<Integer, List<Integer>>();


    public Kmean_clustering(int n, HashMap<String, Integer> freq_btree) {

        this.number_of_cluster = n;
        this.freq_btree = freq_btree;
        current_mean = set_mean_list_structure(current_mean);

    }

    public void create_dataset() {
        for (String i : freq_btree.keySet()) {

            dataset_index.add(i);
            dataset_value.add(freq_btree.get(i));

        }
    }

    public void select_random_items() {
        for (int i = 0; i < number_of_cluster; i++) {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(dataset_value.size());

            if (selected_value.contains(dataset_value.get(rand_int1))) {
                i--;
            } else {

                selected_value.add(dataset_value.get(rand_int1));
            }
        }
    }

    public void start_cluster() {
        create_dataset();
        select_random_items();
        clustering(current_mean, selected_value);
    }


    public int clustering(HashMap<Integer, List<Integer>> mean, Vector selected) {
        HashMap<Integer, List<Integer>> new_mean_list = getnewMean_list();

        if (IsMeanEqual(mean, new_mean_list)) {
            for (int i = 0; i < this.number_of_cluster; i++) {
                System.out.println("Cluster " + (i + 1) + " = " + selected.get(i));
                System.out.println("Data " + (i + 1) + " = " + mean.get((i + 1)));
            }
            return 0;
        } else {
            Vector new_select = get_mean_for_selected_items(new_mean_list, selected);
            int ii = clustering(new_mean_list, new_select);
            return ii;
        }
    }


    public int check_nearest(int value) {
        List<Integer> temp = new ArrayList<>();
        // HashMap<Integer,List<Integer>> new_mean = new HashMap<Integer,List<Integer>>();
        int loc = 1;

        // calculate distance
        for (int j = 0; j < number_of_cluster; j++) {
            int nn = value - (int) selected_value.get(j);
            temp.add(Math.abs(nn));
        }
        int min = temp.get(0);
        loc = 1;
        // check low value distance
        for (int j = 0; j < number_of_cluster; j++) {
            if (temp.get(j) < min) {
                min = temp.get(j);
                loc = j + 1;
            }
        }
        return loc;
    }

    public HashMap<Integer, List<Integer>> set_mean_list_structure(HashMap<Integer, List<Integer>> new_mean_list) {
        for (int i = 0; i < this.number_of_cluster; i++) {
            List<Integer> tmp = new ArrayList<>();
            new_mean_list.put((i + 1), tmp);
        }
        return new_mean_list;
    }


    public HashMap<Integer, List<Integer>> getnewMean_list() {

        HashMap<Integer, List<Integer>> new_mean_list = new HashMap<Integer, List<Integer>>();
        new_mean_list = set_mean_list_structure(new_mean_list);

        for (int i = 0; i < dataset_value.size(); i++) {

            int loc = check_nearest((int) dataset_value.get(i));
            //  System.out.println("loc = "+loc+" "+new_mean_list.get(loc) );
            List<Integer> tmp = new_mean_list.get(loc);

            tmp.add((int) dataset_value.get(i));

            new_mean_list.put(loc, tmp);
            // System.out.println("new = "+new_mean_list );
        }
        return new_mean_list;
    }

    public Vector get_mean_for_selected_items(HashMap<Integer, List<Integer>> mean, Vector selected) {
        Vector new_select_items = new Vector();

        for (int i = 1; i <= this.number_of_cluster; i++) {

            double avg = 0;
            double sum = 0;
            List<Integer> num = mean.get(i);
            for (int j = 0; j < num.size(); j++) {
                sum = sum + num.get(j);
            }

            avg = sum / (double) num.size();
            new_select_items.add(avg);
        }
        return new_select_items;
    }

    public boolean IsMeanEqual(HashMap<Integer, List<Integer>> mean1, HashMap<Integer, List<Integer>> mean2) {
        int flag = 0;
        for (int j = 1; j <= number_of_cluster; j++) {

            List<Integer> list1 = mean1.get(j);
            List<Integer> list2 = mean2.get(j);

            if (!list1.equals(list2)) {
                flag = 1;
            }
        }

        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }
}
