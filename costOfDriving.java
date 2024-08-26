import java.util.Scanner;

public class CostOfDriving{

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter the driving distance: ");
	double distanceToDrive = input.nextDouble();

	System.out.print("Enter the miles per gallon: ");
	double fuelEfficiency = input.nextDouble();

	System.out.print("Enter the price per gallon: ");
	double pricePerGallon = input.nextDouble();
	


	double distanceDividesFuel = distanceToDrive / fuelEfficiency;
	double costOfDriving = distanceDividesFuel * pricePerGallon;

	System.out.printf("The cost of driving is: %f", costOfDriving);
	

}
}