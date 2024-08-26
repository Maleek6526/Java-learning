import java.util.Scanner;

public class DiameterCircumference{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first integer:");
	double radius = input.nextDouble();

	double diameter = 2 * radius;
	double circumference = 2 * Math.PI * radius;
	double area = Math.PI * Math.pow(radius,2);

	System.out.printf("Diameter is: %f%n", diameter); 
	System.out.printf("Circumference is: %f%n", circumference);
	System.out.printf("Area is: %f%n", area);


}}