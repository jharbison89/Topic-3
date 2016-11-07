import java.util.Scanner;

public class TimeConversion_2 {

	public static void main(String[] args){
		// this program takes a user input time in decimal form and outputs the corresponding hours and minutes
		
		Scanner input = new Scanner(System.in);		// create new scanner
		
		System.out.print("Please enter a time in decimal format: ");	// prompt for input time
		double decimal = input.nextDouble();		// reads user input
		
		int hours = (int)(decimal);		// calculates hours
		int minutes = (int)((decimal - hours) * 60);	// calculates minutes
		
		System.out.printf("%d hours and %d minutes\n", hours, minutes);		// outputs calculations to user
		
	}
}
