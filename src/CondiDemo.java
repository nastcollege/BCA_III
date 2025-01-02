import java.util.Scanner;

public class CondiDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two number:");
        int first = in.nextInt(); //10
        int second = in.nextInt(); //20

        int resualt=first>second?first:second;
        System.out.println(resualt);

        in.close();
    }
}
