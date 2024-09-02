import java.util.Scanner;

public class TaxCalculator{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name citizen one: ");
		String citizenOneName = input.nextLine();

		System.out.print("Enter your name citizen two: ");
		String citizenTwoName = input.nextLine();

		System.out.print("Enter your name citizen three: ");
		String citizenThreeName = input.nextLine();




		System.out.print("Enter your earnings citizen one: ");
		double citizenOneEarning = input.nextInt();

		System.out.print("Enter your earnings citizen two: ");
		double citizenTwoEarning = input.nextInt();

		System.out.print("Enter your earnings citizen three: ");
		double citizenThreeEarning = input.nextInt();

		double minimumEarning = 30000;


	if(citizenOneEarning <= minimumEarning && citizenTwoEarning <= minimumEarning && citizenThreeEarning <= minimumEarning){

		double taskCitizenOne = (15 / 100) * citizenOneEarning;
		double taskCitizenTwo = (15 / 100) * citizenTwoEarning;
		double taskCitizenThree = (15 / 100) * citizenThreeEarning;

	System.out.printf("%s task is: %f%n",citizenOneName, taskCitizenOne);
	System.out.printf("%s task is: %f%n",citizenTwoName, taskCitizenTwo);
	System.out.printf("%s task is: %f%n",citizenThreeName, taskCitizenThree);

	}




	if(citizenOneEarning > minimumEarning && citizenTwoEarning > minimumEarning && citizenThreeEarning > minimumEarning){

		double taskCitizenOne = (20 / 100) * citizenOneEarning;
		double taskCitizenTwo = (20 / 100) * citizenTwoEarning;
		double taskCitizenThree = (20 / 100) * citizenThreeEarning;

	System.out.printf("%s task is: %f%n",citizenOneName, taskCitizenOne);
	System.out.printf("%s task is: %f%n",citizenTwoName, taskCitizenTwo);
	System.out.printf("%s task is: %f%n",citizenThreeName, taskCitizenThree);


	}

	}


}