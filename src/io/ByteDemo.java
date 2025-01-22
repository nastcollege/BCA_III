package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ByteDemo {
    public static void main(String[] args) {
        try {
            //taking user input
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Text");
            String userInput=in.nextLine();

            //writing to a file
            FileOutputStream fos = new FileOutputStream("g1.txt");
            fos.write(userInput.getBytes());
            fos.close();
            System.out.println("complete");

            FileInputStream fis = new FileInputStream("g1.txt");
            int c;
            while((c=fis.read())!=-1){
                System.out.print((char)c);
            }
            fis.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
