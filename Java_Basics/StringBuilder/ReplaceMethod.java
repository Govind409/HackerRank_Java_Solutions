package Java_Basics.StringBuilder;

public class ReplaceMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);// prints HJavalo

    }

}
