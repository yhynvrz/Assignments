package Lab2_assignment;

import java.util.Scanner;

public class Task5_TaxAndTip {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner (System.in);
		
		
		double taxAmount;
		double tipAmount;
		double totalBill=0;
		
		System.out.println("Enter the charge for the meal:");
		double mealCharge = sc.nextDouble();
		
		taxAmount=(mealCharge*6.75)/100;
		tipAmount=(totalBill+taxAmount*20)/100;
		totalBill=(mealCharge+taxAmount+tipAmount);
		
		
		System.out.println("Meal Charge: " + mealCharge + "$");
		System.out.println("Tax amount: " + taxAmount + "$");
		System.out.println("Tip amount: " + tipAmount + "$");
		System.out.println("Total Bill: " + totalBill + "$");
	}

}
