import java.util.Scanner;

public class AtmMAchineAppTest{

	public static void main(String[] args){

		AtmMAchineApp atmTest = new AtmMAchineApp();

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
		case 2: deposit(); break;
		case 3: withdraw(); break;
		case 4: accountBalance(); break;
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

	AtmMAchineApp atmTest = new AtmMAchineApp();

	Scanner scanner = new Scanner(System.in);

	System.out.print("Please enter your first name: ");

	String firstName = scanner.next();


	System.out.print("Please enter your last name: ");

	String lastName = scanner.next();


	System.out.print("Please enter four digit pin: ");

	int usersPin = scanner.nextInt();

	if(usersPin >= 1000 && usersPin <= 9999){

		atmTest.setFirstName(firstName);
		atmTest.setLastName(lastName);
		atmTest.setUsersPin(usersPin);

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
			
			    ADDITIONAL FEATURES!!! SHOCKS YOU RIGHT???

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


public static void deposit(){

	AtmMAchineApp atmTest = new AtmMAchineApp();

	String depositDisplay = """ 

			===================================================

				YOU HAVE SELECTED THE DEPOSIT OPTION


					PLEASE HAVE FUN!

			===================================================
		

		""";

	System.out.println(depositDisplay);

	System.out.printf("Your new balance is $ %,f %n", atmTest.getUserBalance());

	Scanner scanner = new Scanner(System.in);

	System.out.print("Please amount for deposit: ");
	double usersAccountDeposit = scanner.nextDouble();

	atmTest.usersDeposit(usersAccountDeposit);
			

	System.out.printf("You've successfully deposited %,f into your account %n",usersAccountDeposit);


	String previousMenu = """ 
			===================================================
			
			    ADDITIONAL FEATURES!!! SHOCKS YOU RIGHT???

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

	AtmMAchineApp atmTest = new AtmMAchineApp();

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

		atmTest.usersWithdrawal(usersAccountWithdrawal);



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
			
			    ADDITIONAL FEATURES!!! SHOCKS YOU RIGHT???

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

	AtmMAchineApp atmTest = new AtmMAchineApp();

	String accountBalanceDisplay = """ 

			================================================================

				YOU HAVE SELECTED THE ACCOUNT BALANCE CHECK OPTION


						PLEASE HAVE FUN!

			================================================================		

		""";

	System.out.println(accountBalanceDisplay);

	System.out.println("Your first name is: "+ atmTest.getFirstName());
	System.out.println("Your last name is: "+ atmTest.getLastName());
	System.out.println("Your pin is saved and secured successfully: ****");

	System.out.printf("Your new balance is $ %,f %n", atmTest.getUserBalance());


	String UserPreviousMenu = """ 
			===================================================
			
			    ADDITIONAL FEATURES!!! SHOCKS YOU RIGHT???

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
