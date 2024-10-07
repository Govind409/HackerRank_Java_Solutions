package OOPS;

import java.util.Scanner;

public class interface_problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        MyCaluclator myobj = new MyCaluclator();
        Class<?> clazz = MyCaluclator.class;
        Class<?>[] I = clazz.getInterfaces();
        System.out.print("I implemented: ");
        for (Class<?> iface : I) {
            System.out.println(iface.getName());
        }
        myobj.divisor_sum(n);

    }

}

/**
 * InnerInterface
 */
interface AdvancedArithmetic {
    public void divisor_sum(int n);

}

class MyCaluclator implements AdvancedArithmetic {
    int c;

    @Override
    public void divisor_sum(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c = i + c;
            }

        }
        System.out.println(c);

    }

}