package hierarchy.q9;

public class Motorcycle  extends Vehicle{


    @Override
    public void fuelEfficiency() {
        System.out.println("Motorcycle has 45KM/Ltr");
    }

    @Override
    public void distanceTraverse() {
        System.out.println("Motorcycle passed 200km");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Motorcycle has max of 50K/hrs");
    }


    public static void main(String[] args) {
        Motorcycle car = new Motorcycle();
        car.distanceTraverse();
        car.fuelEfficiency();
        car.maxSpeed();
    }
}
