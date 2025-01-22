package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharacterDemo {
    public static void main(String[] args) {
        //taking user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Text");
        String userInput = in.nextLine();

        try {
            //writing to a file
            FileWriter writer = new FileWriter("g1rw.txt");
            writer.write(userInput);
            writer.close();
            System.out.println("complete");

            FileReader reader = new FileReader("g1rw.txt");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
