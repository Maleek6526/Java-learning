import java.util.Scanner;

public class LargestAndSmallestNumbersEntered{
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int largest = 0;
	int smallest = 0;
	int count = 0;
	int usersInput = 0;


	System.out.print("Enter the number: ");
	usersInput = scanner.nextInt();
	
	while(true){
	
	if(usersInput < smallest) {

		usersInput = smallest;

		System.out.println("The smallest number is:" + smallest);

	if(usersInput > largest) {

		usersinput = largest;
		System.out.println("The largest number is:" + largest);		
		}
	
		}
		

	}



}}