//Write a program that prompts the user to
//enter an integer and determines whether it is divisible by 4

import java.util.Scanner;

public class ProgramDivisibleBy4{

	public static void main(String... division) {
	
		Scanner fourDivision = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int userInput = fourDivision.nextInt();

		int pass = 4;

		if(userInput % pass ==0) {

			System.out.print("It is divisible by 4");

		}

		else{

			System.out.print("It is not divisible by 4");

		}


	}

}