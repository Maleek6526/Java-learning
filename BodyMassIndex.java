import java.util.Scanner;

public class computingBodyMassIndex{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the weight in pounds: ");
	double weightInPounds = input.nextDouble();

	System.out.print("Enter the height in inches: ");
	double heightInInches = input.nextDouble();
;
	double bodyMassIndex = math.pow(weightInPounds,2) / math.pow(heightInInches, 2);


	System.out.printf("BMI is: %f",bodyMassIndex);
	
	
}}