import java.util.Scanner;

public class TimeConversion_1 {

	public static void main(String[] args){
		// this program will take a given time in 24 hour format and output in 12 hour
		
		Scanner input = new Scanner(System.in);
	
		System.out.printf("Please enter a time in 24 hour format: ");	// prompts user for input
		int time = input.nextInt();
	
		if(time - 12 <= 0){			// displays time based on given input
			System.out.printf("%d AM\n", time);
		}
		else if(time - 12 > 0){
			System.out.printf("%d PM\n", time - 12);
		}
	}
}
