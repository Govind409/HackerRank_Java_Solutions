package OOPS.BookBorrowingSystem;

public class Login {
    userNames_Password u = new userNames_Password();

    public boolean validateUser(String username, String Password) {
        for (int i = 0; i < u.size; i++) {
            if ((u.usernames[i].equals(username)) && (u.hashedPasswords[i].equals(Password))) {
                return true;
            }
        }
        return false;
    }

    public void displayUsers() {
        for (int i = 0; i < u.size; i++) {
            System.out.println("Username: " + u.usernames[i]);
        }
    }

}
