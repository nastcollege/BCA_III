import java.util.Scanner;

/*
Write a program to take a number input from user and determine
the input is odd or even.
 */
public class OddEven {
    public static void main(String[] args) {
        //taking input from user
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even!");
        } else {
            System.out.println(num + " is Odd!");
        }
        in.close();
    }
}


