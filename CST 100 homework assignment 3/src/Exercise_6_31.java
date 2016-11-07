
public class Exercise_6_31 {

	public static boolean isValid(long number){
		
	}
	
	public static int sumOfDoubleEvenPlace(long number){
		int sum = 0;
		for(int i = 1; i <= getSize(number)/2 + 1; i++){
			int digit = ((int)((number%(Math.pow(10, 2*i))) / (Math.pow(10, 2 * i - 1)))) * 2;
			
			digit = getDigit(digit);
			
			sum = sum + digit;
		}
		
		return sum;
	}
	
	public static int getDigit(int number){
		if(number < 10){
			return number;
		}
		else{
			return (number / 10) + (number % 10);
		}
	}
	
	public static int sumOfOddPlace(long number){
		int sum = 0;
		
		for(int i = 0; i < getSize(number)/2 + 1; i ++){
			int digit = (int)((number%(Math.pow(10, 2*i + 1))) / (Math.pow(10, 2 * i)));
		
			sum = sum + digit;
		}
		
		return sum;
	}
	
	public static boolean prefixMatched(long number, int d){
		
	}
	
	public static int getSize(long d){
		return (int)Math.log10(d) + 1;
	}
}
