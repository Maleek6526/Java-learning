import java.util.Scanner;

public class TheAreaOfATriangle{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the value for side1: ");
		double value1 = input.nextDouble();

		System.out.print("Enter the value for side2: ");
		double value2 = input.nextDouble();

		System.out.print("Enter the  value for side3: ");
		double value3 = input.nextDouble();

		double sides = value1 + value2 + value3; 
		double area = Math.sqrt(sides*(sides-value1)*(sides-value2)*(sides-value1));

		System.out.printf("The value for area is: %f", area);


}

}