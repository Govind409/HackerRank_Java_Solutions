package JavaSet.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ContainsAll {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<Integer>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(51);
        data.add(11);
        data.add(81);

        System.out.println("data: " + data);

        Set<Integer> newData = new LinkedHashSet<Integer>();
        newData.add(31);
        newData.add(21);
        newData.add(41);

        System.out.println("data: " + newData);

        System.out.println("\nDoes data contains newData?: " + data.containsAll(newData));
    }

}
