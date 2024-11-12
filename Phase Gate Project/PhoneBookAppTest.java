import java.util.Scanner;
public class PhoneBookAppTest{

	public static void main(String[] args){

		PhoneBookApp phoneBook= new PhoneBookApp();

		mainMenu();

	}


public static void mainMenu(){

	String menu = """ 

		============================
			PHONEBBOK APP 
		============================
		1. Add contact
		2. Remove contact
		3. Find contact by phone number
		4. Find contact by first name
		5. Find contact by last name
		6. Edit contact
		0. Exit app

			""";

	System.out.println(menu);
	Scanner scanner = new Scanner(System.in);

	System.out.print("Input here to continue: ");
	int choice = scanner.nextInt();


	switch(choice){

		case 1: addContact(); break;
		default: System.out.println("Invalid input");

	}
	


}

public static void addContact(){

	Scanner scanner = new Scanner(System.in);
	PhoneBookApp phoneBook= new PhoneBookApp();

	System.out.print("Please enter you name: ");
	String usersName = scanner.nextLine();

	phoneBook.setName(usersName);

	System.out.print("Please enter you address: ");
	String usersAddress = scanner.nextLine();

	phoneBook.setAddress(usersAddress);

	System.out.print("Please enter phone number: ");
	String usersTelephone = scanner.nextLine();

	if(usersTelephone.length() == 11){

		phoneBook.setAddress(usersTelephone);

		System.out.print("Please enter email: ");
		String usersEmail = scanner.next();

		phoneBook.setEmail(usersEmail);

		System.out.println("Contact Saved!");

	}

	else{

		System.out.println("Check the phone number and try again!");

	}

}

}

