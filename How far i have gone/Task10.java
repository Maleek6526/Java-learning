import java.util.Scanner;

public class Task10{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int sumOfValidScore = 0;
		int averageCounter = 0;

		for(int count = 1; count <= 10; count++){

			System.out.print("Enter your Score: ");
			int userInput = scanner.nextInt();

			if(userInput >= 0 && userInput <= 100){

				sumOfValidScore+= userInput;

				averageCounter++;
			}
		}

			int average = sumOfValidScore / averageCounter;

			System.out.printf("The valid score sum is : %d", average);

		}
}
