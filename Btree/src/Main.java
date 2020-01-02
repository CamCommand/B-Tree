import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    //System.out.println("cs.princeton.edu:  " + st.get("www.cs.princeton.edu"));
    //System.out.println("size:    " + st.size());
    //System.out.println("height:  " + st.height());

    static Filebased_Btree load;
    static Filebased_Btree load2;

    public static void main(String[] args) {

        System.out.println("Loading ..... fetching online data ;)");

        try {
            load = new Filebased_Btree("k-means clustering", "https://en.wikipedia.org/wiki/K-means_clustering");
            load = new Filebased_Btree("clustering", "https://en.wikipedia.org/wiki/Clustering");
            load = new Filebased_Btree("Buffer", "https://en.wikipedia.org/wiki/Buffer");
            load = new Filebased_Btree("Artificial intelligence", "https://en.wikipedia.org/wiki/Artificial_intelligence");
            load = new Filebased_Btree("Machine perception", "https://en.wikipedia.org/wiki/Machine_perception");
            load = new Filebased_Btree("Computer vision", "https://en.wikipedia.org/wiki/Computer_vision");
            load = new Filebased_Btree("Engineering", "https://en.wikipedia.org/wiki/Engineering");
            load = new Filebased_Btree("Human intelligence", "https://en.wikipedia.org/wiki/Human_intelligence");
            load = new Filebased_Btree("Cattell–Horn–Carroll theory", "https://en.wikipedia.org/wiki/Cattell%E2%80%93Horn%E2%80%93Carroll_theory");
            load = new Filebased_Btree("Intellect", "https://en.wikipedia.org/wiki/Intellect");
            load = new Filebased_Btree("Intelligent agent", "https://en.wikipedia.org/wiki/Intelligent_agent");
            load = new Filebased_Btree("Problem solving", "https://en.wikipedia.org/wiki/Problem_solving");
            load = new Filebased_Btree("Mathematical problem", "https://en.wikipedia.org/wiki/Mathematical_problem");
            load = new Filebased_Btree("Chaos theory", "https://en.wikipedia.org/wiki/Chaos_theory");
            load = new Filebased_Btree("Dynamics", "https://en.wikipedia.org/wiki/Dynamics");
            load = new Filebased_Btree("Analytical dynamics", "https://en.wikipedia.org/wiki/Analytical_dynamics");
            load = new Filebased_Btree("Psychology", "https://en.wikipedia.org/wiki/Psychology");
            load = new Filebased_Btree("Neuroscience", "https://en.wikipedia.org/wiki/Neuroscience");
            load = new Filebased_Btree("Abstraction", "https://en.wikipedia.org/wiki/Abstraction");
            load = new Filebased_Btree("First principle", "https://en.wikipedia.org/wiki/First_principle");
            load = new Filebased_Btree("Formal system", "https://en.wikipedia.org/wiki/Formal_system#Logical_system");
            load = new Filebased_Btree("Recursively enumerable set", "https://en.wikipedia.org/wiki/Recursively_enumerable_set");
            load = new Filebased_Btree("Primitive recursive function", "https://en.wikipedia.org/wiki/Primitive_recursive_function");
            load = new Filebased_Btree("Computability theory", "https://en.wikipedia.org/wiki/Computability_theory");
            load = new Filebased_Btree("Turing degree", "https://en.wikipedia.org/wiki/Turing_degree");
            load = new Filebased_Btree("Turing reduction", "https://en.wikipedia.org/wiki/Turing_reduction");
            load = new Filebased_Btree("Recursive set", "https://en.wikipedia.org/wiki/Recursive_set");
            load = new Filebased_Btree("Arithmetical hierarchy", "https://en.wikipedia.org/wiki/Arithmetical_hierarchy");
            load = new Filebased_Btree("Hyperarithmetical theory", "https://en.wikipedia.org/wiki/Hyperarithmetical_theory");
            load = new Filebased_Btree("Ordinal notation", "https://en.wikipedia.org/wiki/Ordinal_notation");
            load = new Filebased_Btree("Transfinite induction", "https://en.wikipedia.org/wiki/Transfinite_induction#Transfinite_recursion");
            load = new Filebased_Btree("Cardinality of the continuum", "https://en.wikipedia.org/wiki/Cardinality_of_the_continuum");
            load = new Filebased_Btree("Natural number", "https://en.wikipedia.org/wiki/Natural_number");
            load = new Filebased_Btree("Measurement", "https://en.wikipedia.org/wiki/Measurement");
            load = new Filebased_Btree("Observational error", "https://en.wikipedia.org/wiki/Observational_error");
            load = new Filebased_Btree("Probability theory", "https://en.wikipedia.org/wiki/Probability_theory");
            load = new Filebased_Btree("Problem of points", "https://en.wikipedia.org/wiki/Problem_of_points");
            load = new Filebased_Btree("Joe Allison", "https://en.wikipedia.org/wiki/Joe_Allison_(gridiron_football)");
            load = new Filebased_Btree("Notary public", "https://en.wikipedia.org/wiki/Notary_public_(New_York)");
            load = new Filebased_Btree("Gmina Pyzdry", "https://en.wikipedia.org/wiki/Gmina_Pyzdry");
            load = new Filebased_Btree("FreePBX", "https://en.wikipedia.org/wiki/FreePBX");
            load = new Filebased_Btree("Jorge Barlin","https://en.wikipedia.org/wiki/Jorge_Barlin");
            load = new Filebased_Btree("Autruche", "https://en.wikipedia.org/wiki/Autruche");
            load = new Filebased_Btree("Saattoq", "https://en.wikipedia.org/wiki/Saattoq");
            load = new Filebased_Btree("Burgers vortex", "https://en.wikipedia.org/wiki/Burgers_vortex");
            load = new Filebased_Btree("Cumulant", "https://en.wikipedia.org/wiki/Cumulant");
            load = new Filebased_Btree("Tsivory", "https://en.wikipedia.org/wiki/Tsivory");
            load = new Filebased_Btree("Georgeanna", "https://en.wikipedia.org/wiki/Georgeanna");
            load = new Filebased_Btree("Sinnar", "https://en.wikipedia.org/wiki/Sinnar");
            load = new Filebased_Btree("Ana Ortiz", "https://en.wikipedia.org/wiki/Ana_Ortiz");
            //50 hitting random on wiki at this point/
            //
            /*
            load = new Filebased_Btree("Transient screen", "https://en.wikipedia.org/wiki/Transient_screen");
            load = new Filebased_Btree("Surround video", "https://en.wikipedia.org/wiki/Surround_Video");
            load = new Filebased_Btree("Talent 86", "https://en.wikipedia.org/wiki/Tallet_86");
            load = new Filebased_Btree("Sound", "https://en.wikipedia.org/wiki/Sound_(nautical)");
            load  = new Filebased_Btree("Black Peril", "https://en.wikipedia.org/wiki/Black_Peril");
            load = new Filebased_Btree("Aga siis", "https://en.wikipedia.org/wiki/Aga_siis");
            load = new Filebased_Btree("Strahovice", "https://en.wikipedia.org/wiki/Strahovice");
            load = new Filebased_Btree("Metalloestrogen", "https://en.wikipedia.org/wiki/Metalloestrogen");
            load = new Filebased_Btree("Nian", "https://en.wikipedia.org/wiki/Nian");
            load = new Filebased_Btree("Elkhart Express", "https://en.wikipedia.org/wiki/Elkhart_Express");
            load = new Filebased_Btree("William Allen", "https://en.wikipedia.org/wiki/William_Allen_(governor)");
            load = new Filebased_Btree("List of people from St. Louis", "https://en.wikipedia.org/wiki/List_of_people_from_St._Louis");
            load = new Filebased_Btree("Xinle", "https://en.wikipedia.org/wiki/Xinle_culture");
            load = new Filebased_Btree("Blesok", "https://en.wikipedia.org/wiki/Blesok");
            load = new Filebased_Btree("Philip Smidth", "https://en.wikipedia.org/wiki/Philip_Smidth");
            load = new Filebased_Btree("Kollum", "https://en.wikipedia.org/wiki/Kollum");
            load = new Filebased_Btree("Balally", "https://en.wikipedia.org/wiki/Balally");
            load = new Filebased_Btree("Wang Chong", "https://en.wikipedia.org/wiki/Wang_Chong");
            load = new Filebased_Btree("Formant", "https://en.wikipedia.org/wiki/Formant");
            load = new Filebased_Btree("Brett Gillard","https://en.wikipedia.org/wiki/Brett_Gillard");
            load = new Filebased_Btree("Victoria Valley", "https://en.wikipedia.org/wiki/Victoria_Valley");
            load = new Filebased_Btree("Los Teques", "https://en.wikipedia.org/wiki/Los_Teques");
            load = new Filebased_Btree("Tate C. Page","https://en.wikipedia.org/wiki/Tate_C._Page");
            load = new Filebased_Btree("Franz Wolf","https://en.wikipedia.org/wiki/Franz_Wolf_(SS_officer)");
            load = new Filebased_Btree("Washington California", "https://en.wikipedia.org/wiki/Washington,_California");
            load = new Filebased_Btree("Samuel Kier","https://en.wikipedia.org/wiki/Samuel_Kier");
            load = new Filebased_Btree("Martin Agbaso","https://en.wikipedia.org/wiki/Martin_Agbaso");
            load = new Filebased_Btree("Granville State Forest","https://en.wikipedia.org/wiki/Granville_State_Forest");
            load = new Filebased_Btree("Wrecking","https://en.wikipedia.org/wiki/Wrecking_(Soviet_Union)");
            load = new Filebased_Btree("Athletics in Germany","https://en.wikipedia.org/wiki/Athletics_in_Germany");
            load = new Filebased_Btree("Ran no Yakata","https://en.wikipedia.org/wiki/Ran_no_Yakata");
            load = new Filebased_Btree("Morgan Kelly","https://en.wikipedia.org/wiki/Morgan_Kelly_(economist)");
            load = new Filebased_Btree("Flettner airplane","https://en.wikipedia.org/wiki/Flettner_airplane");
            load = new Filebased_Btree("Wilfred Bion","https://en.wikipedia.org/wiki/Wilfred_Bion");
            load = new Filebased_Btree("Noether inequality","https://en.wikipedia.org/wiki/Noether_inequality");
            load = new Filebased_Btree("Slade on Stage","https://en.wikipedia.org/wiki/Slade_on_Stage");
            load = new Filebased_Btree("Shell theorem", "https://en.wikipedia.org/wiki/Shell_theorem");
            load = new Filebased_Btree("Prince Hachiko","https://en.wikipedia.org/wiki/Prince_Hachiko");
            load = new Filebased_Btree("Ponttarlier Airport","https://en.wikipedia.org/wiki/Pontarlier_Airport");
            load = new Filebased_Btree("Strypi","https://en.wikipedia.org/wiki/Strypi");
            load = new Filebased_Btree("Sibiville","https://en.wikipedia.org/wiki/Sibiville");
            load = new Filebased_Btree("Gilbert Collett","https://en.wikipedia.org/wiki/Gilbert_Collett");
            load = new Filebased_Btree("Fred Sutherland","https://en.wikipedia.org/wiki/Fred_Sutherland");
            load = new Filebased_Btree("Bankapasi","https://en.wikipedia.org/wiki/Bankapasi");
            load = new Filebased_Btree("Pular","https://en.wikipedia.org/wiki/Pular_(volcano)");
            load = new Filebased_Btree("De Bry","https://en.wikipedia.org/wiki/De_Bry");
            load = new Filebased_Btree("Cletus Clark","https://en.wikipedia.org/wiki/Cletus_Clark");
            load = new Filebased_Btree("WBCP","https://en.wikipedia.org/wiki/WBCP");
            load = new Filebased_Btree("Strangers no More","https://en.wikipedia.org/wiki/Strangers_No_More");
            load = new Filebased_Btree("Coca Cola","https://en.wikipedia.org/wiki/Coca_Cola_Corporation");
            load = new Filebased_Btree("Petra Burka","https://en.wikipedia.org/wiki/Petra_Burka");
            load = new Filebased_Btree("Doug Lea","https://en.wikipedia.org/wiki/Doug_Lea");
            //100
            */

        } catch (IOException ex) {//obvious check jic they dont work
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


        load.file_base_btree_size();//load all appropriate files
        load.file_base_btree_height();
        System.out.println(" ");//spacing

        load.load_frequencies();
        load.frequencies_btree_size();
        load.frequencies_btree_height();


        HashMap<String, Integer> freq_btree = load.frequencies_get_btree();
        Kmean_clustering kmean = new Kmean_clustering(10, freq_btree);
        kmean.start_cluster();

        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter Url");
        String url = in.nextLine();

        System.out.println("\nEnter name of url");
        String name = in.nextLine();

        System.out.println();
        //everything below is for the UI url
        try {
            Filebased_Btree load1 = new Filebased_Btree(name,url,0);


            load1.file_base_btree_size2();
            load1.file_base_btree_height2();
            System.out.println(" ");

            load1.load_frequencies2();
            load1.frequencies_btree_size2();
            load1.frequencies_btree_height2();


            HashMap <String ,Integer> freq_btree1 = load1.frequencies_get_btree2();
            Kmean_clustering kmean1 = new  Kmean_clustering(10,freq_btree1);
            kmean1.start_cluster();

            System.out.println(" ");
            System.out.println("Similar key of first dataset");

            load.show_frequencies();


        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

}
