package OOPS.BookBorrowingSystem;

import java.util.Scanner;

public class BookBorrowingSystem {
    public static void main(String[] args) {
        Login log = new Login();
        Register reg = new Register();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String username = scan.nextLine();

        System.out.println("Enter password");
        String password = scan.nextLine();

        System.out.println("Enter 1 for Login ,Enter 2 for Register, Enter 3 for exit");

        while (true) {
            int user_input = scan.nextInt();
            switch (user_input) {
                case 1:
                    if (log.validateUser(username, password) == true) {
                        System.out.println("Successfully login into account");
                    } else {
                        System.out.println("Either username or password is wrong");
                    }
                    break;
                case 2:
                    reg.register(username, password);
                    break;
                case 3:
                    System.exit(0);
                    System.out.println("Exited from login page");
                    break;

            }

        }

    }

}
