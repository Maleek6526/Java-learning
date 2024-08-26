import java.util.Scanner;

public class Nokia3310 {
	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);

	String menu= """

		Welcome to Nokia 3310!
	
		Please select the menus below to start:

		---------------------------------------
			1 >>> Phone Book
			2 >>> Message
			3 >>> Chat
			4 >>> Call Register
			5 >>> Tones
			6 >>> Settings
			7 >>> Call Divert
			8 >>> Games
			9 >>> Calculator
			10 >>> Reminders
			11 >>> Clock
			12 >>> Profile
			13 >>> Sim Services
		---------------------------------------

			""";

		System.out.print(menu);		
		
		System.out.println("Enter the number of your choice: ");
		int userInput = scanner.nextInt();
	
		
switch(userInput){

	case 1: 

		String PhoneBook= """

		Welcome to PhoneBook!
	
	Please select the menus below to continue:

	---------------------------------------	
		1 >>> Search
		2 >>> ServiceNos
		3 >>> Add Names
		4 >>> Erase
		5 >>> Edit
		6 >>> Assign Tone
		7 >>> Send b'card
		8 >>> Options
		9 >>> Speed Dials
		10 >>> Voice Tags
	---------------------------------------
	""";

		
	System.out.print(PhoneBook+"");

	System.out.print("Enter the number of your choice: ");
	int userInput2 = scanner.nextInt();
		

	switch(userInput2){


		case 1: String search= "search";
			System.out.print(search+""); break;
							
			
		case 2: String servicenos= "Service Nos";
			System.out.print(servicenos+""); break;							

		case 3: String addnames= "Add Names";
			System.out.print(addnames+""); break;				

		case 4: String erase= "Erase";
			System.out.print(erase+""); break;				

		case 5: String edit= "Edit";
			System.out.print(edit+""); break;
	
		case 6: String assigntone= "Assign Tone";
			System.out.print(assigntone+""); break;

		case 7: String sendbcard= "Send b'card";
			System.out.print(sendbcard+""); break;
	
		case 8:
			String optiondropdown= """

	
			Please select the menus below to continue:
			---------------------------------------
			1 >>> Type Of Views
			2 >>> Memory Status
			---------------------------------------
			""";

			System.out.print(optiondropdown);		

			System.out.print("Enter number 1 or 2: ");
			int choice = scanner.nextInt();

				switch(choice){
					case 1: String typeofview= "Type Of View";
						System.out.println(typeofview+""); break;
							
					case 2: String memorystatus= "Memory Status";
						System.out.print(memorystatus+""); break;
						default: System.out.print("You have entered an invalid number! start again!!");}break;	
					
		case 9: String speeddials= "Speed Dials";
			System.out.print(speeddials+""); break;

		case 10: String voicetags= "Voice Tags";
			System.out.print(voicetags+""); break;	
			default: System.out.print("You have entered an invalid number! start again!!");}break;	
	
		

	case 2:
		String messages= """

		Welcome to Messages!
	
		Please select the menus below to continue:

	---------------------------------------
		1 >>> Write Messgaes
		2 >>> Inbox
		3 >>> Outbox
		4 >>> Picture Messages
		5 >>> Templates
		6 >>> Smileys
		7 >>> Message Settings
		8 >>> Info Service
		9 >>> Voice Mailbox Number
		10 >>> Service Command Editor
	---------------------------------------
		""";

	System.out.print(messages+"");
	System.out.println("Enter the number of your choice: ");
	int userInput3 = scanner.nextInt();

		switch(userInput3){
			case 1: String writemessages= "Write Messages";
				System.out.print(writemessages+""); break;
				
			case 2: String inbox= "Inbox";
				System.out.print(inbox+""); break;
			
			case 3: String outbox= "Outbox";
				System.out.print(outbox+""); break;

			case 4: String picturemessages= "Picture Messages";
				System.out.print(picturemessages+""); break;

			case 5: String templates= "Templates";
				System.out.print(templates+""); break;


			case 6: String smileys= "Smileys";
				System.out.print(smileys+""); break;

			case 7: String messagesettings= "Message Settings";
				System.out.println(messagesettings+"");
				

				String optiondropdown2= """

				Please select the menus below to continue:

				---------------------------------------
					1 >>> Set 1
					2 >>> Common
				---------------------------------------
					
					""";

				System.out.print(optiondropdown2);		

				System.out.print("Enter number 1 or 2: ");
				int choice1 = scanner.nextInt();

				switch(choice1){
					case 1: String set1= "Set 1";
						System.out.println(set1+"");

				String optiondropdown3= """

	
				Please select the menus below to continue:

				---------------------------------------
					1 >>> Message Centre Number
					2 >>> Message Sent As
					3 >>> Message Validity
				---------------------------------------
					""";

				System.out.print(optiondropdown3);
																							System.out.print("Enter number 1 to 3: ");
				int choice2 = scanner.nextInt();

				switch(choice2){
					case 1: String messagecentrenumber= "Message Centre Number";
						System.out.println(messagecentrenumber+""); break;

					case 2: String messagesentas= "Message Sent As";
						System.out.println(messagesentas+""); break;

					case 3: String messagevalidity= "Message Validity";
						System.out.print(messagevalidity+""); break;
						default: System.out.print("You have entered an invalid number! start again!!");}break;

				case 2: String common= "Common";
					System.out.println(common+"");

					String optiondropdown4= """

				Please select the menus below to continue:
				---------------------------------------	
					1 >>> Delivery Reports
					2 >>> Reply Via Same Centre
					3 >>> Character Support	
				---------------------------------------
					""";	

				System.out.print(optiondropdown4);

				System.out.print("Enter number 1 to 3: ");
				int choice3 = scanner.nextInt();

				switch(choice3){
					case 1: String deliveryreports= "Delivery Reports";
						System.out.println(deliveryreports+""); break;

					case 2: String replyviasamecentre= "Reply Via Same Centre";
						System.out.println(replyviasamecentre+""); break;

					case 3: String charactersupport= "Character Support";
						System.out.println(charactersupport+""); break;
						default: System.out.print("You have entered an invalid number! start again!!");}break;
						default: System.out.print("You have entered an invalid number! start again!!");}break;

				case 8:
					String optiondropdown6= """

				Please select the menus below to continue:
				---------------------------------------
				1 >>> Info Service
				---------------------------------------
					""";

				System.out.print(optiondropdown6);		

				System.out.print("Enter 1: ");
				int choice5 = scanner.nextInt();

				switch(choice5){
					case 1: String infoservice= "Info Service";
						System.out.print(infoservice+""); break;
						default: System.out.print("You have entered an invalid number! start again!!");}break;

				case 9:
					String optiondropdown61= """

					Please select the menus below to continue:
					---------------------------------------
						1 >>> Voice Mailbox Number
					---------------------------------------
						""";

					System.out.print(optiondropdown61);

					System.out.print("Enter 1: ");
					int choice51=scanner.nextInt();

					switch(choice51){
						case 1: String voicemailboxnumber1= "Voice Mailbox Number";
							System.out.print(voicemailboxnumber1+""); break;
							default: System.out.print("You have entered an invalid number! start again!!");}break;

				case 10:
					String optiondropdown7= """
	
				Please select the menus below to continue:

				---------------------------------------
					1 >>> Service Command Editor
				---------------------------------------
					""";

				System.out.print(optiondropdown7);		

					System.out.print("Enter 1: ");
					int choice6 = scanner.nextInt();

				switch(choice6){
					case 1: String servicecommandeditor= "Service Command Editor";
						System.out.print(servicecommandeditor+""); break;
						default: System.out.print("You have entered an invalid number! start again!!");}
						default: System.out.print("You have entered an invalid number! start again!!");}break;

	case 3: String optiondropdown8= """

			Please select the menus below to continue:
			---------------------------------------
				1 >>> Chat
			---------------------------------------
				""";
			System.out.print(optiondropdown8);		

			System.out.print("Enter 1: ");
			int choice7 = scanner.nextInt();

				switch(choice7){
					case 1: String chat= "Chat";
						System.out.print(chat+""); break;
						default: System.out.print("You have entered an invalid number! start again!!");}break;
				
	case 4: String optiondropdown9= """

			Please select the menus below to continue:
			---------------------------------------
				1 >>> Call Register
			---------------------------------------
				""";

			System.out.print(optiondropdown9);		

			System.out.print("Enter 1: ");
			int choice8 = scanner.nextInt();

			switch(choice8){
				case 1: String optiondropdown10= """

					Please select the menus below to continue:

					---------------------------------------
						1 >>> Missed Calls
						2 >>> Recieved Calls
						3 >>> Dialled Numbers
						4 >>> Erase Recent Call Lists
						5 >>> Show Call Duration
						6 >>> Show Call Cost
						7 >>> Call Cost Settings
						8 >>> Prepaid Credit
					---------------------------------------
						""";

				System.out.print(optiondropdown10);

				System.out.println("Enter the number of your choice: ");
				int userInput5 = scanner.nextInt();


				switch(userInput5){

					case 1: String missedcalls= "Missed Calls";
						System.out.print(missedcalls+""); break;

					case 2: String recievedcalls= "Recieved Calls";
						System.out.print(recievedcalls+""); break;
						
					case 3: String diallednumbers= "Dialled Numbers";
						System.out.print(diallednumbers+""); break;
						
					case 4: String eraserecentcalllists= "Erase Recent Call Lists";
						System.out.print(eraserecentcalllists+""); break;

					case 5: String showcallduration= "Show Call Duration";
						System.out.print(showcallduration+"");
						
						String optiondropdown11= """

						Please select the menus below to continue:

						---------------------------------------
							1 >>> Last Call Duration
							2 >>> All Calls' Duration
							3 >>> Received Calls' Duration
							4 >>> Dialled Calls' Duration
							3 >>> Clear Timers
						---------------------------------------
							""";

						System.out.print(optiondropdown11);

						System.out.print("Enter number 1 to 5: ");
						int choice11 = scanner.nextInt();

							switch(choice11){
								case 1: String lastcallduration= "Last Call Duration";
									System.out.print(lastcallduration+""); break;

								case 2: String allcallsduration= "All Calls' Duration";
									System.out.print(allcallsduration+""); break;

								case 3: String receivedcallsduration= "Received Calls' Duration";
									System.out.print(receivedcallsduration+""); break;

								case 4: String dialledcallsduration= "Dialled Calls' Duration";
									System.out.print(dialledcallsduration+""); break;

								case 5: String cleartimers= "Clear Timers";
									System.out.print(cleartimers+""); break;
									
								case 6: String showcallcost= "Show Call Cost";
									System.out.print(showcallcost+"");
				
			
									String optiondropdown12= """

									Please select the menus below to continue:
								---------------------------------------
								1 >>> Last Call Cost
								2 >>> All Calls' Cost
								3 >>> Clear Counters
								---------------------------------------
									""";

								System.out.print(optiondropdown12);

								System.out.print("Enter number 1 to 3: ");
								int choice12 = scanner.nextInt();

								switch(choice12){
									case 1: String lastcallcost= "Last Call Cost";
										System.out.print(lastcallcost+""); break;

									case 2: String allcallscost= "All Calls' Cost";
										System.out.print(allcallscost+""); break;

									case 3: String clearcounters= "Clear Counters";
										System.out.print(clearcounters+""); break;
										default: System.out.print("You have entered an invalid number! start again!!");}break;


								case 7: String callcostsettings= "Call Cost Settings";
									System.out.print(callcostsettings+"");
									String optiondropdown13= """
									Please select the menus below to continue:
									---------------------------------------
										1 >>> Call Cost Limit	
										2 >>> Show Cost In
									---------------------------------------
										""";
									System.out.print(optiondropdown13);

									System.out.print("Enter number 1 or 2: ");
									int choice13 = scanner.nextInt();

									switch(choice13){
										case 1: String callcostlimit= "Call Cost Limit";
											System.out.print(callcostlimit+""); break; 	

										case 2:	String showcostin= "Show Cost In";
											System.out.print(showcostin+""); break;
											default: System.out.print("You have entered an invalid number! start again!!");}default: System.out.print("You have entered an invalid number! start again!!");}break;



									case 8: String prepaidcredit= "Prepaid Credit";
										System.out.print(prepaidcredit+"");
										String optiondropdown14= """
										Please select the menus below to continue														---------------------------------------
											1 >>> Prepaid Credit
										---------------------------------------
											""";

										System.out.print(optiondropdown14);
										System.out.print("Enter 1: ");
										int choice14 = scanner.nextInt();

										switch(choice14){
											case 1: String prepaidcredit1= "Prepaid Credit";
												System.out.print(prepaidcredit1+""); break;
												default: System.out.print("You have entered an invalid number! start again!!");}default: System.out.print("You have entered an invalid number! start again!!");}break;               
 

	case 5: String optiondropdown15= """
			Please select the menus below to continue:
			---------------------------------------
				1 >>> Tones
			---------------------------------------
				""";

			System.out.print(optiondropdown15);

			System.out.print("Enter 1: ");
			int choice15 = scanner.nextInt();

			switch(choice15){
				case 1: String tones= "Tones";
					System.out.print(tones+"");
									
					String dropdown= """
	
				Please select the menus below to continue:
				---------------------------------------
					1 >>> Ringing Tone
					2 >>> Ringing Volume
					3 >>> Incoming Call Alert
					4 >>> Composer
					5 >>> Message Alert Tone
					6 >>> Keypads Tones
					7 >>> Warning And Game Tones
					8 >>> Vibrating Alert
					9 >>> Screen Saver
				---------------------------------------
					""";

			System.out.print(dropdown+"");
			System.out.println("Enter the number of your choice: ");
			int choicetone = scanner.nextInt();


			switch(choicetone){

			case 1:	String ringingtone= "Ringing Tone";
				System.out.print(ringingtone+""); break;					

			case 2:	String ringingvolume= "Ringing Volume";
				System.out.print(ringingvolume+""); break;

			case 3:	String incomingcallalert= "Incoming Call Alert";
				System.out.print(incomingcallalert+""); break;

			case 4: String composer= "Composer";
				System.out.print(composer+""); break;					

			case 5:	String messagealerttone= "Message Alert Tone";
				System.out.print(messagealerttone+""); break;					

			case 6:	String keypadstones= "Keypads Tones";
				System.out.print(keypadstones+""); break;					

			case 7:	String warningandgametones= "Warning And Game Tones";
				System.out.print(warningandgametones+""); break;

			case 8:	String vibratingalert= "Vibrating Alert";
				System.out.print(vibratingalert+""); break;					
	
			case 9: String screensaver= "Screen Saver";
				System.out.print(screensaver+""); break;					
				default: System.out.print("You have entered an invalid number! start again!!");}break;
				default: System.out.print("You have entered an invalid number! start again!!");}break;


	case 6: String settings1= """
			Please select the menus below to continue:
			---------------------------------------
				1 >>> Call Settings
				2 >>> Phone Settings
				3 >>> Security Settings
				4 >>> Restore Factory Settings
			---------------------------------------
				""";

			System.out.print(settings1);
			System.out.print("Enter number 1 to 4: ");
			int choicesettings = scanner.nextInt();

				switch (choicesettings){
					case 1: String callsettings= "Call Settings";
						System.out.print(callsettings+"");

						String calldropdown= """
						Please select the menus below to continue:
						---------------------------------------
							1 >>> Automatic Redial
							2 >>> Speed Dialling
							3 >>> Call Waiting Options
							4 >>> Own Number Sending
							5 >>> Phone Line In Use
							6 >>> Automatic Answer
						---------------------------------------
							""";

						System.out.print(calldropdown);
						System.out.print("Enter number 1 to 6: ");
						int choicecall = scanner.nextInt();

						switch(choicecall){
							case 1:	String automaticredial= "Automatic Redial";
								System.out.print(automaticredial+""); break;	
										
							case 2: String speeddialling= "Speed Dialling";
								System.out.print(speeddialling+""); break;	

							case 3: String callwaitingoptions= "Call Waiting Options";
								System.out.print(callwaitingoptions+""); break;	

							case 4: String ownnumbersending= "Own Number Sending";
								System.out.print(ownnumbersending+""); break;	

							case 5: String phonelineinuse= "Phone Line In Use";
								System.out.print(phonelineinuse+""); break;	

							case 6: String automaticanswer= "Automatic Answer";
								System.out.print(automaticanswer+""); break;	
								default: System.out.print("You have entered an invalid number! start again!!");}break;

						case 2: String phonesettings= "Phone Settings";
							System.out.print(phonesettings+"");
							String phonedropdown= """
							Please select the menus below to continue:
							---------------------------------------
								1 >>> Language
								2 >>> Cell Info Display
								3 >>> Welcome Note
								4 >>> Network Selection
								5 >>> Light
								6 >>> Confirm Sim Service Actions
							---------------------------------------
								""";

							System.out.print(phonedropdown);
							System.out.print("Enter number 1 to 6: ");
							int choicephone = scanner.nextInt();

							switch(choicephone){
							case 1:	String language= "Language";
								System.out.print(language+""); break;	

							case 2: String cellinfodisplay= "Cell Info Display";
								System.out.print(cellinfodisplay+""); break;	

							case 3: String welcomenote= "Welcome Note";
								System.out.print(welcomenote+""); break;	
							
							case 4: String networkselection= "Network Selection";
								System.out.print(networkselection+""); break;

							case 5: String light= "Light";
								System.out.print(light+""); break;

							case 6: String confirmsimserviceactions= "Confirm Sim Service Actions";
								System.out.print(confirmsimserviceactions+""); break;	
								default: System.out.print("You have entered an invalid number! start again!!");}break;

						case 3: String securitysettings= "Security Settings";
							System.out.print(securitysettings+"");
							String securitydropdown= """
							Please select the menus below to continue:
							---------------------------------------
								1 >>> PIN Code Request
								2 >>> Call Barring Service
								3 >>> Fixed Dialling
								4 >>> Closed User Group
								5 >>> Phone Security
								6 >>> Change Access Codes
							---------------------------------------
								""";
							System.out.print(securitydropdown);

							System.out.print("Enter number 1 to 6: ");
							int choicesecurity = scanner.nextInt();

							switch(choicesecurity){
							case 1: String pincoderequest= "PIN Code Request";
								System.out.print(pincoderequest+""); break;	

							case 2: String callbarringservice= "Call Barring Service";
								System.out.print(callbarringservice+""); break;	

							case 3: String fixeddialling= "Fixed Dialling";
								System.out.print(fixeddialling+""); break;

							case 4: String closedusergroup= "Network SelectionClosed User Group";
								System.out.print(closedusergroup+""); break;	

							case 5: String phonesecurity= "Phone Security";
								System.out.print(phonesecurity+""); break;	

							case 6: String changeaccesscodes= "Change Access Codes";
								System.out.print(changeaccesscodes+""); break;	
								default: System.out.print("You have entered an invalid number! start again!!");}break;


						case 4: String restorefactorysettings= "Restore Factory Settings";
							System.out.print(restorefactorysettings+""); break;
							default: System.out.print("You have entered an invalid number! start again!!");}break;

	case 7:	String divertdropdown= """
			Please select the menus below to continue:
			---------------------------------------
				1 >>> Call Divert
			---------------------------------------
				""";

			System.out.print(divertdropdown);
			System.out.print("Enter 1: ");
			int choicedivert = scanner.nextInt();

			switch(choicedivert){
				case 1: String calldivert= "Call Divert";
					System.out.print(calldivert+""); break;	
					default: System.out.print("You have entered an invalid number! start again!!");}break;

	case 8: String gamesdropdown= """
			Please select the menus below to continue:
			---------------------------------------
				1 >>> Games
			---------------------------------------
				""";
			System.out.print(gamesdropdown);
			System.out.print("Enter 1: ");
			int choicegame = scanner.nextInt();

			switch(choicegame){
				case 1: String games= "Games";
					System.out.print(games+""); break;	
					default: System.out.print("You have entered an invalid number! start again!!");}break;


	case 9: String calculatordropdown= """
			Please select the menus below to continue:
			---------------------------------------
				1 >>> Calculator
			---------------------------------------
				""";

			System.out.print(calculatordropdown);
			System.out.print("Enter 1: ");
			int choicecalculator = scanner.nextInt();

			switch(choicecalculator){
				case 1: String calculator= "Calculator";
					System.out.print(calculator+""); break;	
					default: System.out.print("You have entered an invalid number! start again!!");}break;

	case 10: String remindersdropdown= """
			Please select the menus below to continue:
			---------------------------------------
				1 >>> Reminders
			---------------------------------------
				""";
			System.out.print(remindersdropdown);
			System.out.print("Enter 1: ");
			int choicereminders = scanner.nextInt();
			switch(choicereminders){
				case 1: String reminders= "Reminders";
					System.out.print(reminders+""); break;	
					default: System.out.print("You have entered an invalid number! start again!!");}break;

	case 11: String clockdropdown= """
			Please select the menus below to continue:
			---------------------------------------
				1 >>> Clock
			---------------------------------------
				""";
			System.out.print(clockdropdown);
			System.out.print("Enter 1: ");
			int choiceclock = scanner.nextInt();

			switch(choiceclock){
				case 1: String clock= "Clock";
					System.out.print(clock+"");
					String clock1dropdown= """
						Please select the menus below to continue:
						---------------------------------------
							1 >>> Alarm Clock
							2 >>> Clock Settings
							3 >>> Date Settings
							4 >>> Stopwatch
							5 >>> Countdown Timer
							6 >>> Auto Update Of Date And Time
						---------------------------------------
							""";

							System.out.print(clock1dropdown);

							System.out.print("Enter from number 1 to 6: ");
							int choiceclock1 = scanner.nextInt();

							switch(choiceclock1){
								case 1: String alarmclock= "Alarm Clock";
									System.out.print(alarmclock+""); break;	

								case 2: String clocksettings= "Clock Settings";
									System.out.print(clocksettings+""); break;	
								
								case 3: String datesettings= "Date Settings";
									System.out.print(datesettings+""); break;	
										
								case 4: String stopwatch= "Stopwatch";
									System.out.print(stopwatch+""); break;	
									
								case 5: String countdowntimer= "Countdown Timer";
									System.out.print(countdowntimer+"");
									break;	

								case 6: String autoupdateofdateandtime= "Auto Update Of Date And Time";
									System.out.print(autoupdateofdateandtime+""); break;	
									default: System.out.print("You have entered an invalid number! start again!!");}break;


	case 12:  String profiles= """
			Please select the menus below to continue:
			---------------------------------------
				1 >>> Profiles
			---------------------------------------
				""";
			System.out.print(profiles);
			System.out.print("Enter 1: ");
			int choiceprofiles = scanner.nextInt();

			switch(choiceprofiles){
				case 1: String profiles1= "Profiles";
					System.out.print(profiles1+"");	break;	
					default: System.out.print("You have entered an invalid number! start again!!");}break;

	case 13:  String simservicesdropdown= """
			Please select the menus below to continue:
			---------------------------------------
				1 >>> SIM Services
			---------------------------------------
				""";
			System.out.print(simservicesdropdown);
			System.out.print("Enter 1: ");
			int simservices1 = scanner.nextInt();

			switch(simservices1){
				case 1: String simservices= "SIM Services";
					System.out.print(simservices+""); break;	
		 		default: System.out.print("You have entered an invalid number! start again!!");}break;
		
			default: System.out.print("You have entered an invalid number! start again!!");}
		default: System.out.print("You have entered an invalid number! start again!!");}
default: System.out.print("You have entered an invalid number! start again!!");}


	}



}




