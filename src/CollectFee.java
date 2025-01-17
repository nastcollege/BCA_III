public class CollectFee {
    public static void main(String[] args) {
       //object create
        PayFee fee = new PayFee();

        //method call
        fee.setStudentInfo("Lokendra", 20);
        fee.setFee(50000);

        //method call
        fee.displayStudentInfo();
        fee.displayFee();
    }
}
