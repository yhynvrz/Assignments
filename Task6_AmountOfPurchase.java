package Lab2_assignment;

import java.util.Scanner;

public class Task6_AmountOfPurchase {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the purchase amount: ");
		double amountOfPurchase = sc.nextDouble();
		
		double countyTax=amountOfPurchase*0.2;
		double stateSalesTax=amountOfPurchase*0.4;
		double totalSalesTax=countyTax+stateSalesTax;
		
		System.out.println("The amount of the purchase is: " + amountOfPurchase);
		System.out.println("The county tax is: " + countyTax);
		System.out.println("The state sales tax is: " + stateSalesTax);
		System.out.println("The total sales tax tax is: " + totalSalesTax);
		
		

	}

}
