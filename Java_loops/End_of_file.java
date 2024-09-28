package Java_loops;

import java.util.Scanner;

public class End_of_file {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c=0;
		
		while(scanner.hasNextLine()) {
			String s=scanner.nextLine();
			c+=1;
			System.out.println(c+" "+s);
		}
		
		

	}

}
