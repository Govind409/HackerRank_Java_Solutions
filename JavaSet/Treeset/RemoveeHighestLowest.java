package JavaSet.Treeset;

import java.util.TreeSet;

public class RemoveeHighestLowest {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        TreeSet<Integer> set1 = new TreeSet<Integer>(set);

        System.out.println("Lowest Value using set.pollFirst(): " + set.pollFirst());
        System.out.println("Highest Value set.pollLast(): " + set.pollLast());
        System.out.println("HeadSet(24): " + set1.headSet(24));
        System.out.println("tailSet(24): " + set1.tailSet(24));
        System.out.println(set1.first());
        System.out.println(set1.last());
    }

}
