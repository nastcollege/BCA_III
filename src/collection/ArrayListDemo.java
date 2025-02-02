package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int c = 0; c < 10; c++) {
            cities.add(in.nextLine());
        }
        System.out.println("Total Item: " + cities.size());
        System.out.println(cities);
        in.close();
    }
}
