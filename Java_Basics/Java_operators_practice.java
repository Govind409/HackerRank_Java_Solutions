package Java_Basics;

public class Java_operators_practice {

	public static void main(String[] args) {
		//Arthimetic
		int a=16, b=78;
		System.out.println("Sum : "+(a+b));
		System.out.println("product : "+(a*b));
		System.out.println("quotient : "+((a/b)));
		System.out.println("difference : "+Math.abs((a-b)));
		
		//comparision
		
		String result= (a<18 || a>10)? "true": "false";
		System.out.println(result);
		
		//Logical operators
		int year=2024;
		
		String Leap_year=(year%4==0 || (year%100==0 && year%400==0) )? "leap year": "Not a leap year";
		System.out.println(Leap_year);
		
		//Ternaryoperator
		int max= (a>b)? a: b;
		System.out.println("Maximum number between two inetgers is: "+max);
		
		//Bitwise operators swap variables using xor wiyhou using thidr var
		
		int x=5,y=3;
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		
		
	}

}
