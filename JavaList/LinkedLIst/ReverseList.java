package JavaList.LinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Anuj");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Virat");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Amit");
        System.out.println(ll);
        Iterator itr = ll.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }

}
