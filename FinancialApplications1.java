import java.util.Scanner;

public class FinancialApplications1{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter the investment amount: ");
	double investmentAmount = input.nextDouble();

	System.out.print("Enter the annual rate interest: ");
	double annualRateInterest = input.nextDouble();

	System.out.print("Enter the numbers of years: ");
	int numbersOfYears = input.nextInt();	



	double futureInvestmentValue = investmentAmount * Math.pow((1 + annualRateInterest / 100), numbersOfYears);

	System.out.printf("The accumulated value is: %c%f", '$', futureInvestmentValue);



}
}