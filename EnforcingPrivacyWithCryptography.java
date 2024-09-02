import java.util.Scanner;

public class EnforcingPrivacyWithCryptograghy{


	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a four digit integer: ");
		int userInput = input.nextInt();

		int firstNumber = userInput / 1000;
		int lastNumber = userInput % 10;
		int thirdNumber = userInput / 10;
		int finalThirdNumber = thirdNumber % 10;
		int secondNumber = thirdNumber / 10;
		int finalSecondNumber = secondNumber % 10;


System.out.printf("%d%d%d%d%n", firstNumber , finalSecondNumber, finalThirdNumber, lastNumber);

int firstDigit = (firstNumber+7)%10;
int secondDigit = (finalSecondNumber+7)%10;
int thirdDigit = (finalThirdNumber+7)%10;
int fourthDigit = (lastNumber+7)%10;


System.out.printf("Encrypted = %d%d%d%d%n",firstDigit , secondDigit, thirdDigit, fourthDigit);

System.out.printf("Decrypted = %d%d%d%d",thirdDigit,fourthDigit,firstDigit , secondDigit);







	}




}