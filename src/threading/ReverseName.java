package threading;

import java.util.Scanner;

public class ReverseName implements Runnable {
    private String name = "";

    public ReverseName(String text) {
        this.name = text;
    }

    @Override
    public void run() {
        for (int i = name.length()-1; i >=0; i--) {
            System.out.print(name.charAt(i) + " ");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Name");
            String text = in.nextLine();

            ReverseName us = new ReverseName(text);
            Thread t = new Thread(us);
            t.start();
        }
    }