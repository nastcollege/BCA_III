import java.util.Arrays;

public class Addition {

    public void sum() {
        System.out.println("Sum of 4 and 5 is: " + (4 + 5));
    }

    public void sum(int a, int b) {
        System.out.println("Sum of  " + a + " and " + b + " is: " + (a + b));
    }

    public void sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("Sum:" + sum);
    }

    public void sum(double m, double n) {
        System.out.println("Sum of  " + m + " and " + n + " is: " + (m + n));
    }

    public void sum(int m, double n) {
        System.out.println("Sum of  " + m + " and " + n + " is: " + (m + n));
    }

    public void sum(double m, int n) {
        System.out.println("Sum of  " + m + " and " + n + " is: " + (m + n));
    }

    public void sum(double... a) {
        int sum = 0;
        for (double i : a) {
            sum += i;
        }
        System.out.println("Sum:" + sum);
    }

    public void sum(String n1, String n2) {
        System.out.println(n1 + n2);
    }

    public static void main(String[] args) {
        Addition a = new Addition();

        //default method
        a.sum();

        int[] intArray = {10, 12, 15, 60, 70, 32, 55};
        //parameterised with n element
        a.sum(intArray);

        a.sum(10,20);
        a.sum(10.2,20.3);
        a.sum("50","40");

        double[] doubleArray = {10.2, 12.1, 15.4, 60.5, 70.0, 32.2, 5.5};
        a.sum(doubleArray);

        a.sum(10,33.3);
        a.sum(44.4,21);
    }
}

