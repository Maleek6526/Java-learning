import java.util.Scanner;
public class SeperatingNumbers{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int userInput = scanner.nextInt();

		int storage = 0;

		while(userInput!=0){

			storage = userInput % 10;

			userInput = userInput / 10;

		System.out.printf("%d\t", storage);

		}

	}

}