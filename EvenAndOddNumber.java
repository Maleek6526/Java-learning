import java.util.Scanner;

public class EvenAndOddNumber{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter an Integer: ");
	int userInput = input.nextInt();


	if(userInput%2==0){

	System.out.println(userInput+" is an even number");

	}

	if(userInput%2!=0){

	System.out.println(userInput+" is an odd number");

	}


	}


}