package JavaList.LinkedLIst;

import java.util.LinkedList;

public class AddElemets {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Initial list of elements: " + ll);
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("After invoking add(E e) method: " + ll);
        // Adding an element at the specific position
        ll.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: " + ll);
        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        // Adding second list elements to the first list
        ll.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + ll);
        LinkedList<String> ll3 = new LinkedList<String>();
        ll3.add("John");
        ll3.add("Rahul");
        // Adding second list elements to the first list at specific position
        ll.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + ll);
        // Adding an element at the first position
        ll.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: " + ll);
        // Adding an element at the last position
        ll.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: " + ll);
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll.poll());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll);

    }

}
