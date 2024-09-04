import java.util.Scanner;

public class IntegerReversed{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int userInput = input.nextInt();

		reverse(userInput);
	}



public static void reverse(int number){

	int reverse = 0;

	while(number!=0){

		reverse = (reverse * 10)+number % 10;
		
		number = number / 10;

	}System.out.print(reverse);


}

}