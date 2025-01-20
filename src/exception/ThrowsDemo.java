package exception;

public class ThrowsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        int marks[] = {99, 89, 79, 58};
        try {
            divide(a, b);//for arithmetic
            indexBounds(marks); //index bounds
        } catch (ArithmeticException ae) {
            System.out.println("Please supply value of b greater than 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid element " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Info, Contact to Admin" + e.getMessage());
        } finally {
            System.out.println("I am finally block");
        }
    }

    public static void divide(int n1, int n2) throws ArithmeticException {
        int division = n1 / n2;
        System.out.println("Division of " + n1 + " / " + 2 + " is:" + division);
    }

    public static void indexBounds(int marks[]) throws ArrayIndexOutOfBoundsException {
        System.out.println(marks[5]);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
    }
}
