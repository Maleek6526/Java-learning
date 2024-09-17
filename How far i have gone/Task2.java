import java.util.Scanner;

public class Task2{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		int averageCounter = 0;

		for(int count = 1; count <= 10; count++){

			System.out.print("Enter your Score: ");
			int userInput = scanner.nextInt();

			counter+=userInput;
			averageCounter++;
		}
		
		int average = counter / averageCounter;

		System.out.printf("The average score is: %d", average);

	}


}