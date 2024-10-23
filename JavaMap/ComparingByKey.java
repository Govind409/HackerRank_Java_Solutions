package JavaMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparingByKey {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(106, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        // Returns a Set view of the mappings contained in this map
        map.entrySet()
                .stream()
                // Returns a sequential Stream with this collection as its source

                // Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey());
        // Performs an action for each element of this stream
        // .forEach(System.out::println);
        map.entrySet()
                .stream()
                // Sorting in descending order
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

    }

}
