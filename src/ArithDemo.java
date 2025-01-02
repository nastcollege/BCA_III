import java.util.Scanner;

import static javax.management.Query.div;

public class ArithDemo {
   static int firstNumber, secondNumber;
   static Scanner in;
    public static void main(String[] args) {
        System.out.println("1. Addition");
        System.out.println("2. Subtrction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        in = new Scanner(System.in);
        int choice = in.nextInt();

        switch(choice){
            case 1:
                add();
                break;
            case 2:
               sub();
                break;

            case 3:
                mul();
                break;

            case 4:
                div();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

    private static void div() {
        System.out.println("Enter two number");
        firstNumber= in.nextInt();
        secondNumber= in.nextInt();
        System.out.println("Division of "+ firstNumber
                + " and "+secondNumber +" is: "
                +(firstNumber/secondNumber));
    }

    public static void mul() {
        System.out.println("Enter two number");
        firstNumber= in.nextInt();
        secondNumber= in.nextInt();
        System.out.println("Product of "+ firstNumber
                + " and "+secondNumber +" is: "
                +(firstNumber*secondNumber));
    }

    public static  void add(){
        System.out.println("Enter two number");
        firstNumber= in.nextInt();
        secondNumber= in.nextInt();
        System.out.println("Sum of "+ firstNumber
                + " and "+secondNumber +" is: "
                +(firstNumber+secondNumber));
    }

    public static void sub(){
        System.out.println("Enter two number");
        firstNumber= in.nextInt();
        secondNumber= in.nextInt();
        System.out.println("Difference of "+ firstNumber
                + " and "+secondNumber +" is: "
                +(firstNumber-secondNumber));
    }
}
