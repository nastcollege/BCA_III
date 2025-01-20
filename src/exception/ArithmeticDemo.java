package exception;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c = a / b;
            System.out.println("Division of " + a + " / " + b + " is:" + c);
        }catch (ArithmeticException ae){
            System.out.println("Please supply value of b greater than 0");
        }


        try{

        }catch (Exception e){

        }finally {
            System.out.println("I am ok");
        }
    }
}
