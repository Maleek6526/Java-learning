import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first integer: ");
	int inputs1 = input.nextInt();

	System.out.print("Enter the second integer: ");
	int inputs2 = input.nextInt();

	int input1Squared = inputs1 * inputs1;
	System.out.printf("The square of input one is: %d%n", input1Squared);
	int input2Squared = inputs2 * inputs2;
	System.out.printf("The square of input two is: %d%n", input2Squared);

	int sumOfSquares = input1Squared + input2Squared;
	System.out.printf("The sum of their squares is: %d%n", sumOfSquares);

	int differenceOfSquares = input1Squared - input2Squared;
	System.out.printf("The difference between the squares is: %d", differenceOfSquares);	
	
}
}