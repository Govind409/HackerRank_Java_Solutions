package OOPS;

public class Java_Inheritance2 {
    public static void main(String[] args) {
        Adder A = new Adder();
        A.parentClassName();
        System.out.println(A.add(20, 40));
    }

}

class Arthimetic {
    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}

class Adder extends Arthimetic {
    public void parentClassName() {
        String parentClass = this.getClass().getSuperclass().getName();
        System.out.println("My superclass is:" + parentClass);
    }
}
