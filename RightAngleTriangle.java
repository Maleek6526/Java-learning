import java.util.Scanner;

public class RightAngleTriangle{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the lenght of the base of a triange: ");
		int userInput = input.nextInt();



	for(int count = 1; count <= userInput; count++){

		System.out.println(" ");
		
		for(int counter = 1; counter <= count; counter++){

			System.out.print("* ");

		}

	}


	}




}