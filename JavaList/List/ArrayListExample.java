package JavaList.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");// Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Printing the arraylist object
        System.out.println("Printing the arraylist object");
        System.out.println(list);
        System.err.println("Traversing list through Iterator");
        @SuppressWarnings("rawtypes")
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        // Traversing list through for-each loop
        System.out.println("Traversing list through for-each loop");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        // accessing the element
        System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
                                                                // from 0
        // changing the element
        list.set(1, "Dates");
        // Traversing list
        for (String fruit : list)
            System.out.println(fruit);
        // Sorting the list
        Collections.sort(list);
        System.out.println(list);
        // Traversing list through the for-each loop
        for (String fruit : list)
            System.out.println(fruit);

    }

}
