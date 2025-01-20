package exception;

public class ArrayBound {
    public static void main(String[] args) {
        int marks[] ={98,78,95,64,45};
        try {
            System.out.println(marks[5]);
            System.out.println(marks[0]);
            System.out.println(marks[1]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid element "+e.getMessage());
        }finally {
            System.out.println("I am ok");
        }
    }
}
