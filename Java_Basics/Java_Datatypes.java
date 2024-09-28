package Java_Basics;

import java.util.Scanner;

public class Java_Datatypes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            String input = scanner.next(); // Read input as String to handle large values

            // Try to determine which data types can fit the input
            try {
                long number = Long.parseLong(input); // Convert to long for comparison
                System.out.println(input + " can be fitted in:");

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long"); 

            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }

        scanner.close();
		
	}

}
