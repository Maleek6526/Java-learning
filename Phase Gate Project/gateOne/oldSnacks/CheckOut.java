import java.util.Scanner;
public class CheckOut{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);



	while(true){

		System.out.println("What is the customer's name: ");
		String usersName = scanner.nextLine();

		System.out.println("What did the user buy? ");
		String usersPurchase = scanner.nextLine();

		System.out.println("How many pieces? ");
		int piecesPurchased = scanner.nextInt();

		System.out.println("How much per unit? ");
		float pricePerUnit = scanner.nextFloat();

		System.out.println("Add more items? (yes/no) ");
		String choice = scanner.next();

		scanner.nextLine();

		if(choice.equalsIgnoreCase("no")) break;		

	}


	System.out.println("What is your name? ");
	String cashierName = scanner.nextLine();

	System.out.println("How much discount will he get? ");
	int discount = scanner.nextInt();

	}

}