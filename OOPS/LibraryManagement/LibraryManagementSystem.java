package OOPS.LibraryManagement;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter no.of Books: ");
        int numberOfBooks = scan.nextInt();
        scan.nextLine();
        Book[] books = new Book[numberOfBooks];
        for (int i = 0; i < numberOfBooks; i++) {

            System.out.println("Enter book " + (i + 1) + " title:");
            String title = scan.nextLine();

            System.out.println("Enter the book " + (i + 1) + " author:");
            String author = scan.nextLine();

            System.out.println("Enter the book " + (i + 1) + " ISBN:");
            String isbn = scan.nextLine();

            books[i] = new Book(title, author, isbn);
        }
        System.out.println();
        System.out.println("Enter no.of Members: ");
        int numberOfMembers = scan.nextInt();
        scan.nextLine();
        Member[] members = new Member[numberOfMembers];
        for (int j = 0; j < numberOfMembers; j++) {

            System.out.println("Enter Member " + (j + 1) + " name:");
            String name = scan.nextLine();

            System.out.println("Enter Member " + (j + 1) + " ID:");
            String memberId = scan.nextLine();

            System.out.println("Enter Member " + (j + 1) + " status (active/inactive):");
            String status = scan.nextLine();

            boolean isActive = status.equalsIgnoreCase("active");
            members[j] = new Member(name, memberId, isActive);
        }
        Library library = new Library(books, members);

        // Borrow or return book
        System.out.print("Enter member ID: ");
        String memberId = scan.nextLine();
        System.out.print("Enter book ISBN: ");
        String bookIsbn = scan.nextLine();
        System.out.print("Enter 1 to borrow book, 2 to return book: ");
        int operation = scan.nextInt();
        Member member = library.findMemberById(memberId);
        Book book = library.findBookByIsbn(bookIsbn);
        if (operation == 1) {
            if (member != null && book != null) {
                library.borrowBook(member, book);
                library.calculateDueDate();
            } else {
                System.out.println("Invalid member ID or book ISBN.");
            }
        } else if (operation == 2) {
            if (member != null && book != null) {
                library.returnBook(member, book);
            } else {
                System.out.println("Invalid member ID or book ISBN.");
            }
        } else {
            System.out.println("Invalid operation.");
        }

        scan.close();

    }

}
