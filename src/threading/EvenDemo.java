package threading;

public class EvenDemo implements  Runnable{
    @Override
    public void run() {
        for(int e=10;e>=2;e-=2){
            System.out.println("E: "+e);
        }
    }
}
