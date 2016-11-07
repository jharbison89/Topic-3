import java.util.Scanner;

public class Exercise_6_7 {

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
				
		return investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("The amount invested: ");
		double investment = input.nextDouble();
		
		System.out.print("Annual interest rate: ");
		double rate = input.nextDouble() / 100.0;
		
		input.close();
		System.out.println("Years     Future Value");
		
		for(int i = 1; i <= 30; i++){
			System.out.printf("%d           %.2f\n", i, futureInvestmentValue(investment, rate/12, i));	
		}
	}
}
