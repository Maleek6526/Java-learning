import java.util.Scanner;

public class FinancialApplications1{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter the investment amount: ");
	double InvestmentAmount = input.nextDouble();

	System.out.print("Enter the annual rate interest: ");
	double AnnualRateInterest = input.nextDouble();

	System.out.print("Enter the numbers of years: ");
	int NumbersOfYears = input.nextInt();	



	double FutureInvestmentValue = InvestmentAmount * Math.pow((1 + AnnualRateInterest / 12), NumbersOfYears * 12);

	System.out.printf("The accumulated value is: %c%f", '$', FutureInvestmentValue);
}}