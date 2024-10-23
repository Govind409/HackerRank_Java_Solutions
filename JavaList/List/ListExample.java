package JavaList.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Grapes");
        list.add("Apple");
        System.out.println(list);
        for (String fruit : list) {
            System.out.println(fruit);

        }
        System.out.println(list.get(1));
    }

}
