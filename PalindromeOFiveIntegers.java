import java.util.Scanner;
public class PalindromeOFiveIntegers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter five integer:");
		int userInput = input.nextInt(); 
		
		int numberOne = userInput /10000;
		int lastNumber = userInput % 10;
		int fourthNumber = userInput / 10;
		int finalFourthNumber = fourthNumber % 10;
		int thirdNumber = fourthNumber / 10;
		int finalThirdNumber = thirdNumber % 10;
		int secondNumber = thirdNumber / 10;
		int finalSecondNumber = secondNumber % 10;

		if(numberOne==lastNumber){
				System.out.print("It is a palindrome");
		}
		else{
			System.out.print("It is not a palindrome");

		}
	}
}