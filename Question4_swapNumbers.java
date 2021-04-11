package Assignment_3_ArithmaticOperators;

public class Question4_swapNumbers {

	public static void main(String[] args) {
//		Question-4
//
//		Declare 2 variables (Num1, Num2), 	Swap values between Num1 and Num2
//		Display new values of Num1 and Num2
//	
//		Sample output:
//	      
//	      n1=10		|		n2=10
//	      n2=20		|		n1=20
//
  
		int num1= 10, num2=20;
		
//		num3=num1;
//		num1=num2;
//		num2=num3;

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1 is now " + num1 + " and num2 is now " + num2);
	}

}
