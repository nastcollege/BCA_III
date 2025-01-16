package hierarchy;

public class Aeroplane extends Engine{

    @Override
    public void run() {
        System.out.println("Aeroplane has :600KM/HRS Speed");
    }

    public void takeAway(){
        System.out.println("Takeaway Successfully...");
    }
    public void land(){
        System.out.println("Landed Successfully...");
    }
    public static void main(String[] args) {
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.on();
        aeroplane.takeAway();
        aeroplane.run();
        aeroplane.land();
        aeroplane.off();
    }
}
