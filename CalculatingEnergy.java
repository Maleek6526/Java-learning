import java.util.Scanner;

public class CalculatingEnergy{

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an amount of water in kilograms: ");
	double amountOfWater = input.nextDouble();

	System.out.print("Enter the initial temperature of the water: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter final temperature of the water: ");
	double finalTemperature = input.nextDouble();

	double energyNeeded = amountOfWater * (finalTemperature - initialTemperature) * 4184;

	System.out.printf("The value of energy needed to heat water is: %f", energyNeeded);
 }







}