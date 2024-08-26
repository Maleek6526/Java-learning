import java.util.Scanner;

public class ComparingInteger{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter one integer: ");
		double integer = input.nextInt();

		double num = Math.pow (integer,2);

		if(num > 100) {
			System.out.printf("The integer is greater than 100%n");
		}
		if(num == 100) {
			System.out.printf("The integer is equal to 100%n");
		}
		if(num != 100) {
			System.out.printf("The integer is not equal to 100%n");
		}
		if(num < 100) {
			System.out.printf("The integer is less than 100%n");
		}


	}
	}