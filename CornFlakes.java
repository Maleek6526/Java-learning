import java.util.Scanner;

public class CornFlakes{

	public static void main(String... cornflakes){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int userInput = input.nextInt();

		int count = 1;
		int counter = 1;
		while (count<=10){

			counter = userInput * count;
		System.out.printf("%d %c %d %c %d %n", userInput, '*', count , '=',counter);
			count++;
		

		}

	}


}