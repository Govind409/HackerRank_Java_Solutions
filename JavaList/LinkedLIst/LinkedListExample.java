package JavaList.LinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        System.out.println(al);
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        al.add(1, "Govind");
        System.out.println("After adding at index position " + al);
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Charu");
        list1.add("Gopal");
        list1.add("Preethi");
        list1.add("Varsha");
        al.addAll(list1);
        System.out.println(al);
        al.addAll(0, list1);
        System.out.println(al);

    }

}
