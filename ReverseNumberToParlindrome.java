import java.util.Scanner;

public class IntegerReversed{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int userInput = input.nextInt();

		int reverseNumber = reverse(userInput);

		System.out.println(reverse(userInput));

		System.out.print(userInput == reverseNumber ? "true" : "false");

	}



public static int reverse(int number){

	int reverse = 0;

	while(number!=0){

		reverse = (reverse * 10)+number % 10;
		
		number = number / 10;

	}return reverse;


}

}