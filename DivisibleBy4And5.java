//(Use the &&, ||, and ^ operators) Write a program that prompts the user to
//enter an integer and determines whether it is divisible by 4 and 5

import java.util.Scanner;

public class DivisibleBy4And5{

	public static void main(String... divisible){

		Scanner user = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int userInput = user.nextInt();


		if(userInput % 4 == 0 && userInput % 5 == 0){

			System.out.print("It is divisible by 4 and 5");

		}

		else if(userInput % 4 != 0 && userInput % 5 == 0){

			System.out.print("It is divisible by 5 and not divisible by 4 ");

		}

		else if(userInput % 4 == 0 && userInput % 5 != 0){

			System.out.print("It is divisible by 4 and not divisible by 5 ");

		}

		else{

			System.out.print("It is not divisible by 4 and 5");

		}

		

	}

}