import java.util.Scanner;

public class poundsToKilogram{

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in pounds: ");

	double pounds = input.nextDouble();

	double oneKilogram = 0.454;

	double kilogram = pounds * oneKilogram;

	System.out.printf("The result is: %f", kilogram);

	

	

}

}