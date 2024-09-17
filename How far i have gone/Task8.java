import java.util.Scanner;

public class Task8{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int counter = 0;

		while (true){

			System.out.print("Enter your score: ");
			int userInput = scanner.nextInt();

			if(userInput>= 0 && userInput <= 100){

				count++;
				
				counter += userInput;
				

			}

			if(count == 10){

				System.out.println(counter);break;

			}

		}
	}
}



