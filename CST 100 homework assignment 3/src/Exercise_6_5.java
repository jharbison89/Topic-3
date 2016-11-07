import java.util.Scanner;

public class Exercise_6_5 {

	public static void displaySortedNumbers(double num1, double num2, double num3){
		double largest = num1;
		if(num2 > largest){
			largest = num2;
		}
		
		if( num3 > largest){
			largest = num3;
		}
		
		double smallest = num1;
		if(num2 < smallest){
			smallest = num2;
		}
		if(num3 < smallest){
			smallest = num3;
		}
		
		double middle = 0;
		
		if(num1 > smallest && num1 < largest){
			middle = num1;
		}
		else if(num2 > smallest && num2 < largest){
			middle = num2;
		}
		else if(num3 > smallest && num3 < largest){
			middle = num3;
		}
		
		System.out.println(smallest + " " + middle + " " + largest);
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("please enter 3 numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		input.close();
		
		displaySortedNumbers(a, b, c);
	}
}
