import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;
import jxl.write.biff.RowsExceededException;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by training on 9/2/2014.
 */
public class Write2Excel2 {
    public static void main(String[] args) {

        try {
            Random rand = new Random();
            int randomNum;
            File exlFile = new File("WriteToExcel2.xls");
            WritableWorkbook writableWorkbook = Workbook.createWorkbook(exlFile);

            WritableSheet writableSheet = writableWorkbook.createSheet("MySheet1", 0);
            for (int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    randomNum = rand.nextInt(100);
                    Number num = new Number(i, j, randomNum);
                    writableSheet.addCell(num);
                }
            }

            writableWorkbook.write();
            writableWorkbook.close();
            System.out.println("File was created");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (RowsExceededException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
    }
}
