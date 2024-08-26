import java.util.Scanner;
public class PerimeterOfACircle{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	System.out.print("Enter radius: ");
	double radius = input.nextDouble();


	double pi = 3.14159;
	double perimeter = 2 * radius * pi;
	System.out.printf("The perimeter is: %f%n", perimeter);


	double area = radius * radius * pi;
	System.out.printf("The area is: %f%n", area);









}}
