import java.util.Scanner;

public class CreatingAComparator{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = scanner.nextInt();


		if(firstNumber==secondNumber){
		
			System.out.print("0");

		}

		if(firstNumber>secondNumber){

			System.out.print("1");

		}

		if(firstNumber<secondNumber){

			System.out.print("-1");

		}


	}

}