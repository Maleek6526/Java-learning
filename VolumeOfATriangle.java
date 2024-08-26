import java.util.Scanner;
public class VolumeOfATriangle{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of sides: ");
		int lengthOfSides = input.nextInt();

		int area1 = Math.sqrt(3);
		int area11 = area1 / 4;
		int area111= Math.pow(lengthOfSides,2)
		int area = area11 * area111;

		int volume = area * lengthOfSides;

		System.out.printf("The volume of a triangular prism %f%n", volume);
	
	}
	}
