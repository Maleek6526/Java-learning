import java.util.Scanner;

public class powerRaisedToOther{
	
		public static void main(String[] args) {
		Scanner counter = new Scanner(System.in);

		System.out.print("Enter the first number: ");

		int first = counter.nextInt();

		System.out.print("Enter the second number: ");

		int second = counter.nextInt();

	int power = first * first;
	
	int count = 0;

	while(count < second-2) {
		power = first * first;

		count++;

	}

	System.out.println(power);

	



}}