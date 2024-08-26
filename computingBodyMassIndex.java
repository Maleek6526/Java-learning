import java.util.Scanner;

public class computingBodyMassIndex{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the weight in pounds: ");
	double weightInPounds = input.nextDouble();

	System.out.print("Enter the height in inches: ");
	double heightInInches = input.nextDouble();
;
	double bodyMassIndex = weightInPounds * 0.45359237 / Math.pow(heightInInches * 0.0254, 2);


	System.out.printf("BMI is: %f",bodyMassIndex);
	
	
}}