package Lab2_assignment;

import java.util.Scanner;

public class Task2_Cookies {

	public static void main(String[] args) {
//		Question-2

//		A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 serving in the bag 
//		and that a serving equals 300 calories. write a program that lets the user enter the number of cookies he or she actually ate 
//		and then reports the number of total calories consumed.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your eaten cookies:");
		int AteCookies = sc.nextInt();
		
		int serving=40/10;
		int caloriesPerCookies=300/serving;
		int totalCalories=AteCookies*caloriesPerCookies;
		
	
		
		System.out.println("Your total calorie is: " + totalCalories);
	}

	
}
