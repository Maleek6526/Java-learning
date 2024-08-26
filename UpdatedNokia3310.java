import java.util.Scanner;

public class UpdatedNokia3310{

	public static void main(String... application) {
		
		mainMenu();
	

	}


	public static void mainMenu(){

		String menu = """

				Welcome to Nokia 3310!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Phone Book
				2 >>> Message
				3 >>> Chat
				4 >>> Call Register
				5 >>> Tones
				6 >>> Settings
				7 >>> Call Divert
				8 >>> Games
				9 >>> Calculator 
				10 >>> Remainder
				11 >>> Clock
				12 >>> Profiles
				13 >>> SIM Services
				0 >>> Exit The App
			------------------------------------------
		
				""";
		System.out.print(menu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 13:");
		int menuChoice = scanner.nextInt();

		switch(menuChoice){
			
			case 1: phonebook(); break;
			case 2: message(); break;
			case 3: System.out.println("Chat"); break;
			case 4: callregister(); break;
			case 5: tones(); break;
			case 6: settings(); break;
			case 7: System.out.println("Call Divert"); break;
			case 8: System.out.println("Games"); break;
			case 9: System.out.println("Calculator"); break;
			case 10: System.out.println("Remainders"); break;
			case 11: clock(); break;
			case 12: System.out.println("Profiles"); break;
			case 13: System.out.println("SIM Services"); break;
			case 0: exit(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;
		}


	}



	public static void phonebook(){
		
		String phoneBookMenu = """ 

				Welcome to PhoneBook Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Search
				2 >>> Services Nos.
				3 >>> Add Name
				4 >>> Erase
				5 >>> Edit
				6 >>> Assign Tone
				7 >>> Send b'card
				8 >>> Options
				9 >>> Speed Dials 
				10 >>> Voice Tags
				11 >>> Back to Main Menu
			------------------------------------------

				""";

		System.out.print(phoneBookMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 11:");
		int phonebookChoice = scanner.nextInt();

		switch(phonebookChoice){
			
			case 1: System.out.println("Search"); break;
			case 2: System.out.println("Services Nos."); break;
			case 3: System.out.println("Add Name"); break;
			case 4: System.out.println("Erase"); break;
			case 5: System.out.println("Edit"); break;
			case 6: System.out.println("Assign Tone"); break;
			case 7: System.out.println("Send b'card"); break;
			case 8: options(); break;
			case 9: System.out.println("Speed Dials"); break;
			case 10: System.out.println("Voice Tags"); break;
			case 11: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;

		}


	}


	

	public static void options(){
		
		String optionsMenu = """ 

				Welcome to PhoneBook Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Type of View
				2 >>> Memory Status
				3 >>> Back to Previous Menu
				4 >>> Back to Main Menu
			------------------------------------------
			
				""";


		System.out.print(optionsMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 4:");
		int optionChoice = scanner.nextInt();

		switch(optionChoice){

			case 1: System.out.println("Type of View"); break;
			case 2: System.out.println("Memory Status"); break;
			case 3: phonebook(); break;
			case 4: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;

		}


	}




	public static void message(){

		String messageMenu = """ 

				Welcome to Message Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Write Messages
				2 >>> Inbox
				3 >>> Outbox
				4 >>> Picture Messages
				5 >>> Templates
				6 >>> Smileys
				7 >>> Message Settings
				8 >>> Info Service
				9 >>> Voice Mailbox Number
				10 >>> Service Command Editor
				11 >>> Back to Main Menu 
			------------------------------------------

				""";

		System.out.print(messageMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 9:");
		int messageChoice = scanner.nextInt();

		switch(messageChoice){
	
			case 1: System.out.println("Write Messages"); break;
			case 2: System.out.println("Inbox"); break;
			case 3: System.out.println("Outbox"); break;
			case 4: System.out.println("Picture Messages"); break;
			case 5: System.out.println("Templates"); break;
			case 6: System.out.println("Smileys"); break;
			case 7: messageSettings(); break;
			case 8: System.out.println("Info Service"); break;
			case 9: System.out.println("Voice Mailbox Number"); break;
			case 10: System.out.println("Service Command Editor"); break;
			case 11: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;


		}

	}





	public static void messageSettings(){

		String messageSettingsMenu = """ 

				Welcome to Message Settings Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Set 1
				2 >>> Common
				3 >>> Back to Previous Menu
				4 >>> Back to Main Menu
			------------------------------------------

				""";

		System.out.print(messageSettingsMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 4:");
		int messageSettingsChoice = scanner.nextInt();

	

		switch(messageSettingsChoice){
	
			case 1: set1(); break;
			case 2: common(); break;
			case 3: message(); break;
			case 4: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;

		}

	}




	public static void set1(){

		String set1Menu = """ 

			Welcome to Set 1 Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Message Centre Number
				2 >>> Message Sent As
				3 >>> Message Validity
				4 >>> Back to Previous Menu
			------------------------------------------

				""";


		System.out.print(set1Menu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 4:");
		int set1Choice = scanner.nextInt();

		switch(set1Choice){

			case 1: System.out.println("Message Centre Number"); break;
			case 2: System.out.println("Message Sent As"); break;
			case 3: System.out.println("Message Validity"); break;
			case 4: message(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;


		}

	}


	

	public static void common(){

		String commonMenu = """ 

			Welcome to Common Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Delivery Reports
				2 >>> Reply Via Same Centre
				3 >>> Character Support
				4 >>> Back to Previous Menu
			------------------------------------------
	
				""";

		System.out.print(commonMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 4:");
		int commonChoice = scanner.nextInt();

		switch(commonChoice){

			case 1: System.out.println("Delivery Reports"); break;
			case 2: System.out.println("Reply Via Same Centre"); break;
			case 3: System.out.println("Character Support"); break;
			case 4: message(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;


		}


	
	}



	public static void callregister(){

		String callRegisterMenu = """ 

				Welcome to Call Register Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Missed Calls
				2 >>> Received Calls
				3 >>> Dialled Numbers
				4 >>> Erase Recent Call Lists
				5 >>> Show Call Duration 
				6 >>> Show Call Cost
				7 >>> Call Cost Settings
				8 >>> Prepaid Credit
				9 >>> Back to Main Menu
			------------------------------------------

				""";


		System.out.print(callRegisterMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 9:");
		int callRegisterChoice = scanner.nextInt();

		switch(callRegisterChoice){

			case 1: System.out.println("Missed Calls"); break;
			case 2: System.out.println("Received Calls"); break;
			case 3: System.out.println("Dialled Numbers"); break;
			case 4: System.out.println("Erase Recent Call Lists"); break;
			case 5: showCallDuration(); break;
			case 6: showCallCost(); break;
			case 7: callCostSettings(); break;
			case 8: System.out.println("Prepaid Credit"); break;
			case 9: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;

		}


	}




	public static void showCallDuration(){

		String showCallDurationMenu = """ 

				Welcome to Show Call Duration Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Last Call Duration
				2 >>> All Calls' Duration
				3 >>> Received Calls' Duration
				4 >>> Dialled Calls' Duration
				5 >>> Clear Timers
				6 >>> Back to Previous Menu
				7 >>> Back to Main Menu
			------------------------------------------
	
				""";

		System.out.print(showCallDurationMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 7: ");
		int showCallDurationChoice = scanner.nextInt();

		switch(showCallDurationChoice){

			case 1: System.out.println("Last Call Duration"); break;
			case 2: System.out.println("All Calls' Duration"); break;
			case 3: System.out.println("Received Calls' Duration"); break;
			case 4: System.out.println("Dialled Calls' Duration"); break;
			case 5: System.out.println("Clear Timers"); break;
			case 6: callregister(); break;
			case 7: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;

		}


	}




	public static void showCallCost(){


		String showCallCostsMenu = """ 

				Welcome to Show Call Costs Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Last Call Cost
				2 >>> All Calls' Cost
				3 >>> Clear Counters
				4 >>> Back to Previous Menu
				5 >>> Back to Main Menu
			------------------------------------------
	
				""";

		System.out.print(showCallCostsMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 5: ");
		int showCallDurationChoice = scanner.nextInt();

		switch(showCallDurationChoice){

			case 1: System.out.println("Last Call Cost"); break;
			case 2: System.out.println("All Calls' Cost"); break;
			case 3: System.out.println("Clear Counters"); break;
			case 4: callregister(); break;
			case 5: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;

		}


	}

	public static void callCostSettings(){

		String callCostSettingsMenu = """ 

				Welcome to Call Cost Settings Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Call Cost Limit
				2 >>> Show Costs In
				3 >>> Back to Previous Menu
				4 >>> Back to Main Menu
			------------------------------------------
	
				""";

		System.out.print(callCostSettingsMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 5: ");
		int showCallDurationChoice = scanner.nextInt();

		switch(showCallDurationChoice){

			case 1: System.out.println("Call Cost Limit"); break;
			case 2: System.out.println("Show Costs In"); break;
			case 3: callregister(); break;
			case 4: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;

		}


	}




	public static void tones(){

		String tonesMenu = """ 

				Welcome to Tone Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Ringing Tone
				2 >>> Ringing Volume
				3 >>> Incoming Call Alert
				4 >>> Composer
				5 >>> Message Alert Tone
				6 >>> Keypad Tones
				7 >>> Warning And Games Tones
				8 >>> Vibrating Alert
				9 >>> Screen Saver
				10 >>> Back to Main Menu
			------------------------------------------

				""";

		System.out.print(tonesMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 10: ");
		int tonesChoice = scanner.nextInt();

		switch(tonesChoice){

			case 1: System.out.println("Ringing Tone"); break;
			case 2: System.out.println("Ringing Volume"); break;
			case 3: System.out.println("Incoming Call Alert"); break;
			case 4: System.out.println("Composer"); break;
			case 5: System.out.println("Message Alert Tone"); break;
			case 6: System.out.println("Keypad Tones"); break;
			case 7: System.out.println("Warning And Games Tones"); break;
			case 8: System.out.println("Vibrating Alert"); break;
			case 9: System.out.println("Screen Saver"); break;
			case 10: mainMenu(); break;
	

		}

	}


	public static void settings(){

		String settingsMenu = """ 

				Welcome to Settings Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Call Settings
				2 >>> Phone Settings
				3 >>> Security Settings
				4 >>> Restore Factory Settings
				5 >>> Back to Main Menu
			------------------------------------------

				""";

		System.out.print(settingsMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 5: ");
		int tonesChoice = scanner.nextInt();

		switch(tonesChoice){

			case 1: callSettings(); break;
			case 2: phoneSettings(); break;
			case 3: securitySettings(); break;
			case 4: System.out.println("Restore Factory Settings"); break;
			case 5: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;
	

		}

	}



	public static void callSettings(){

			String callSettingsMenu = """ 

				Welcome to Call Settings Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Automatic Redial
				2 >>> Speed Dialling
				3 >>> Call Waiting Options
				4 >>> Own Number Sending
				5 >>> Phone Line In Use
				6 >>> Automatic Answer
				7 >>> Back to Previous Menu
				8 >>> Back to Main Menu
			------------------------------------------

				""";

		System.out.print(callSettingsMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 8: ");
		int callSettingsChoice = scanner.nextInt();

		switch(callSettingsChoice){

			case 1: System.out.println("Automatic Redial"); break;
			case 2: System.out.println("Speed Dialling"); break;
			case 3: System.out.println("Call Waiting Options"); break;
			case 4: System.out.println("Own Number Sending"); break;
			case 5: System.out.println("Phone Line In Use"); break;
			case 6: System.out.println("Automatic Answer"); break;
			case 7: settings(); break;
			case 8: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;

		}


	}


	public static void phoneSettings(){

			String phoneSettingsMenu = """ 

				Welcome to Phone Settings Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Language
				2 >>> Cell Info Display
				3 >>> Welcome Note
				4 >>> Network Selection
				5 >>> Lights
				6 >>> Confirm SIM Service Actions
				7 >>> Back to Previous Menu
				8 >>> Back to Main Menu
			------------------------------------------

				""";

		System.out.print(phoneSettingsMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 8: ");
		int phoneSettingsChoice = scanner.nextInt();

		switch(phoneSettingsChoice){

			case 1: System.out.println("Language"); break;
			case 2: System.out.println("Cell Info Display"); break;
			case 3: System.out.println("Welcome Note"); break;
			case 4: System.out.println("Network Selection"); break;
			case 5: System.out.println("Lights"); break;
			case 6: System.out.println("Confirm SIM Service Actions"); break;
			case 7: settings(); break;
			case 8: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;
		}

	}

	

	public static void securitySettings(){

			String securitySettingsMenu = """ 

				Welcome to Security Settings Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> PIN Code Request
				2 >>> Call Barring Service
				3 >>> Fixed Dialling 
				4 >>> Closed User Group
				5 >>> Phone Security
				6 >>> Change Access Codes
				7 >>> Back to Previous Menu
				8 >>> Back to Main Menu
			------------------------------------------

				""";

		System.out.print(securitySettingsMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 8: ");
		int securitySettingsChoice = scanner.nextInt();

		switch(securitySettingsChoice){

			case 1: System.out.println("PIN Code Request"); break;
			case 2: System.out.println("Call Barring Service"); break;
			case 3: System.out.println("Fixed Dialling"); break;
			case 4: System.out.println("Closed User Group"); break;
			case 5: System.out.println("Phone Security"); break;
			case 6: System.out.println("Change Access Codes"); break;
			case 7: settings(); break;
			case 8: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;
		}

	}




	public static void clock(){

			String clockMenu = """ 

				Welcome to Clock Settings Menu!

			please select the menus below to continue:
			------------------------------------------
				1 >>> Alarm Clock
				2 >>> Clock Settings
				3 >>> Date Settings 
				4 >>> Stopwatch
				5 >>> Countdown Timer
				6 >>> Auto Update Of Date And Time
				7 >>> Back to Main Menu
			------------------------------------------

				""";

		System.out.print(clockMenu);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter from number 1 to 8: ");
		int clockChoice = scanner.nextInt();

		switch(clockChoice){

			case 1: System.out.println("Alarm Clock"); break;
			case 2: System.out.println("Clock Settings"); break;
			case 3: System.out.println("Date Settings "); break;
			case 4: System.out.println("Stopwatch"); break;
			case 5: System.out.println("Countdown Timer"); break;
			case 6: System.out.println("Auto Update Of Date And Time"); break;
			case 7: mainMenu(); break;
			default : System.out.println("Invalid Number!!! Please Try Again"); break;
		}


	}



	public static void exit(){

		String exitPhase = """ 

				Exiting the App.....

			+++++++++++++++++++++++++++++++++++

			Thank you For Choosing Nokia 3310.
		""";


		System.out.print(exitPhase);
	}





}