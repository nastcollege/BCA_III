package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of 10 student");
        Set<String> names = new HashSet<>();
        for(int i=0;i<10;i++){
            names.add(scan.next());
        }
        System.out.println("Total Unique item: "+names.size());
        System.out.println(names);
        scan.close();
    }
}
