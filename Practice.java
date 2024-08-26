import java.util.Scanner;
public class Practice{

	public static void main(String... args){

	Scanner scanner = new Scanner(System.in);

	int firstNum = collectInput(scanner);
	int secondNum = collectInput(scanner);
	System.out.println(isPrimeNumber(firstNum));
	System.out.println(isPrimeNumber(secondNum));

	int sum = addNumbers(firstNum, secondNum);
	int product = getProduct(firstNum, secondNum);
	System.out.println(isPrimeNumber(product));


	System.out.println(sum + product);
	}

	public static int addNumbers(int firstNumber, int secondNumber){
		return firstNumber + secondNumber;		
	}

	public static int getProduct(int numberOne, int numberTwo){
		return numberOne * numberTwo;
	}

	public static int collectInput(Scanner input){
		System.out.println("Enter a number");
		return input.nextInt();
	}

	public static boolean isPrimeNumber(int number){

		int counter = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0)counter++;
		}
		if (counter == 2) return true;
		else return false;
	}



}