package JavaSet.Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveAll {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<Integer>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(51);
        data.add(11);
        data.add(81);
        System.out.println("data: " + data);
        ArrayList<Integer> newData = new ArrayList<Integer>();
        newData.add(91);
        newData.add(71);
        newData.add(81);
        System.out.println("NewData: " + newData);
        data.removeAll(newData);
        System.out.println("data after removing Newdata elements : " + data);

    }

}
