import java.util.Scanner;

public class SortThreeNumber2{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double userInputOne = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double userInputTwo = scanner.nextDouble();

		System.out.print("Enter the third number: ");
		double userInputThree = scanner.nextDouble();

		displaySortedNumbers(userInputOne,userInputTwo,userInputThree);

	}

public static void displaySortedNumbers(double number1, double number2, double number3){

	if(number1 > number2  && number1 > number3 && number2 > number3){
		System.out.printf("%.1f%n%.1f%n%.1f",number1, number2,number3);
	}

	if(number2 > number1 && number2 > number3 && number1 > number3){
		System.out.printf("%.1f%n%.1f%n%.1f", number2 , number1, number3);
	}

	if(number3 > number1 && number3 > number2 && number1 > number2){
		System.out.printf("%.1f%n%.1f%n%.1f", number3 , number1 , number3);
	}



	if(number1 > number2  && number1 > number3 && number2 < number3){
		System.out.printf("%.1f%n%.1f%n%.1f",number1, number3,number2);
	}

	if(number2 > number1 && number2 > number3 && number1 < number3){
		System.out.printf("%.1f%n%.1f%n%.1f", number2 , number3, number1);
	}

	if(number3 > number1 && number3 > number2 && number1 < number2){
		System.out.printf("%.1f%n%.1f%n%.1f", number3 , number2 , number1);
	}


}



}