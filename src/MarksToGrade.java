import java.util.Scanner;

/*
Write a program to take java programming marks as input
display the respective Grade based on PU grading system.

 */
public class MarksToGrade {
    public static void main(String[] args) {
        //taking input from user
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Java Programming Marks");
        double marks = in.nextInt();
        if(marks>=90){
            System.out.println("A");
        }else if(marks>=85 && marks<90){
            System.out.println("A-");
        }else if(marks>=80 && marks<95){
            System.out.println("B+");
        }else if(marks>=75 && marks<80){
            System.out.println("B");
        }else if(marks>=70 && marks<75){
            System.out.println("B-");
        }else if(marks>=65 && marks<70){
            System.out.println("C+");
        }else if(marks>=60 && marks<65){
            System.out.println("C");
        }else if(marks>=55 && marks<60){
            System.out.println("C-");
        }else if(marks>=50 && marks<55){
            System.out.println("D+");
        }else if(marks>=45 && marks<50){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        in.close();
    }
}
