package Java_Basics;

import java.util.Scanner;

public class Java_static_Initializer_Block {
	static Scanner scanner = new Scanner(System.in);
	static int B=scanner.nextInt();
	static int H=scanner.nextInt();
	private static String paralelogram_area() {
		if (B>0 && H>0) {
			int a=B*H;
			String c=String.valueOf(a);
			return c;
			
			
		}else {
			String c="Breadth and height must be positive";
			return c;
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println(paralelogram_area());
		

	}

}
