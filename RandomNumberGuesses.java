import java.util.Scanner;

public class RandomNumberGuesses{

	public static void main(String... random) {

		Scanner scanner = new Scanner(System.in);

		int randomNumber = (int)(Math.random() * (15));
	
		int userGuesses;
		int counter = 0;

		do{
			System.out.print("Enter your guesses: ");
			userGuesses = scanner.nextInt();
			counter++;
			if(randomNumber == userGuesses){

				System.out.println("Correct");
				System.out.println(counter);
					break;

			}

			if(userGuesses < randomNumber ){

				System.out.println("Too Low");

			}
		
			if(userGuesses > randomNumber ){
				System.out.println("Too high");

			}

			if(counter % 3 == 0){

				randomNumber = (int)(Math.random() * (15));
				System.out.println("Guess number changed");

			}

			if(counter == 10){
				System.out.println("You are as dumb as hell");
				break;
				
			}

		} while(userGuesses != randomNumber);



		

	}


}