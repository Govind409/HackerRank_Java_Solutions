package OOPS.BookBorrowingSystem;

public class userNames_Password {
    String[] usernames;
    String[] hashedPasswords;
    int size;
    final int MAX_USERS = 100;

    userNames_Password() {
        usernames = new String[MAX_USERS];
        hashedPasswords = new String[MAX_USERS];
        size = 0;
    }

}
