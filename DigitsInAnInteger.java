import java.util.Scanner;

public class DigitsInAnInteger{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 0 and 1000: ");
	int digits = input.nextInt();


	int edit = digits % 10;
	int extract = digits / 10;

	
	int editted = extract % 10;
	int extracted = extract / 10;

	int sum = editted + extracted + edit;

	System.out.printf("The sum of the digits is: %d", sum);
}
	}