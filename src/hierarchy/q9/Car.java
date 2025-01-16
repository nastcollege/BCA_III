package hierarchy.q9;

public class Car extends Vehicle{


    @Override
    public void fuelEfficiency() {
        System.out.println("Car has 25KM/Ltr");
    }

    @Override
    public void distanceTraverse() {
        System.out.println("Car passed 300km");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Car has max of 160K/hrs");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.distanceTraverse();
        car.fuelEfficiency();
        car.maxSpeed();
    }

}
