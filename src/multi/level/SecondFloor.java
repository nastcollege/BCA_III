package multi.level;

public class SecondFloor extends FirstFloor{

    public void secondFloorInfo(){
        System.out.println("You are in Second Floor!!!");
    }

    public static void main(String[] args) {
        SecondFloor secondFloor = new SecondFloor();
        secondFloor.groundFloorInfo();
        secondFloor.firstFloorInfo();
        secondFloor.secondFloorInfo();
    }
}
