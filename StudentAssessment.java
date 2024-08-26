import java.util.Scanner;

public class StudentAssessment{

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);


	System.out.print("Enter your score:");
	int userscore = input.nextInt();

	int passmark = 60;
	int end = -1;

	
	while(userscore == -1){

	System.out.println("your program has ended");

	userscore++;

	break;

	}

	if(userscore>=60){

	System.out.print("You pass the exam");

	}

	else{

	System.out.println("You don't pass the exam");
	
	}

	


	}






}