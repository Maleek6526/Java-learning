import java.util.Scanner;

public class Palindrome{

	public static void main(String... agrs){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");

		int userInput = input.nextInt();


		int firstNumber = userInput / 1000;
		int secondNumber1 = userInput / 10;

		int secondNumber = secondNumber1 % 10;
		int thirdNumber = userInput % 10;
		

	if(firstNumber == thirdNumber){

	System.out.print(userInput+" is a palindrome");

	}

	if (firstNumber != thirdNumber){

	System.out.print(userInput+" is not a palindrome");
	

	}

}

}