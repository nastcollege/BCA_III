package threading;

import java.util.Scanner;

public class UserInDemo extends Thread {
    private String text = "";

    public UserInDemo(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Text");
            String text = in.nextLine();
            UserInDemo us = new UserInDemo(text);
            us.start();
        }
    }