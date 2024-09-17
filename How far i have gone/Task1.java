import java.util.Scanner;

public class Task1{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int counter = 0;

		for(int count = 1; count <= 10; count++){

			System.out.print("Enter your Score: ");
			int userInput = scanner.nextInt();

			counter+=userInput;
		}System.out.printf("The sum of the scores are: %d",counter);

	}


}