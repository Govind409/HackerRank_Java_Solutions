package Java_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Strings_practice2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        String A=a.toLowerCase();
        String B=b.toLowerCase();
        char [] ca=A.toCharArray();
        char [] cb=B.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        if (Arrays.equals(ca, cb)) {
        	System.out.println("Anagram");
        }else {
        	System.out.println("Not Anagrams");
        }
        
        	
        
        /*if (ca.equals(cb)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not");
        }*/
        

	}

}
