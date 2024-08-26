import java.util.Scanner;

public class largestAndSmallestNumbers{

	public static void main(String[] args) {
	Scanner counter = new Scanner(System.in);

	int largest = 0, smallest = 0;

	for(int i=1; i>0; i++) {
	
	System.out.println("Enter a number: ");
	int usersInput = counter.nextInt();

	if(usersInput>0){
		positive++;
	}

	else if(usersInput<0){
		negative++;
	}
	else{
		zero++;
	}

	System.out.println("Enter 8 to exit and you can as well continue to enter numbers: ");
	
	int choice = counter.nextInt();

	if(choice==8){
		break;
	}
}
	System.out.printf("You have entered the positive numbers %d%n", positive);
	System.out.printf("You have entered the negative numbers %d%n", negative);
	System.out.printf("You have entered the zero numbers %d%n", zero);




	


}
}
