import java.util.Scanner;

public class PrimeNumbers{

	public static void main(String... maleek) {

		Scanner input = new Scanner(System.in);


		System.out.print("Enter an integer: ");
		int usersInput = input.nextInt();


		if (usersInput % 1 == 0 && usersInput % 2 != 0 && usersInput > 1 && usersInput % 3 != 0 && usersInput % 4 != 0 && usersInput % 5 != 0 && usersInput % 6 != 0 && usersInput % 7 != 0 && usersInput % 8 != 0 && usersInput % 9 != 0 && usersInput % 10 != 0usersInput % usersInput == 0) {

			System.out.print("It is a prime number");

		}

		else{

			System.out.print("It is not a prime number");

		}

		


	}

}