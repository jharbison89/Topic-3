import java.util.Scanner;

public class Exercise_6_3 {
	public static int reverse(int a){
		int b = 0;
		int digits = (int)(Math.log10(a));
		
		for(int i = 0; i <= digits; i++){
			b = b + ((a%10) * (int)Math.pow(10, digits - i));
			a = a / 10;
		}
		
		return b;
	}
	
	public static boolean isPalendrome(int a){
		int b = reverse(a);
		
		if(b == a){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a number:");
		int digit = input.nextInt();
		
		if(isPalendrome(digit)){
			System.out.printf("%d is a palendrome\n", digit);
		}
		else{
			System.out.printf("%d is not a palendrome\n", digit);
		}
	}
}
