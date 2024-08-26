import java.util.Scanner;

public class StudentsThatPassed {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);


		int counter = 0;
		int totalPass = 0;
		int totalFail = 0;
		int passMark = 50;

	while(counter < 10) {

		System.out.println("Enter your scores:");
		int score = scanner.nextInt();

	if(score >= passMark){
		System.out.println("pass");
		totalPass = totalPass + 1;
		}
	if(score < passMark){
		System.out.println("fail");
		totalFail = totalFail + 1;
		}
		counter++;
	}

	System.out.printf("Total number of students that passed: %d%n",totalPass);
	System.out.printf("Total number of students that failed: %d%n",totalFail);
	

}}