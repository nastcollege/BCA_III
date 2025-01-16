package hierarchy.q9;

public class Truck extends Vehicle{

    @Override
    public void fuelEfficiency() {
        System.out.println("Truck has 30KM/Ltr");
    }

    @Override
    public void distanceTraverse() {
        System.out.println("Truck passed 500km");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Truck has max of 70K/hrs");
    }



    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.distanceTraverse();
        truck.fuelEfficiency();
        truck.maxSpeed();
    }
}
