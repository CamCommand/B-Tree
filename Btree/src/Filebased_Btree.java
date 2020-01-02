import java.io.IOException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Filebased_Btree {

    static BTree<String, String> filebase_btree = new BTree<String, String>();
    static frequencies_BTree<String, Integer> freq_btree = new frequencies_BTree<String, Integer>();
    String url;
    BTree<String, String> filebase_btree2 = new BTree<String, String>();
    frequencies_BTree<String, Integer> freq_btree2 = new frequencies_BTree<String, Integer>();
    DataFrequencies ddf;


    public Filebased_Btree(String filename, String url) throws IOException {


        Document doc = (Document) Jsoup.connect(url).get();
        String content = doc.getElementById("bodyContent").outerHtml();
        // file based btree
        File_buffering file = new File_buffering(filename, content);
        filebase_btree.put(filename, url);

        // calculate frequencies
        DataFrequencies df = new DataFrequencies(content);
        df.calculate_frequencies();
//System.out.println(content);

    }


    public Filebased_Btree(String filename, String url, int i) throws IOException {


        Document doc = (Document) Jsoup.connect(url).get();
        String content = doc.getElementById("bodyContent").outerHtml();
        // file based btree
        File_buffering file = new File_buffering(filename, content);
        filebase_btree2.put(filename, url);

        // calculate frequencies
        ddf = new DataFrequencies(content);
        ddf.calculate_frequencies2();

//System.out.println(content);

    }


    public void file_base_btree_size() {

        System.out.println("File based BTree size:  " + filebase_btree.size());

    }


    public void file_base_btree_height() {

        System.out.println("File based BTree Height:  " + filebase_btree.height());

    }


    public void file_base_btree_size2() {

        System.out.println("File based BTree size:  " + filebase_btree2.size());

    }


    public void file_base_btree_height2() {

        System.out.println("File based BTree Height:  " + filebase_btree2.height());

    }


    // load frequencies
    public void load_frequencies() {

        DataFrequencies df = new DataFrequencies("");

        HashMap<String, Integer> frequencies = df.get_frequencies();

        // load to frequencies to btree
        for (String i : frequencies.keySet()) {
            freq_btree.put(i, frequencies.get(i));
        }
    }

    public void load_frequencies2() {

        HashMap<String, Integer> frequencies = ddf.get_frequencies2();

        // load to frequencies to btree
        for (String i : frequencies.keySet()) {

            freq_btree2.put(i, frequencies.get(i));

        }
    }


    public HashMap<String, Integer> frequencies_get_btree() {

        DataFrequencies df = new DataFrequencies("");
        HashMap<String, Integer> frequencies = df.get_frequencies();

        return frequencies;
    }


    public HashMap<String, Integer> frequencies_get_btree2() {
        HashMap<String, Integer> frequencies = ddf.get_frequencies();
        return frequencies;
    }


    public void frequencies_btree_size() {
        System.out.println("Frequencies BTree size:  " + freq_btree.size());

    }


    public void frequencies_btree_height() {

        System.out.println("Frequencies BTree Height:  " + freq_btree.height());
    }


    public void frequencies_btree_size2() {

        System.out.println("Frequencies BTree size:  " + freq_btree2.size());
    }


    public void frequencies_btree_height2() {
        System.out.println("Frequencies BTree Height:  " + freq_btree2.height());
    }


    public void show_frequencies() {

        System.out.println("Frequencies of Data \n");
        DataFrequencies df = new DataFrequencies("");
        HashMap<String, Integer> frequencies = df.get_frequencies();

        for (String i : frequencies.keySet()) {
            if (frequencies.get(i) > 50) {
                System.out.println(i + " = " + frequencies.get(i));
            }
        }

    }


}
