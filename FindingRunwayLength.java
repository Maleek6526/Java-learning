import java.util.Scanner;

public class FindingRunwayLength{

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	

	System.out.print("Enter the value of speed in (m/s): ");

	double speed = input.nextDouble();

	

	System.out.print("Enter the value of acceleration in (m/s^2): ");

	double acceleration = input.nextDouble();

	
	double minimumRunwayLength = Math.pow(speed, 2) / (2 * acceleration);

	System.out.printf("The minimum runway length is: %f", minimumRunwayLength);
}








}