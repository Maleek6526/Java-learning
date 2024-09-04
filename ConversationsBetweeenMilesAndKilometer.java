/* prompt the user to enter an integer and save it as userInput	
create a function that can takes in a float number for converting kilomiles to mile
return the answer 
create a function that can takes in a float number for converting mile to kilomiles
return the answer 

*/



import java.util.Scanner;

public class ConversationsBetweeenMilesAndKilometer{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer:");
		int userInput = input.nextInt();

		double kilomile = kilometerToMile(userInput);
		double milekilo = mileToKilometer(userInput);

		System.out.printf("Converting from kilometer to mile is: %f  %n",  kilomile );
		System.out.printf("Converting from mile to kilometer: %f", milekilo);
	}



public static double kilometerToMile(double mile){

	double number =  0.621371 * 1000;
	return number;


}



public static double mileToKilometer(double kilometer){

	double number = 1.60934 / 1000;

	return number;

}

}