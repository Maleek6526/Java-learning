import java.util.Scanner;

public class Task1{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int evenIndex = 0;

		for(int count = 1; count <= 10; count++){

			System.out.print("Enter your Score: ");
			int userInput = scanner.nextInt();

			if(userInput % 2 == 0) evenIndex+= userInput;
		}System.out.printf("The sum of only the even numbers is : ", evenIndex);

	}


}
