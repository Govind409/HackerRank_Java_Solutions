package Java_Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class strings_practice1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String sub = "";
        for (int i = A.length() - 1; i >= 0; i--) {

            sub += A.charAt(i);

        }
        if (A.equals(sub)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
