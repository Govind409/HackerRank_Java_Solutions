package JavaSet.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashCode {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<Integer>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(51);
        data.add(11);
        data.add(81);
        System.out.println("Set: " + data);
        System.out.println("Hash code of the set is: " + data.hashCode());
    }

}
