package JavaSet.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class size {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<Integer>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(91);
        data.add(71);
        data.add(81);
        System.out.println("data: " + data);
        System.out.println("size of the data is : " + data.size());
    }

}
