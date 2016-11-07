
public class Exercise_6_12 {
	
	public static void printChars(char ch1, char ch2, int numberPerLine){
		for(char a = ch1; a <= ch2; a ++){
			for(int i = 0; i < numberPerLine; i++){
				System.out.printf("%c ", a);
				a++;
				if(a > ch2){
					break;
				}
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args){
		// test program for method printChars, this will print all characters between 1 and Z with 10 characters per line
		printChars('1', 'Z', 10);
	}
}
