import java.util.Scanner;

public class WholeNumbers{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number ranging from 1 to 10: ");
	int usersInput = input.nextInt();



	if(usersInput == 0) {
		System.out.println("Zero");
	}
	if(usersInput == 1) {
		System.out.println("One");
	}
	if(usersInput == 2) {
		System.out.println("Two");
	}
	if(usersInput == 3) {
		System.out.println("Three");
	}
	if(usersInput == 4) {
		System.out.println("Four");
	}
	if(usersInput == 5) {
		System.out.println("Five");
	}
	if(usersInput == 6) {
		System.out.println("Six");
	}
	if(usersInput == 7) {
		System.out.println("Seven");
	}
	if(usersInput == 8) {
		System.out.println("Eight");
	}
	if(usersInput == 9) {
		System.out.println("Nine");
	}
	if(usersInput == 10) {
		System.out.println("Ten");
	}
	if(usersInput < 0) {
		System.out.println("it can't be lesser than zero");
	}
	if(usersInput > 10) {
		System.out.println("It can't be greater than 10");
	}

	}
	}