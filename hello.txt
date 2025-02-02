package threading;

public class FiboDemo extends Thread {

    @Override
    public void run() {

        int a = 0, b = 1, c;
        System.out.println(a);
        while (true) {
            c = a + b;
            if (c >= 1000) {
                break;
            }
            System.out.println(c);
            a = b;
            b = c;

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        FiboDemo t = new FiboDemo();
        t.start();
        // new FiboDemo().start();

    }
}
