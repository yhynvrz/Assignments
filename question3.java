package Lab1_day14;

public class question3 {

	public static void main(String[] args) {
		
		specialEven(24);
		
		
	}private static void specialEven(int num1) {
			
			if (num1%11==0 || num1%11==1) {
					System.out.println(true);
					
			}else {
				System.out.println(false);
			}
	}

}
