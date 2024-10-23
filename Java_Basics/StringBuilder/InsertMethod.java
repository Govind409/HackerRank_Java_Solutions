package Java_Basics.StringBuilder;

public class InsertMethod {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("\sHello");
        System.out.println(sb);
        sb.insert(0, "Govind");
        System.out.println(sb);
    }

}
