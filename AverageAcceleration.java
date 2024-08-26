import java.util.Scanner;

public class Acceleration{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the value for the starting velocity in (m/s): ");
	double startingVelocity = input.nextDouble();

	System.out.print("Enter the value for the ending velocity in (m/s): ");
	double endingVelocity = input.nextDouble();

	System.out.print("Enter the value for the time span in (seconds): ");
	double timeSpan = input.nextDouble();


	double averageAcceleration = (endingVelocity - startingVelocity) / timeSpan;


	System.out.printf("The average acceleration is: %f",averageAcceleration);


}


}