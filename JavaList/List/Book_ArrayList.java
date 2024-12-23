package JavaList.List;

import java.util.*;

class Book {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}

public class Book_ArrayList {
    public static void main(String[] args) {
        try {
            // Creating list of Books
            List<Book> list = new ArrayList<Book>();
            // Creating Books
            Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
            Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "McGraw Hill", 4);
            Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
            // Adding Books to list
            list.add(b1);
            list.add(b2);
            list.add(b3);
            // raversing list
            for (Book b : list) {
                System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
