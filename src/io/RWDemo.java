package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class RWDemo {
    public static void main(String[] args) {
        try {
            //writing to a file
            FileReader reader = new FileReader("logo.jpg");
            FileWriter writer = new FileWriter("nastlogo.jpg");
            int c;
            while ((c = reader.read()) != -1) {
                writer.write((char) c);
            }
            writer.close();
            reader.close();
            System.out.println("complete");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

