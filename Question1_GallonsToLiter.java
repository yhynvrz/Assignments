package Assignment_3_ArithmaticOperators;

public class Question1_GallonsToLiter {

	public static void main(String[] args) {
//Write a program to convert gallons into Liters and display it.
//        Sample output:
//
//       15 gallon is 56.7812 liter
	
	double L = gallonToLiter(15);
	System.out.println(L);
	}

	public static double gallonToLiter(double gallon) {
		double Liter;
		Liter=gallon*3.78541;
		
		return Liter;
		
		
	}

}
