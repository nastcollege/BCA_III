package threading;

import com.sun.security.jgss.GSSUtil;

import java.io.FileReader;

public class FileReadDemo extends Thread{
    @Override
    public void run() {
        try{

            FileReader reader = new FileReader("C:\\Users\\acer\\IdeaProjects\\BCA_III\\src\\threading\\FiboDemo.java");
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
                Thread.sleep(200);
            }
            reader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileReadDemo readDemo= new FileReadDemo();
        readDemo.start();
    }
}
