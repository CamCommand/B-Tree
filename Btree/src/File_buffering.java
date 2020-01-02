import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class File_buffering {

    // fixed size buffer 
    int bufferSize = 8 * 1024;
    BufferedWriter bw;
    FileWriter fw;


    public File_buffering(String filename, String content) {
        try {
            fw = new FileWriter("files/" + filename + ".txt");
            bw = new BufferedWriter(fw, bufferSize);
            bw.write(content);
        } catch (IOException ex) {
            Logger.getLogger(File_buffering.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
