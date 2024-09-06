import java.util.Scanner;

public class SumOfDigitsInAnInteger{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an Integer: ");
		int userInput = scanner.nextInt();

		//System.out.println(getDigitInteger(userInput));
		System.out.println(getDigitIntegerInLoops(userInput));
		//System.out.print(getSum(userInput));
	}


public static int getDigitIntegerInLoops(int number){

	int remainder = 0;

	int countSum = 0;

	while(number != 0){

		remainder = number % 10;
		number = number / 10;

		countSum+=remainder;
		
	}return countSum;

	
}

/*public static int getSum(int number){

	int sum = getDigitIntegerInLoops(number);

	int firstSum = sum /100;

	int finalFirstSum = sum%10;

	int secondNumber = sum / 10;

	int finalSecondNumber = secondNumber%10;

	int lastNumber = secondNumber / 10;

	int finalLastNumber = lastNumber % 10;


	int sumAll = firstSum+finalFirstSum+finalSecondNumber;

	return sumAll;

}*/

/*public static int getDigitInteger(int number){

	int firstNumber = number / 100;

	int removeFirstNumber = number % 10;

	int secondNumber = number / 10;

	int removeSecondNumber = secondNumber %	 10;

	int thirdNumber = secondNumber/10;

	int sum = firstNumber + removeFirstNumber + removeSecondNumber;

	return sum;

}*/


}