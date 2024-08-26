import java.util.Scanner;

public class DigitsInAnInteger11{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 0 and 1000: ");
	int digits = input.nextInt();

	int reduce = digits % 10;
	int reduced = digits / 10;
	int reducer = reduced % 10;
	int redu = reduced / 10;
	int red = redu % 10;
	int ree = redu / 10;

	int sum = red + reducer+ reduce;
	System.out.printf("The sum is: %d", sum);










}}