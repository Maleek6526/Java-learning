import java.util.Scanner;

public class PrimeNumbers1{

	public static void main(String... maleek) {

		Scanner input = new Scanner(System.in);


		System.out.print("Enter an integer: ");
		int usersInput = input.nextInt();

		int counter = 0;

		for(int count = 1;count <= usersInput; count= count + 1) {

			if(usersInput % count == 0) {

				counter++;
				
				
			}

			

		}System.out.println("The factors of "+ usersInput + " is " + counter);

		if(counter == 2) {

			System.out.println("This is a prime number");

		}

		else {

			System.out.println("This is not a prime number");


		}

	}

}