import java.util.Scanner;

public class Getlargest{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter how many numbers you want to input: ");
		int numbersOfInput = scanner.nextInt();

		System.out.println(getLargest(numbersOfInput) + " is the largest element on the list");

	}


public static int getLargest(int choice){

	if(choice < 0){
		System.out.println("Invalid Input !");
	}

	int[] scores = new int [choice];


	for(int count = 0; count < scores.length; count++){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the numbers: ");
		scores[count] = scanner.nextInt();		
	}

	int largest = scores[0];

	for(int count = 0; count < scores.length; count++){

		if(scores[count] > largest) largest = scores[count];

	}return largest;
	

}

}