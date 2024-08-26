import java.util.Scanner;

public class Kata{

	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	int userInput = scanner.nextInt();
	System.out.println(isEven(userInput));

	System.out.print("Enter an integer: ");
	int userInput1 = scanner.nextInt();
	System.out.println(isPrime(userInput1));

	System.out.print("Enter an integer: ");
	int userInput2 = scanner.nextInt();
	System.out.println(factorOf(userInput2)+" is the factor");

	System.out.print("Enter an integer: ");
	int userInput3 = scanner.nextInt();
	System.out.println(isSquare(userInput3));
	
	System.out.print("Enter an integer: ");
	int userInput4 = scanner.nextInt();
	System.out.println(squareOf(userInput4)+ " is the square");
	
	/*System.out.print("Enter an integer: ");
	int userInput5 = scanner.nextInt();
	System.out.println(factorialOf(userInput5));*/


	System.out.print("Enter the first integer: ");
	int integer1 = scanner.nextInt();
	System.out.print("Enter the second integer: ");
	int integer2 = scanner.nextInt();
	System.out.println(subtractInteger(integer1, integer2));


	System.out.print("Enter the first integer: ");
	int integer3 = scanner.nextInt();
	System.out.print("Enter the second integer: ");
	int integer4 = scanner.nextInt();
	System.out.println(divide(integer3, integer4));


	System.out.print("Enter the five integers: ");
	int palindromeTest = scanner.nextInt();
	System.out.println(isPalindrome(palindromeTest));
	
}


public static boolean isEven(int peter){
	
	if(peter % 2 == 0){
		return true;
	}
	return false;

}


public static boolean isPrime(int prime){

	int counter = 0;

	for(int count = 1;count <= prime; count= count + 1) {

		if(prime % count == 0) {

			counter++;
				
		}

	}	
	if(counter == 2) {
		return true;
	}
	return false;

}



public static int subtractInteger(int minus, int num){
	int sub = minus - num;
	return sub;

}



public static int divide(int one, int two){
	int div = one / two;
	return div;

}


public static int factorOf(int factor){

	int counter = 0;

		for(int count = 1;count <= factor; count= count + 1) {

			if(factor % count == 0) {

				counter++;
				
				
			}	

		}return counter;

}



public static boolean isSquare(double number){
	double square = Math.sqrt(number);
	if(number % square == 0){
		return true;
	}
	return false;


}




public static boolean isPalindrome(int palindromeTest){

	int firstNumber = palindromeTest / 10000;
	int firstNumber1 = palindromeTest % 10;
	int firstNumber2 = palindromeTest / 10;
	int secondNumber = firstNumber2 % 10;
	int secondNumber2 = firstNumber2 / 10;
	int thirdNumber = secondNumber2 % 10;
	int thirdNumber1 = secondNumber2 / 10;
	int fourthNumber = thirdNumber1 % 10;
	int fourthNumber1 = thirdNumber1 / 10;
	int firstNumberLast = palindromeTest / 10000;

		

	if(firstNumberLast == firstNumber1){

	return true;

	}
	return false;

}


/*public static long factorialOf(int factor){
	
	int counter = 1;
	for(int count = 1; count <= factor; count--) {
		counter++;
		
	}*/


public static long squareOf(int square){
	int squared = square * square;
		return squared;


}


}


