import java.util.Scanner;

public class ComputeEnergy{

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an amount of water in kilograms: ");
	double AmountOfWater = input.nextDouble();

	System.out.print("Enter the initial temperature of the water: ");
	double InitialTemperature = input.nextDouble();

	System.out.print("Enter final temperature of the water: ");
	double FinalTemperature = input.nextDouble();

	
	double Temperatures = FinalTemperature - InitialTemperature;
	double AlmostThere = Temperatures * 4184;
	double ComputingEnergy = AlmostThere * AmountOfWater;

	System.out.printf("The value of energy needed to heat water is: %f", ComputingEnergy);
 }







}