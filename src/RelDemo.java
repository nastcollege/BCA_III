import java.util.Scanner;

public class RelDemo {
    public static void main(String[] args) {
        /*

        Relational Operator
        >,<, >=, <=, !=, ==
         */

        Scanner in = new Scanner(System.in);
        printf("Enter Two number:");
        int first = in.nextInt();
        int second = in.nextInt();

        //>
        boolean r = first > second;
        printf(first + "> " + second + ":" + r);

        //<
        r = first < second;
        printf(first + "< " + second + ":" + r);

        //<=
        r = first <= second;
        printf(first + "<= " + second + ":" + r);

        //>=
        r = first >= second;
        printf(first + ">= " + second + ":" + r);

        //==
        r = first == second;
        printf(first + "== " + second + ":" + r);

        //!=
        r = first != second;
        printf(first + "!= " + second + ":" + r);

        in.close();
    }

    public static void printf(String msg){
        System.out.println(msg);
    }
}
