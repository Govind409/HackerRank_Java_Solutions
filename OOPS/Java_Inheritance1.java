package OOPS;

public class Java_Inheritance1 {
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.walk();
        bird.fly();
        bird.sing();

    }

}

class Animal {
    public static void walk() {
        System.out.println("I am walking");
    }

}

class Bird extends Animal {
    public static void fly() {
        System.out.println("I am flying");
    }

    public static void sing() {
        System.out.println("I am singing");
    }
}
