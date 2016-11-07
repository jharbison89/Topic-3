import java.util.Scanner;

public class Exercise_6_18 {

	public static boolean passwordCheck(String pw){
		/** determines if a given password is valid, a password is valid if it is at least 8 chars long,
		 *  contains only letters and numbers, and has at least 2 numbers
		 */
		
		int fail = 0;		// initializes a fail variable, if any criteria fail the value will become non-zero
		
		if(pw.length() < 8){	// checks the length of the password to ensure it is at least 8 chars long
			fail++;
		}
		
		int nums = 0;			// initializes variables for counting numbers and letters in the password 
		int letters = 0;		
		
		for(int i = 0; i < pw.length(); i++){
			// determines if a value is a number or letter
			if((pw.charAt(i) >= 'A' && pw.charAt(i) <= 'Z') || (pw.charAt(i) >= 'a' && pw.charAt(i) <= 'z')){
				letters++;
			}
			
			if(pw.charAt(i) >= '0' && pw.charAt(i) <= '9'){
				nums++;
			}
		}
		if(nums + letters < pw.length()){	// checks that all characters are numbers or letters
			fail++;
		}
		if(nums < 2){		// checks at least 2 numbers in password
			fail++;
		}
		
		if(fail > 0){			// if fail variable is positive, password fails
			return false;
		}
		else{
			return true;
		}
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter password: ");
		String password = input.next();
		
		input.close();
		
		if(passwordCheck(password)){
			System.out.println("Valid Password");
		}
		else{
			System.out.println("Invalid Password");
		}
	}
}
