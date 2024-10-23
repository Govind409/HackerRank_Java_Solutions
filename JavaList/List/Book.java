package JavaList.List;

import java.util.ArrayList;
import java.util.List;

class BookList {
    int id;
    String name, author, publisher;
    int quantity;

    public BookList(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class Book {
    public static void main(String[] args) {
        // Creating list of Books
        List<BookList> list = new ArrayList<BookList>();
        // Creating Books
        BookList b1 = new BookList(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        BookList b2 = new BookList(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
        BookList b3 = new BookList(103, "Operating System", "Galvin", "Wiley", 6);
        // Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        // Traversing list
        for (BookList b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}