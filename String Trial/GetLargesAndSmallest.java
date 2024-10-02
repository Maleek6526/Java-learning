import java.util.Scanner;
public class GetLargesAndSmallest{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int userInput = scanner.nextInt();

		int count = 1;

		while (count <= userInput){
			
			System.out.printf("Enter the number %d: ", count);
			int numbers = scanner.nextInt();

			count++;
		}

	}
}