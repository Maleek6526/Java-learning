import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class AtmMAchineAppTest{

	private static ArrayList<AtmMAchineApp> bank = new ArrayList<AtmMAchineApp>();
	
	public static void main(String[] args){

		atmDisplay();

	}

public static void atmDisplay(){

	String display = """ 

		=====================================================
	
			GREETINGS TO YOU DEAR CUSTOMER!

		=====================================================

			HOW MAY WE HELP YOU TODAY?

		    press 1: To open an account with us
		    press 2: To deposit into your account
		    press 3: To withdraw from your account
		    press 4: To check your account balance
		    press 5: To transfer to another account
		    press 6: To change your pin
		    press 0: To quit the bank app

		=====================================================

		""";

	System.out.println(display);

	Scanner scanner = new Scanner(System.in);

	System.out.print("Input your choice in me biko: ");
	int usersChoice = scanner.nextInt();

	switch(usersChoice){

		case 1: openNewAccount(); break;
		case 2: checkAccountStatus(); break;
		case 3: deposit(); break;
		case 4: withdraw(); break;
		case 5: accountBalance(); break;
		//case 5: transfer(); break;
		//case 6: changePin(); break;
		case 0: quit(); break;
		default: System.out.println("Ah ah oga Check the options again!");
	}


}


public static void openNewAccount(){


	String accountDisplay = """ 
		
			===================================================

				NEW USER??? WE ARE HAPPY TO HAVE YOU


				PLEASE DO FOLLOW THE PROCEEDURES

			===================================================
			
			""";

	System.out.println(accountDisplay);

	Scanner scanner = new Scanner(System.in);

	System.out.print("Please enter your first name: ");

	String firstName = scanner.next();


	System.out.print("Please enter your last name: ");

	String lastName = scanner.next();


	System.out.print("Please enter four digit pin: ");

	String usersPin = scanner.next();

	if(usersPin.length() == 4){

		AtmMAchineApp atmTest = new AtmMAchineApp();

		atmTest.setFirstName(firstName);
		atmTest.setLastName(lastName);
		atmTest.setUsersPin(usersPin);

		bank.add(atmTest);

		System.out.println("Your first name is: "+ atmTest.getFirstName());
		System.out.println("Your last name is: "+ atmTest.getLastName());
		System.out.println("Your pin is saved and secured successfully: ****");


		String acceptedUserDisplay = """ 

			===================================================

				CONGRATULATIONS DEAR NEW USER!!!


			       YOU ARE ELIGIBLE TO ENJOY OUR APP!

			===================================================


			""";

		System.out.println(acceptedUserDisplay);

	}


	else{

		System.out.println("We only accept four valid input for passwords");
	}

	String menu = """ 
			===================================================

				Press 1: To go back to the menu

				press 0: To quit the app

			===================================================

			""";

	System.out.println(menu);

	System.out.print("Input your choice in me biko: ");
	int Menu = scanner.nextInt();


	switch(Menu){

		case 1: atmDisplay(); break;
		case 0: quit(); break;
		default: System.out.println("Enter the right input!!");


	}



}



public static void checkAccountStatus(){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your first name: ");
	String userAccountName = scanner.next();

	System.out.print("Enter your pin: ");
	String userAccountPin = scanner.next();

	for(AtmMAchineApp atmMAchineApp : bank){
		if(AtmMAchineApp.getFirstName().equals(userAccountName) && AtmMAchineApp.getUsersPin().equals(userAccountPin)){
			System.out.println("Hi! welcome");
		}
		else{
			System.out.print("Please you need to register first!");
		}
	}

}


public static void deposit(){

	String depositDisplay = """ 

			===================================================

				YOU HAVE SELECTED THE DEPOSIT OPTION


					PLEASE HAVE FUN!

			===================================================
		

		""";

	System.out.println(depositDisplay);

	Scanner scanner = new Scanner(System.in);

	System.out.print("Please amount for deposit: ");
	double usersAccountDeposit = scanner.nextDouble();

	for(AtmMAchineApp account : bank){

		account.usersDeposit(usersAccountDeposit);
	}		

	System.out.printf("You've successfully deposited %,f into your account %n",usersAccountDeposit);


	String previousMenu = """ 
			===================================================

				Press 1: To go back to the menu

				press 0: To quit the app

			===================================================

			""";

	System.out.println(previousMenu);

	System.out.print("Input your choice in me biko: ");
	int backToMenu = scanner.nextInt();


	switch(backToMenu){

		case 1: atmDisplay(); break;
		case 0: quit(); break;
		default: System.out.println("Enter the right input!!");


	}


}



public static void withdraw(){

	String withdrawDisplay = """ 

			===================================================

				YOU HAVE SELECTED THE WITHDRAWAL OPTION


					PLEASE HAVE FUN!

			===================================================		

		""";

	System.out.println(withdrawDisplay);

	Scanner scanner = new Scanner(System.in);

	System.out.print("Please amount for withdraw: ");
	double usersAccountWithdrawal = scanner.nextDouble();

	if(usersAccountWithdrawal > 0){

	for(AtmMAchineApp account : bank){

		account.usersWithdrawal(usersAccountWithdrawal);
	
	}	

	System.out.printf("You've successfully withdraw %,f from your account %n",usersAccountWithdrawal);	



		String successfulWithdrawalDisplay = """ 

			===================================================

				YOU'VE HAD A SUCCESSFUL WITHDRAWAL 


				     CHECK BALANCE TO CONFIRM

			===================================================	




			""";

	}

	else{
		System.out.println("Invalid Amount Withdrawer");

		}


	String previous = """ 
			===================================================

				Press 1: To go back to the menu

				press 0: To quit the app

			===================================================

			""";

	System.out.println(previous);

	System.out.print("Input your choice in me biko: ");
	int back = scanner.nextInt();


	switch(back){

		case 1: atmDisplay(); break;
		case 0: quit(); break;
		default: System.out.println("Enter the right input!!");


	}



}



public static void accountBalance(){

	String accountBalanceDisplay = """ 

			================================================================

				YOU HAVE SELECTED THE ACCOUNT BALANCE CHECK OPTION


						PLEASE HAVE FUN!

			================================================================		

		""";

	System.out.println(accountBalanceDisplay);

	for(AtmMAchineApp account : bank){

	
		System.out.println("Your first name is: "+ account.getFirstName());
		System.out.println("Your last name is: "+ account.getLastName());
		System.out.println("Your pin is saved and secured successfully: ****");

		System.out.printf("Your new balance is $ %,f %n", account.getUserBalance());



	}

	

	String UserPreviousMenu = """ 
			===================================================

				Press 1: To go back to the menu

				press 0: To quit the app

			===================================================

			""";

	System.out.println(UserPreviousMenu);

	Scanner scanner = new Scanner(System.in);
	System.out.print("Input your choice in me biko: ");
	int toMenu = scanner.nextInt();


	switch(toMenu){

		case 1: atmDisplay(); break;
		case 0: quit(); break;
		default: System.out.println("Enter the right input!!");


	}

	
}



public static void quit(){

	String quitDisplay = """ 

			===================================================

				YOU HAVE SELECTED THE EXIT OPTION


				THANK YOU FOR TRUSTING OUR APP!

			===================================================		

		""";	

	System.out.println(quitDisplay);

}


}
