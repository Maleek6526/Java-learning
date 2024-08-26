import java.util.Scanner;

public class ArithmeticSmallestAndLargest{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		double integer1 = input.nextDouble();

		System.out.print("Enter the second integer: ");
		double integer2 = input.nextDouble();

		System.out.print("Enter the third integer: ");
		double integer3 = input.nextDouble();

		double sum = integer1 + integer2 + integer3;
		System.out.printf("The sum of the number is: %f%n", sum);


		double average = sum / 3;
		System.out.printf("The average number is: %f%n", average);

		double product = sum * 3;
		System.out.printf("The product of the number number is: %f%n", product);
		
		if(integer1 > integer2 && integer1 > integer3) {
			System.out.println("The first integer is the largest");
		}
		if(integer2 > integer1 && integer2 > integer3){
			System.out.println("The second integer is the largest");
		}
		if(integer3 > integer1 && integer3 > integer2){
			System.out.println("The third integer is greater");
		}
		if(integer1 < integer2 && integer1 < integer3){
			System.out.println("The first integer is the smallest");
		}
		if(integer2 < integer1 && integer2 < integer3){
			System.out.println("The second integer is the smallest");
		}

		if(integer3 < integer1 && integer3 < integer2){
			System.out.println("The third integer is the smallest");
		}

	
		


}

}