package OOPS.LibraryManagement;

import java.time.LocalDate;

interface LibraryOperations {
    void borrowBook(Member member, Book book);

    void returnBook(Member member, Book book);
}

abstract class Transactions {
    abstract void calculateDueDate();

}

class Library extends Transactions implements LibraryOperations {
    LocalDate currDate = LocalDate.now();
    Book[] books;
    Member[] members;

    public Library(Book[] books, Member[] members) {
        this.books = books;
        this.members = members;
    }

    public void borrowBook(Member member, Book book) {
        if (book.checkAvailability() && member.checkMembershipstatus()) {
            book.borrowBook();
            System.out.println("Book borrowed successfully");
        } else if (!book.checkAvailability()) {
            System.out.println("Book is not available");
        } else if (!member.checkMembershipstatus()) {
            System.out.println("Member is not active");

        }

    }

    @Override
    public void returnBook(Member member, Book book) {
        book.returnBook();
        System.out.println("Book returned sunccessfully");

    }

    @Override
    void calculateDueDate() {
        System.out.println("The due date for the borrowed book is 7 Days from today i.e: " + currDate.plusDays(7));

    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.memberId.equals(memberId)) {
                return member;
            }
        }
        return null;

    }
}
