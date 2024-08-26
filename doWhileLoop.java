import java.util.Scanner;

public class doWhileLoop{

	public static void main(String[] args);
	Scanner input =  new Scanner(System.in);
		

	do{

	System.out.print("Enter the first integer: ");
	int first = input.nextInt();

	System.out.print("Enter the second integer: ");
	int second = input.nextInt();

	int sum = first + second;

	system.out.println("The sum is: " + sum);

	}

	/*while(true) {
	System.out.print("Do you still want to contine your operation? press 1 for yes, press 2 for no");
	int choice = input.nextInt();

	if(choice == 1) {
	

}
	}*/


}