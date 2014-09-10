package HW2;

import java.io.*;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created with IntelliJ IDEA.
 * Author: Oleksandr Pylkevych o.pylkevych@gmail.com
 * Date: 9/8/14
 * Time: 7:19 PM
 * <p/>
 * Description:
 * - The program generates a lot of text files in a single folder
 * (more than 100) and in the same folder creates an archive file.
 */
public class Archive {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("test.zip");
            ZipOutputStream zos = new ZipOutputStream(fos);

            String path = "/home/pylkevych/SQA_training/HomeWork_2/";
            String files;
            File folder = new File(path);
            File[] listOfFiles = folder.listFiles();

            genTextFiles(100);

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    files = listOfFiles[i].getName();
                    if (files.toLowerCase().endsWith(".txt")) {
                        addToZipFile(listOfFiles[i], zos);
                    }
                }
            }
            zos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void addToZipFile(File file, ZipOutputStream zos) throws IOException {
        System.out.println("Writing '" + file.getName() + "' to zip file");

        FileInputStream fis = new FileInputStream(file);
        ZipEntry zipEntry = new ZipEntry(file.getName());
        zos.putNextEntry(zipEntry);
        zos.setLevel(Deflater.BEST_SPEED);

        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }
        zos.closeEntry();
        fis.close();
    }

    public static void genTextFiles(int count) {
        try {
            for (int i = 1; i <= count; i++) {
                File file = new File(i + ".txt");
                FileWriter writer = new FileWriter(file);
                writer.flush();
                writer.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
