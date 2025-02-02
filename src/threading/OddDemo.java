package threading;

public class OddDemo extends Thread{
    @Override
    public void run() {
        for(int o=1;o<10;o+=2){
            System.out.println("O: "+o);
        }
    }
}
