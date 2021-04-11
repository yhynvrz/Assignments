package Assignment_3_ArithmaticOperators;

public class Question2_NameBirthdayYear {

	public static void main(String[] args) {
//		Write a program - > Declare variables for your name and birth year, and the program will display:
//
//		      " Hello, Ozzy! Based on your input, your age is 15 :) "
		
		
		
//		String name="Ozzy";
//		int birthYear= 2006;
//		int age=2021-birthYear;
//		
//		System.out.println("Hello, " + name + "!" + " Based on your input, your age is " + age);
//		
		calculateAge("Ozzy", 2006);
		
		
	}

	public static int nameBirthYear(int birthYear) {
		
		return 2021-birthYear;
		
	}
	public static void calculateAge(String name, int age) {
		
		int Age=nameBirthYear(age);
	System.out.println("Hello, " + name + "!" + " Based on your input, your age is " + Age );
	
}
}
