import java.util.Scanner;

public class UsersScore {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);


	int passMark = 50;
	int count = 1;

	while(count <= 10) {

		System.out.print("Enter your score: ");
		int usersInput = scanner.nextInt();

		if(usersInput >= passMark) {
			System.out.println("pass");
		
		}
		if(usersInput < passMark) {
			System.out.println("fail");
		}

	count++;

	}
}
}