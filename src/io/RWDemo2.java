package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class RWDemo2 {
    public static void main(String[] args) {
        try {
            //writing to a file
            FileInputStream fis = new FileInputStream("logo.jpg");
            FileOutputStream fos = new FileOutputStream("logo2.jpg");
            int c;
            while ((c = fis.read()) != -1) {
                fos.write((char) c);
            }
            fos.close();
            fis.close();
            System.out.println("complete");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
