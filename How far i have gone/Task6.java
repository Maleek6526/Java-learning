import java.util.Scanner;

public class Task6{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int evenIndex = 0;
		int average = 0;

		for(int count = 1; count <= 10; count++){

			System.out.print("Enter your Score: ");
			int userInput = scanner.nextInt();

			if(userInput % 2 == 0){

				evenIndex+= userInput;

				average++;

			}
				
		}
			int task5 = evenIndex / average;

			System.out.printf("The sum of task 5 is: %d", task5);
	}
}
