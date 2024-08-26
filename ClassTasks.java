import java.util.Scanner;

public class ClassTasks{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int numberOne = input.nextInt();


		System.out.print("Enter the second number: ");
		int numberTwo = input.nextInt();

		if(numberOne == numberTwo){
			System.out.println("number one is equal to number two");
		}

		if(numberOne > numberTwo) {
			System.out.println("number One is greater");
		}
		else if(numberTwo > numberOne) {
			System.out.println("number Two is greater");
		}

		
	}
	}