import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Created by training on 9/2/2014.
 */
public class WriteToFile2 {
    public static void main(String[] args) {
        try {
            Random rand = new Random();
            int randomNum;
            File file = new File("myFile.txt");
            // creates a FileWriter Object
            FileWriter writer = new FileWriter(file);
            // Writes the content to the file
            for (int i = 0; i < 100; i++) {
                randomNum = rand.nextInt(1000);
                writer.write(randomNum + "\n");
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
