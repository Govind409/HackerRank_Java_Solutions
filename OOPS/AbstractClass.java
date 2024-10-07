package OOPS;

import java.util.Scanner;

class AbstractClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        subClass book = new subClass();
        book.settitle(s);
    }
}

abstract class Book {

    abstract void settitle(String s);

}

class subClass extends Book {
    void settitle(String s) {
        System.out.println("The title is: " + s);
    }

}