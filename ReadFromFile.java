package workWithFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by training on 9/2/2014.
 */
public class ReadFromFile2 {
    public static void main(String args[]) throws IOException {

        try{
            String fileName = "myFile.txt";

            BufferedReader file = new BufferedReader(new FileReader(fileName));
            while (file.ready()) {
                String s = file.readLine();
                int number = Integer.parseInt(s);
                if(number > 700) {
                    System.out.println(number);
                }
            }
            file.close();

        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
