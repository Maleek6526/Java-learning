import java.util.Scanner;

public class LargestAndSmallerIntegers{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first integer: ");
	int firstInteger = input.nextInt();

	System.out.print("Enter the second integer: ");
	int secondInteger = input.nextInt();

	System.out.print("Enter the third integer: ");
	int thirdInteger = input.nextInt();

	System.out.print("Enter the fourth integer: ");
	int fourthInteger = input.nextInt();

	System.out.print("Enter the five integer: ");
	int fifthInteger = input.nextInt();

	int largest = firstInteger;
	int smallest = firstInteger;

	if (largest < secondInteger){
		largest = secondInteger;
	}
	if(largest < thirdInteger){
		largest = thirdInteger;
	} 
	if(largest < fourthInteger){
		largest = fourthInteger;
	}
	if(largest < fifthInteger){
		largest = fifthInteger;
	}
	
	System.out.printf("The largest number is: %d%n", largest);


	if(smallest > secondInteger){
		smallest = secondInteger;
	}
	if(smallest > thirdInteger){
		smallest = thirdInteger;
	}
	if(smallest > fourthInteger){
		smallest = fourthInteger;
	}
	if(smallest > fifthInteger){
		smallest = fifthInteger;
	}


	System.out.printf("The smallest number is: %d", smallest);
	
}
}