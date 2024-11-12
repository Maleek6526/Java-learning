import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class CheckOut{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> CheckOutGoods = new ArrayList <>();
		ArrayList<String> CheckOut = new ArrayList <>();
		ArrayList<Float> CheckOutGood = new ArrayList <>();

		
		System.out.println("What is the customer's name: ");
		String usersName = scanner.nextLine();

		CheckOut.add(usersName);

	while(true){

		System.out.println("What did the user buy? ");
		String usersPurchase = scanner.nextLine();

		CheckOut.add(usersPurchase);

		System.out.println("How many pieces? ");
		int piecesPurchased = scanner.nextInt();

		CheckOutGoods.add(piecesPurchased);

		System.out.println("How much per unit? ");
		float pricePerUnit = scanner.nextFloat();

		CheckOutGood.add(pricePerUnit);

		System.out.println("Add more items? (yes/no) ");
		String choice = scanner.next();

		scanner.nextLine();

		if(choice.equalsIgnoreCase("no")) break;		

	}


	System.out.println("What is your name? ");
	String cashierName = scanner.nextLine();

	System.out.println("How much discount will he get? ");
	int discount = scanner.nextInt();




	String reciept = """ 

			SEMICOLON STORES
			MAIN BRANCH
			LOCATION 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS.
			TEL: 03293828343
			DATE: 18-DEC-22 8:48:11 PM
		""";

	System.out.println(reciept);

	System.out.println("Cashier: "+ cashierName);

	//System.out.println("Customer Name: " + usersName);

	for(int count : CheckOutGoods){
		System.out.println(count);
	}

	for(float count : CheckOutGood){
		System.out.println(count);
	}

	for(String count : CheckOut){
		System.out.println(count);
	}


	}

}