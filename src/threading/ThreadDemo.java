package threading;

public class ThreadDemo {
    public static void main(String[] args) {
        EvenDemo td = new EvenDemo();
        //convert thread object into thread
        Thread et = new Thread(td);

        OddDemo od = new OddDemo();

        //setting thread priorities
        et.setPriority(Thread.MAX_PRIORITY);
        od.setPriority(Thread.MIN_PRIORITY);

        et.start();
        od.start();

        System.out.println("et: has "+  et.getPriority() + " priority");
        System.out.println("od: has "+  od.getPriority() + " priority");
    }
}
