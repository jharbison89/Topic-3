import java.util.Scanner;

public class Exercise_4_23 {

	public static void main(String[] args){
		// this program creates a payroll statement given a series of inputs
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter federal tax witholding rate: ");
		double federalRate = input.nextDouble();
		
		System.out.print("Enter state tax witholding rate: ");
		double stateRate = input.nextDouble();
		
		double gross = (int)((hours * rate) * 100) / 100.0;
		
		double federalTax = (int)((gross * federalRate) * 100) / 100.0;
		
		double stateTax = (int)((gross * stateRate) * 100) / 100.0;
		
		double net = gross - federalTax - stateTax;
		
		System.out.printf("Employee Name: %s\nHours worked: %f\nPay Rate: %f\nGross Pay: $%.2f\n", name, hours, rate, gross);
		System.out.printf("Deductions:\n  Federal Tax: $%.2f\n  State Tax: $%.2f\n  Total Deductions: $%.2f\nNet Pay: $%.2f", federalTax, stateTax, federalTax + stateTax, net);
	}
}
