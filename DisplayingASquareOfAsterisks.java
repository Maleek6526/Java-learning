import java.util.Scanner;

public class DisplayingASquareOfAsterisks{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter number of the sides: ");
	int userInputOne = scanner.nextInt();

	System.out.print("Enter number of the sides: ");
	int userInputTwo = scanner.nextInt();

		
	squareOfAsterisks(userInputOne, userInputTwo);
		

	}

public static void squareOfAsterisks(int row, int column){

	for(int count = 1; count <= row; count++){

		for(int counter = 1; counter<=column; counter++){

			System.out.print("* ");

		}System.out.println();

	}

}

}