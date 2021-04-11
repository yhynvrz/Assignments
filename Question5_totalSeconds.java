package Assignment_3_ArithmaticOperators;

public class Question5_totalSeconds {

	public static void main(String[] args) {
		
		SecInHrsMinSec(3695);
		
	

		
	}

	private static void SecInHrsMinSec(int inputSeconds) {
		
		int SecondsLeft;
		int hours;
		int minutes;
		int seconds;
		
		minutes=inputSeconds/60;
		hours=minutes/60;
		seconds=inputSeconds%60;
		SecondsLeft=minutes%60;
		
		
		System.out.print(inputSeconds + " seconds = ");
		System.out.println( hours + " hours, " + minutes + " minutes, " + seconds+ " seconds");
	}

}
