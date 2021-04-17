package Lab2_assignment;

import java.util.Scanner;

public class Task3_SumOfNumbers {

	public static void main(String[] args) {
	
		
		
	        Scanner sc = new Scanner(System.in);
	        
	        
	        System.out.println("Enter a positive number");
	        
	        
			int inputNum = sc.nextInt();
	        
	        int i;
	        int sum = 0;
	        
	        if (inputNum>0) {
	        	
	        	for (i=1;i <= inputNum;i++) {
	            sum += i;
	            
	            
	            
	        }if (inputNum<0) {
	        	System.out.println("Invalid input");
	        }
	        System.out.println("The sum of 1 up to your given number is "+ sum);
	    }	
		
		
	}

}
