import java.util.Scanner;
public class PerimeterOfARectangle{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Enter the width value: ");
		double width = input.nextDouble();

		System.out.print("Enter the height value: ");
		double height = input.nextDouble();

		double perimeter = 2 * (width + height);
		System.out.printf("Perimeter is: %f%n", perimeter);

		double area = width * height;
		System.out.printf("area is: %f%n", area);





}}
