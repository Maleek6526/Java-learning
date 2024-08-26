import java.util.Scanner;
public class PhoneBook{
	public static void main(String[] args){
		mainMenu();		
	}



	public static void mainMenu(){
		String options = """ 
		1 -> phonebook
		2 -> messages
		3 -> settings
		4 -> Exit
""";
		String choice = collectInput(options);
		switch(choice){
			case "1":
				phonebook();
				break;
			case "2":
				messages();
				break;
			case "3":
				settings();
				break;
			case "4":
				System.exit(69);
			default:
				mainMenu();
		}

	}

	public static void phonebook(){
	  String options = """ 
		1 -> Contacts
		2 -> Add contact
		3 -> Edit contact
	  """;
	 print(options);
	}

	public static void messages(){
	  String options =""" 
		1 -> Inbox
		2 -> Outbox
		3 -> New Message
	""";
	print(options);
		
	}

	public static void settings(){
	  String options =""" 
		1 -> phone settings
		2 -> tone settings
		3 -> security setting
		4 -> back
	""";
		String choice = collectInput(options);
		switch(choice){
			case "1":
				phoneSettings();
				break;
			case "2":
				toneSettings();
				break;
			case "3":
				securitySettings();
				break;
			case "4":
				mainMenu();
		}
	}

	public static void phoneSettings(){}
	public static void toneSettings(){}
	public static void securitySettings(){}

	public static void print(String text){
	  System.out.println(text);
	}

	public static String collectInput(String text){
		Scanner scanner = new Scanner(System.in);
		print(text);
		return scanner.next();
	}

}