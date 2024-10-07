package OOPS;

import java.util.Scanner;

public class CarMainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        car c = new car();
        while (true) {
            System.out.println("Enter 0 : Off 1: Repaint 2: drive 3: break");
            System.out.println("Enter your input");
            int input = scan.nextInt();

            switch (input) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Enter the New color for the car: ");
                    c.color = scan.next();
                    c.Carcolor();
                    break;
                case 2:
                    System.out.print("Enter the driving speed: ");
                    int speed = scan.nextInt();
                    car.Drive(speed);
                    break;
                case 3:
                    c.Break();
                    break;
                default:
                    System.out.print("Invalid Input");
                    break;
            }
        }

    }

}
