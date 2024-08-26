import java.util.Scanner;

public class LargestAndSmallestNumber{

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	//int number = 0;
	int userInput = 0;
	

	while(true){
	if(userInput > number){
	System.out.print("Too high, try again!");
	userInput = input.nextInt();
	
	}

	else if(userInput < number){
	System.out.print("Too low, try again!");
	userInput = input.nextInt();
	
	}

	else if(userInput == number){
	System.out.print("Excellent!");
	userInput = input.nextInt();
	break;
	}

	else{
		System.out.println("Wrong! but don't give up!");
		
	}

	
		}

	
	}
}