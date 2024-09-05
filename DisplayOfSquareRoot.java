import java.util.Scanner;

public class DisplayOfSquareRoot{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double userInput = input.nextInt();

		if(userInput < 0.0){

			System.out.print("Invalid Input");

		}
	
		double squareRoot = Math.sqrt(userInput);

		System.out.print(squareRoot);

	

	}

}