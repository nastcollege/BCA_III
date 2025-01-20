package exception;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int marks[] ={98,78,95,64,45};
        int a=10;
        int b=0;
        try {
            //for arithmetic
            int c = a / b;
            System.out.println("Division of " + a + " / " + b + " is:" + c);

            //for index
            System.out.println(marks[5]);
            System.out.println(marks[0]);
            System.out.println(marks[1]);

        }catch (ArithmeticException ae){
            System.out.println("Please supply value of b greater than 0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid element "+e.getMessage());
        }catch (Exception e){
            System.out.println("Invalid Info, Contact to Admin"+e.getMessage());
        }finally {
            System.out.println("I am ok");
        }
    }
}
