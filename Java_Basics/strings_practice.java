package Java_Basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class strings_practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        String smallest = "";
        String largest = "";
        String sub = "";
        int lex;
        ArrayList<String> cars = new ArrayList<String>();

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k
        for (int i = 0; i < s.length() + 1; i += 1) {
            if (k + i > s.length()) {
                break;
            } else {
                sub = s.substring(i, k + i);
                cars.add(sub);
            }

        }
        cars.sort(null);
        System.out.println(cars);
        smallest = cars.get(0);
        largest = cars.get(cars.size() - 1);
        System.out.println(smallest);
        System.out.println(largest);

    }

}
