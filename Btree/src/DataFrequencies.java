
import java.util.HashMap;



public class DataFrequencies {

    // static will help to check for other data also not
    // for individual it will check for all pages one data frequences
    static HashMap <String ,Integer> frequencies = new    HashMap <String ,Integer> ();
    HashMap <String ,Integer> frequencies2 = new    HashMap <String ,Integer> ();

    String Data;

    frequencies_BTree<String, Integer > freq_btree = new frequencies_BTree<String, Integer >();


    public DataFrequencies(String Data){

        this.Data =Data;

    }

    public DataFrequencies getfrequencies_class(){

        return this;
    }

    public void calculate_frequencies(){

        String []parts = Data.split(" ");

        for(int i =0 ; i < parts.length;i++){

            if(frequencies.containsKey(parts[i])  && !parts[i].equals(" ") ){

                int count = frequencies.get(parts[i]);
                count++;
                frequencies.put(parts[i], count);
            }
            else{
                frequencies.put(parts[i], 0);
            }
        }

    }


    public void calculate_frequencies2(){

        String []parts = Data.split(" ");

        for(int i =0 ; i < parts.length;i++){

            if(frequencies2.containsKey(parts[i])  && !parts[i].equals(" ") ){

                int count = frequencies2.get(parts[i]);
                count++;
                frequencies2.put(parts[i], count);
            }
            else{
                frequencies2.put(parts[i], 0);
            }
        }

    }


    public HashMap <String ,Integer> get_frequencies(){
        return frequencies;
    }


    public HashMap <String ,Integer> get_frequencies2(){
        return frequencies2;
    }
}
    

