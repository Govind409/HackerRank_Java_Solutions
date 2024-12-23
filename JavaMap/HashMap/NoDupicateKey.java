package JavaMap.HashMap;

import java.util.HashMap;
import java.util.Map;

public class NoDupicateKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
        map.put(1, "Mango"); // Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        map.put(1, "Orange");// trying to put duplicate key

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
