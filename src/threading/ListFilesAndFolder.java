package threading;

import java.io.File;

public class ListFilesAndFolder extends Thread {
    @Override
    public void run() {

        File[] files = new File(".").listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                File[] files2 = new File(f.getAbsolutePath()).listFiles();
                for (File f2 : files2) {
                    System.out.println("\t->"+f2.getName());
                }
            }else{
                System.out.println("->"+f.getName());
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public static void main(String[] args) {
    new ListFilesAndFolder().start();
}
}
