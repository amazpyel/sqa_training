import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: pylkevych
 * Date: 9/8/14
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class WriteReadFile {
    public static void main(String[] args) {
        WriteReadFile wrf = new WriteReadFile();
        wrf.writeToFile();
        String fileName = "myFile.txt";
        wrf.readFromFile(fileName);
    }

    private void writeToFile() {
        try {
            Random rand = new Random();
            int randomNum;
            int min = 100;
            int max = 999;
            File file = new File("myFile.txt");
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < 100; i++) {
                randomNum = rand.nextInt((max - min) + 1) + min;
                writer.write(randomNum + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void readFromFile(String fileName) {
        try{
            BufferedReader file = new BufferedReader(new FileReader(fileName));
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            while (file.ready()) {
                String s = file.readLine();
                int number = Integer.parseInt(s);
                if(number >= 900) {
                    arrayList.add(number);
                }

            }
            file.close();
            int sum = 0;
            System.out.println("Array is:");
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
                sum += arrayList.get(i);
            }
            System.out.println("Size is " + arrayList.size());
            int avg = sum / arrayList.size();
            if(avg > 950) {
                System.out.println("Test failed");
            } else {
                System.out.println("Test passed");
            }
            System.out.println("Current average = " + avg);

        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
