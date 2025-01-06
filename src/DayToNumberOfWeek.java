import java.util.Scanner;

/*
Write a program to take name of day and display the
respective number in the screen.
 */
public class DayToNumberOfWeek {
    public static void main(String[] args) {
//taking input from user
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Java Programming Marks");
        String day = in.nextLine();
        switch (day.toLowerCase()) {
            case "sunday":
                System.out.println("1");
                break;

            case "monday":
                System.out.println("2");
                break;

            case "tuesday":
                System.out.println("3");
                break;
            case "wednesday":
                System.out.println("4");
                break;
            case "thursday":
                System.out.println("5");
                break;
            case "friday":
                System.out.println("6");
                break;
            case "saturday":
                System.out.println("7");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        in.close();
    }
}
