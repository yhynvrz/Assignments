package Lab1_day14;

public class question5 {

	public static void main(String[] args) {
		
		caughtSpeeding (61,true);
		
	}

	public static void caughtSpeeding(int speed, boolean birthday) {
		
		if (speed<=60){
			
		System.out.println("0");
	
		}else if (speed>60 && speed<=80) {
			if (birthday==true) {
				System.out.println("0");
			}else { 
				System.out.println("1");
			}
			}else if (speed>80) {
			if (birthday==true) {
				System.out.println("0");
			}else {
				System.out.println("2");
			}
			
		}	
	}
}