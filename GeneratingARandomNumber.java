import java.util.Scanner;

public class GeneratingARandomNumber{

	public static void main(String[] args) {
	Scanner numberGeneration = new Scanner(System.in);

	double usersGuess = 0;

	double randomNumber = 29.9;

	while(usersGuess != randomNumber){

	System.out.print("Guess what the number is: ");
	usersGuess = numberGeneration.nextDouble(); 


	if(usersGuess < randomNumber){
		System.out.println("Too low, try again!");
	}

	if(usersGuess > randomNumber) {
		System.out.println("Too high, try again!");
	}

	if(usersGuess == randomNumber) {
		System.out.println("Excellent! welldone");
	}

		
	}

	}
	
	
	}
	

	
