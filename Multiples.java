import java.util.Scanner;

public class Multiples{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first integer:");
	double first = input.nextDouble();

	System.out.print("Enter the second integer:");
	double second = input.nextDouble();


	double theValue1 = 3 * first;
	double theValue2 = 2 * second;

	double multiple = theValue1 % theValue2;

	if(multiple == 0) {
		System.out.println("It is a multiple");
	}
	if(multiple != 0) {
		System.out.println("It is not a multiple");
	}




}
	}