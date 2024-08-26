import java.util.Scanner;

public class PersonalTask{

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);


	System.out.print("Enter the first integer: ");
	int first = scanner.nextInt();

	System.out.print("Enter the first integer: ");
	int second = scanner.nextInt();

	System.out.print("Enter the first integer: ");
	int third = scanner.nextInt();


	int smallest = first;
	int largest = first;

	int sum = first + second + third;
	int average = sum/3;
	int product = first * second * third;

	if(largest>second) {
		System.out.printf(" %d%n", largest);	
	}
	else if(largest>third) {
		System.out.printf("%d%n", largest);	
	}
	else if(largest<second) {
		System.out.printf("%d%n", second);	
	}
	else if(largest<third) {
		System.out.printf("%d%n", third);	
	}



	if(smallest<second) {
		System.out.printf("%d%n", smallest);	
	}
	else if(smallest<third) {
		System.out.printf("%d%n", smallest);	
	}
	else if(smallest>second) {
		System.out.printf("%d%n", second);	
	}
	else if(smallest>third) {
		System.out.printf("%d%n", third);	
	
	}
	
	}

}