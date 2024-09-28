package Java_loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Loops_Practice2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		for (int l=0;l<m;l++) {
			
		
		
			ArrayList<Integer> parameters=new ArrayList<Integer>();
			ArrayList<Integer> res=new ArrayList<Integer>();
			for(int k=0;k<3;k++) {
				parameters.add(scan.nextInt());	
			}
	        for(int i=0;i<parameters.get(2);i++) {
	        	int c=0;
	            for(int j=0;j<parameters.get(2);j++) {
	            	if(j<=i) {
	            		c+=(int)(parameters.get(0)+Math.pow(2, j)*parameters.get(1));	
	            		}
	            	else {
	            		break;
	            		}	
	            	}
	            	res.add(c);	
	            }
	        	
	        	for (int i = 0; i < res.size(); i++) {
	                System.out.print(res.get(i));
	                if (i < res.size() - 1) {
	                    System.out.print(" ");
	                }
	                
	        		
	        	}
	        	
	    
	        	
	        		
	        		
		}
		
        }
		
        
	

}
