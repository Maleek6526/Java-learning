import java.util.Scanner;

public class Task{


	public static void main(String[] args) {

	Scanner input = new Scanner("System.in");

	System.out.println("Enter the First Integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter the Second Integer: ");
	int number2 = input.nextInt();

	int sum = number1 + number2;

	System.out.printf("The sum is %d", sum);


}
}