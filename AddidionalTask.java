import java.util.Scanner;

	public class AddidionalTask{

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Value:");

	double value1 = input.nextInt();

	System.out.print("Enter Second Value:");

	double value2 = input.nextInt();

	double area = value1*value2;
	double perimeter = 2*(value1+value2);
	System.out.println("The perimeter is " + perimeter);
	System.out.println(area);
	

	


}




}