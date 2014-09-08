import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.Number;
import jxl.write.biff.RowsExceededException;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: pylkevych
 * Date: 9/8/14
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class WriteReadExcel {
    public static void main(String[] args) {
        WriteReadExcel wre = new WriteReadExcel();
        String fileName = "file.xls";
        wre.writeToExcelFirst(fileName);
        String[] testResult = wre.readFromExcel(fileName);
        wre.writeToExcelSecond(fileName, testResult);
    }

    private void writeToExcelFirst(String fileName) {
        try {
            Random rand = new Random();
            int randomNum;
            int min = 10;
            int max = 99;
            File exlFile = new File(fileName);
            WritableWorkbook writableWorkbook = Workbook.createWorkbook(exlFile);
            WritableSheet writableSheet = writableWorkbook.createSheet("MySheet1", 0);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    randomNum = rand.nextInt((max - min) + 1) + min;
                    Number num = new Number(i, j, randomNum);
                    writableSheet.addCell(num);
                }
            }
            writableWorkbook.write();
            writableWorkbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RowsExceededException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
    }

    private String[] readFromExcel(String fileName) {
        String[] testResult = new String[10];
        try {
            String pass = "Pass";
            String fail = "Fail";
            int[][] arrayInts = new int[10][10];
            Workbook wrk1 = Workbook.getWorkbook(new File(fileName));
            Sheet sheet1 = wrk1.getSheet(0);
            int sum = 0;
            int count = 0;
            int avg;
            for (int row = 0; row < 10; row++) {
                for (int column = 0; column < 10; column++) {
                    Cell colArrow1 = sheet1.getCell(row, column);
                    String str_colArrow1 = colArrow1.getContents();
                    arrayInts[row][column] = Integer.parseInt(str_colArrow1);
                    System.out.print(arrayInts[row][column] + " ");
                    sum += arrayInts[count][column];
                }
                avg = sum / arrayInts[row].length;
                System.out.print("average = " + avg);
                if (avg >= 50) {
                    testResult[row] = fail;
                    System.out.print(", " + fail);
                } else {
                    testResult[row] = pass;
                    System.out.print(", " + pass);
                }
                count++;
                sum = 0;
                System.out.println();
            }
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return testResult;
    }

    private void writeToExcelSecond(String fileName, String[] testResult) {
        try {
            Workbook workbook = Workbook.getWorkbook(new File(fileName));
            WritableWorkbook copy = Workbook.createWorkbook(new File("temp.xls"), workbook);
            WritableSheet sheet = copy.getSheet(0);

            for (int i = 0; i < 10; i++) {
                String result = testResult[i];
                Label label = new Label(10, i, result);
                sheet.addCell(label);
            }
            copy.write();
            copy.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RowsExceededException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }
}
