import java.util.Scanner;

public class GeneratingARandomNumber11{

	public static void main(String[] args) {
	Scanner numberGeneration = new Scanner(System.in);

		double userInput= 0;
		double randomNumber = 29.9;
	
	while(userInput != randomNumber){
		System.out.print("Enter a number: ");
		userInput = numberGeneration.nextDouble();
		
		double userInput= 0;
		double randomNumber = 29.9;
		
		if(userInput < randomNumber){
		System.out.print("Too low, try again!");
		}

		if(userInput > randomNumber){
		System.out.print("Too high, try again!");
		}
		
		if(userInput == randomNumber){
		System.out.print("Excellent! good job");
		}
		
	}

}
}