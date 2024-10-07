package OOPS;

public class car {
    int weight = 150;
    String color = "Red";

    public static void Drive(int speed) {
        System.out.println("Diving in " + speed + "speed");
    }

    void Carcolor() {
        System.out.println("The car is repainted from to " + color);
    }

    void Break() {
        System.out.println("The car has Stopped");
    }

}
