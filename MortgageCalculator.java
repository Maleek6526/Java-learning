import java.util.Scanner;

public class MortgageCalculator{

	public static void main(String... assignment) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Principal Amount: ");
		double principal = input.nextDouble();


		System.out.print("Enter the Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();



		System.out.print("Enter the Duration in years: ");
		double durationInYears = input.nextDouble();

		double duration = durationInYears * 12;

		double annualInterest =  annualInterestRate / 100;
		double monthlyInterestRate = annualInterest /12;


		double monthlyPayment1 = (1 + monthlyInterestRate);
		double monthlyPayment2 = Math.pow(monthlyPayment1, duration);

		double monthlyPayment3 = monthlyInterestRate * monthlyPayment2;


		double monthlyPayment4 = monthlyPayment2 - 1;

		double divisionResult = monthlyPayment3 / monthlyPayment4;

		double multiplication = principal * divisionResult;

		System.out.printf("Your monthly payment is %c%.2f", '$' , multiplication);

	}

}