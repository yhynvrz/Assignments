package Assignment_3_ArithmaticOperators;

public class Question7_Change {

	public static void main(String[] args) {
		
		
		itemPrice(25,100);
		
		
		

	}

	public static void itemPrice (int Item, int pay) {
		
		
		int Change=pay-Item;
		
		if (Item<=25 || Item<=100) {
			if (pay==100) {
				
		System.out.println("Your change is " + Change + " cents");
		
		
		}else {
			System.out.println("Invalid Item or pay");

		}
	}
  }
}