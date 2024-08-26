import java.util.Scanner;

public class costOfDriving{

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the distance to drive: ");

	double distanceToDrive = input.nextDouble();


	System.out.print("Enter the fuel efficiency of the Car in miles per gallon: ");

	double fuelEfficiency = input.nextDouble();

	System.out.print("Enter the price per gallon: ");

	double pricePerGallon = input.nextDouble();


	double newCostOfDriving = distanceToDrive / fuelEfficiency * pricePerGallon;


	System.out.printf("The Cost of Driving Is: %c%.f", '$',newCostOfDriving);
}
}