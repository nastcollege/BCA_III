package exception;

public class CustomDemo {
    public static void main(String[] args) {
        try{
            smallestNumberMethod(0.01);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void smallestNumberMethod(double n) throws CustomException{

        if(n<0.0000001){
            throw new CustomException("Too Small");
        }else{
            System.out.println("Good Number: "+n);
        }
    }
}
