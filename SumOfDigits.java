import java.util.Scanner;

public class SumOfDigits{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter any integer between 0 and 1000: ");
	int newInt = input.nextInt();
	
	int sum = 0;

	while(newInt > 0) {
		sum += newInt % 10;
	newInt = newInt / 10;
}

	System.out.printf("The sum of the digit is: %d", sum);


}
}