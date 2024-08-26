import java.util.Scanner;

public class ConditionalStatement{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();

	if (number > 18){
		System.out.println("You can vote in an election");
	} else if(number == 16){
		System.out.println("Two more years to go");
	}
	
	else {
		System.out.println("You cannot vote");
	}

	}
}