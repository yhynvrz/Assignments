package Lab1_day14;

public class question6 {

	public static void main(String[] args) {
		
		
		cigarParty(50,true);
		
		

	}

	public static void cigarParty(int cigars, boolean weekend) {
		
		if (cigars>=40 && cigars<=60 ) {
			if (weekend==false);
			System.out.println(" It is true that the party is successfull");
			
		}else if (cigars>=40) {
			if (weekend==true);
			System.out.println("it is true that teh party is successfull");
		}else {
			System.out.println("That the party is successfull is false");
		}
	}

}
