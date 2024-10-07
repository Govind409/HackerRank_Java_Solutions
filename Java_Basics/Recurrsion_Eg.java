package Java_Basics;

public class Recurrsion_Eg {
    static int k;

    public static int recurse(int n) {

        return n + recurse(n - 1);

    }

    public static void main(String[] args) {
        int a = recurse(4);
        System.out.println(a);
    }

}
