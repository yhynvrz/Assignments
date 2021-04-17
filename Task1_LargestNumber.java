package Lab2_assignment;

import java.util.Scanner;

public class Task1_LargestNumber {

	public static void main(String[] args) {
		
		
		
		int biggest=0;
		int smallest=999999999;
		
		Scanner sc = new Scanner (System.in);
		
		int choose;
		
		System.out.println("Enter your first number:");
		int num = sc.nextInt();
		
		if (num>biggest) {
			biggest=num;
		}
		if (num<smallest) {
			smallest=num;
			
		do {
			System.out.println("Enter your next number:");
			num =sc.nextInt();
			System.out.println("Do you want to enter another number: 0-NO, 1-Yes");
			choose = sc.nextInt();
			
			if (num>biggest) {
			biggest=num;
			
			}
			if (num<smallest)
				smallest=num;
		
			
			
		
		}while (choose==1);	
		
		System.out.println("Smallest Numer is:" + smallest);
		System.out.println("Largest Number is:" + biggest);
		
	}

  }
}