import java.util.Scanner;

public class GasMileage{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of trips: ");
		double numberOfTrips = input.nextDouble();

		double totalMiles = 0;
		double totalGallons = 0;

		for(int count = 1; count <= numberOfTrips; count++){

			System.out.print("Enter the miles driven: ");
			double milesDriven = input.nextDouble();

			totalMiles = totalMiles + milesDriven;

			System.out.print("Enter the gallon used: ");
			double gallonUsed = input.nextDouble();

			totalGallons = totalGallons + gallonUsed;

			double average = milesDriven / gallonUsed;

		}

		double totalAverage = totalMiles / totalGallons;
		System.out.print(totalAverage);

		


		

	}





}