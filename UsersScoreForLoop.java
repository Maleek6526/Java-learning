import java.util.Scanner;

public class UsersScoreForLoop {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	

	for(int count = 1;count <= 10;count++) {
	int passMark = 50;

		System.out.print("Enter your score: ");
		int usersInput = scanner.nextInt();

		if(usersInput >= passMark) {
			System.out.println("pass");
		
		}
		if(usersInput < passMark) {
			System.out.println("fail");
		}


	}
}
}