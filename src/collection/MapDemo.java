package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> contacts=new HashMap<>();
        contacts.put("becomputerhod","9858487105");
        contacts.put("bcahod","9858487106");
        contacts.put("bbahod","9858487107");
        contacts.put("civilhod","9858487108");
        contacts.put("researchhod","9858487109");
        contacts.put("examhod","9858487110");
        contacts.put("principal","9858487111");

        System.out.println("BCA HOD: "+contacts.get("bcahod"));
        System.out.println("Total Record:"+contacts.size());
        System.out.println(contacts);

    }
}
