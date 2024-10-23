package OOPS.BookBorrowingSystem;

public class Register {
    userNames_Password u = new userNames_Password();

    void register(String username, String password) {
        for (int i = 0; i < u.MAX_USERS; i++) {

            if (username.equals(u.usernames[i])) {
                System.out.println("User name is already present please login to account");
                break;
            } else if (u.size > u.MAX_USERS) {
                System.out.println("Maximum users reached");
            } else {
                u.usernames[u.size] = username;
                u.hashedPasswords[u.size] = password;
                u.size++;
                System.out.println("User registered successfully!");
                break;
            }

        }
    }

}
