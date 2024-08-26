import java.util.Scanner;

public class LargestAndSmallest{

	public static void main(String[] args);
	Scanner input =  new Scanner(System.in);

	int largest = 0;
	int smallest = 0;

	while (true) {
		System.out.print("Enter an integer: ");
		integer = input.nextInt();

	if(integer > largest) {

		System.out.println("largest is: "+ largest);

	}


	if(integer < smallest) {

		System.out.println("largest is: "+ smallest);

	}

	
}
}