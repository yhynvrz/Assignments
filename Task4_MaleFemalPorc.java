package Lab2_assignment;

import java.util.Scanner;

public class Task4_MaleFemalPorc {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number of females in the class:");
		double female = sc.nextDouble();
		
		
		System.out.println("Enter the number of males in the class:");
		double male = sc.nextDouble();
		
		
		
		double PercMale=(male/(male+female))*100;
		double PercFemale=(female/(female+male))*100;
		
		System.out.println("The porcentage of females in the class is " + PercMale);
		System.out.println("The porcentage of males in the class is " + PercFemale);
	}

}
