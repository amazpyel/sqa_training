import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

/**
 * Created by training on 9/2/2014.
 */
public class ReadFromExcel2 {
    public static void main(String[] args) {

        try {

            //Create a workbook object from the file at specified location.
            //Change the path of the file as per the location on your computer.
            Workbook wrk1 =  Workbook.getWorkbook(new File("WriteToExcel2.xls"));

            //Obtain the reference to the first sheet in the workbook
            Sheet sheet1 = wrk1.getSheet(0);
            int[] arrayInts = new int[10];
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    Cell colArow1 = sheet1.getCell(i, j);
                    String str_colArow1 = colArow1.getContents();
                    arrayInts[i] = Integer.parseInt(str_colArow1);
//                    System.out.print(arrayInts[i] + " ");
                    sum += arrayInts[i];
                }
            }
            if(sum / arrayInts.length >= 5) {
                System.out.println("Test result = True");
            } else System.out.println("Test result = False");


        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
