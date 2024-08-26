import java.util.Scanner;
public class PerimeterOfATriangle{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	
	System.out.print("Enter the side1: ");
	double side1 = input.nextDouble();

	System.out.print("Enter the side2: ");
	double side2 = input.nextDouble();

	System.out.print("Enter the side3: ");
	double side3 = input.nextDouble();


	double numbersOfSquares = side1 + side2 + side3 / 2;

	double areaCalculation = numbersOfSquares * (numbersOfSquares - side1)*(numbersOfSquares - side2)*(numbersOfSquares - side3);

	double area = Math.sqrt(areaCalculation);

	double areaOfATriangle = numbersOfSquares / area;
	System.out.printf("The area of the triangle is: %f%n", areaOfATriangle);





}}
