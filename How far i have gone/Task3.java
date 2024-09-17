import java.util.Scanner;

public class Task3{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		int averageCounter = 0;

		for(int count = 1; count <= 10; count++){

			System.out.print("Enter your Score: ");
			int userInput = scanner.nextInt();

			counter+=userInput;
			averageCounter++;
		}System.out.printf("The sum of the scores are: %d%n",counter);
		
		int average = counter / averageCounter;

		System.out.printf("The average score is: %d", average);

	}


}