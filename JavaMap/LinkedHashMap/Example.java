package JavaMap.LinkedHashMap;

import java.util.*;

public class Example {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(104, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println(hm);

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // Fetching key
        System.out.println("Keys: " + hm.keySet());
        // Fetching value
        System.out.println("Values: " + hm.values());
        // Fetching key-value pair
        System.out.println("Key-Value pairs: " + hm.entrySet());

        // remove
        hm.remove(102);
        System.out.println("After invoking remove() method: " + hm);
    }
}
