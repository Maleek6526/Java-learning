import java.util.Scanner;

public class CreditCardLimit{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your account number: ");
		int accountNumber = input.nextInt();

		System.out.print("Enter your balance at the beginning of the month: ");
		int balance = input.nextInt();

		System.out.print("Enter total charges: ");
		int totalCharges = input.nextInt();

		System.out.print("Enter your total credit: ");
		int totalCredit = input.nextInt();

		System.out.print("Enter your credit limit: ");
		int creditLimit = input.nextInt();


		int newBalance = balance + totalCharges - totalCredit;

		System.out.println(newBalance);


		if(newBalance > creditLimit){

			System.out.print("Credit Limit Exceeded");

		}

	}

}