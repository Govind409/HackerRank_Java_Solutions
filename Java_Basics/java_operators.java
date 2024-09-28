package Java_Basics;

public class java_operators {

	public static void main(String[] args) {
		int a=10, b=9;
		//Arithmetic operators +,-,/,%,*,++,--
		System.out.println("The sum of two variables=" + (a+b));
		System.out.println("The subratction of two variables="+(a-b));
		System.out.println("The Multiplication of two variables="+(a*b));
		System.out.println("The division of two variables="+(a/b));
		System.out.println("The modulos of two variables="+(a%b));
		System.out.println("The increment of a="+(++a));
		System.out.println("The decrement of b="+(--b));
		
		//Assignment operators =,+=,-=,*=, /=,%=
		int w=10,h=5;
		
		System.out.println("w= "+(w));
		System.out.println("w+=h "+(w+=h));
		System.out.println("w-=h "+(w-=h));
		System.out.println("w*=h "+(w*=h));
		System.out.println("w/=h "+(w/=h));
		System.out.println("w%=h "+(w%=h));	
		
		//Relational Operators ==, >, <, >=, <=, !=
		
		System.out.println("W==h "+(w==h));
		System.out.println("W>h "+(w>h));
		System.out.println("W<h "+(w<h));
		System.out.println("W>=h "+(w>=h));
		System.out.println("W<=h "+(w<=h));
		System.out.println("W!=h "+(w!=h));
		
		//logical operators && ! ||
		System.out.println(w>h && w>0);
		
	}

}
