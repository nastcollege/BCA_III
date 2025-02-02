package multi.level;

public class RacingCar extends Car{

    public void race(){
        System.out.println("I am having more speed than normal car");
    }

    public static void main(String[] args) {
        RacingCar rc = new RacingCar();
        rc.setColor("RED");
        rc.showColor();
        rc.carInfo();
        rc.race();
    }
}
