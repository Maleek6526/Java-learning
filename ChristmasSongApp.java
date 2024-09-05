import java.util.Scanner;

public class ChristmasSongApp{

	public static void main(String[] args){
	
	christmasSongMenu();

	}

public static void christmasSongMenu(){
	String menu = """ 

		++++++++++++++++++++++++++++++++		
		Welcome to My Christmas Song App

		please press 1 to 12 to continue...
		+++++++++++++++++++++++++++++++

		""";
	System.out.print(menu);
	Scanner input = new Scanner(System.in);
	System.out.print("Type in me: ");
	int usersChoice = input.nextInt();

	switch(usersChoice){
		case 1: dayOne(); break;
		case 2: dayTwo(); break;
		case 3: dayThree(); break;
		case 4: dayFour(); break;
		case 5: dayFive(); break;
		case 6: daySix(); break; 
		case 7: daySeven(); break;
		case 8: dayEight(); break;
		case 9: dayNine(); break;
		case 10: dayTen(); break;
		case 11: dayEleven(); break;
		case 12: dayTwelve(); break;
		case 0: exit(); break;
		default: System.out.print("Oga Get Sense Abeggi!!!");



	}




}

public static void dayOne(){

	String firstDayOfChristmas = """
			 On the first day of Christmas, my true love gave to me

				1.	A partridge in a pear tree.

				0.	To go back
				""";

	System.out.print(firstDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");


	}
	


}

public static void dayTwo(){

	String secondDayOfChristmas = """ 

			On the second day of Christmas,my true love gave to me

				2.	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back

					""";

	System.out.print(secondDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");


	}



}


public static void dayThree(){

	String thirdDayOfChristmas = """ 

			On the third day of Christmas,my true love gave to me

				3.	Three French hens,

				2. 	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back
						
				""";
	System.out.print(thirdDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");


	}



}

public static void dayFour(){

	String fourthDayOfChristmas = """ 

			On the fourth day of Christmas,my true love gave to me

				4.	Four calling birds,

				3.	Three French hens,

				2.	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back

				""";

	System.out.print(fourthDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");


	}



}

public static void dayFive(){

	String fiveDayOfChristmas = """ 

			On the fifth day of Christmas,my true love gave to me

				5.	Five golden rings,

				4.	Four calling birds,

				3.	Three French hens,

				2.	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back

					""";

	System.out.print(fiveDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");


	}

}


public static void daySix(){

	String sixDayOfChristmas = """ 

			On the sixth day of Christmas,my true love gave to me

				6.	Six geese a-laying,

				5.	Five golden rings,

				4.	Four calling birds,

				3.	Three French hens,

				2.	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back
					""";
	System.out.print(sixDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");


	}

}



public static void daySeven(){

	String sevenDayOfChristmas = """ 

			On the seventh day of Christmas,my true love gave to me
			
				7.	Seven swans a-swimming,
				
				6.	Six geese a-laying,

				5.	Five golden rings,

				4.	Four calling birds,

				3.	Three French hens,

				2.	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back

				""";
	System.out.print(sevenDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");


	}

}


public static void dayEight(){

	String eightDayOfChristmas = """ 

			On the eighth day of Christmas,my true love gave to me

				8.	Eight maids a-milking,

				7.	Seven swans a-swimming,

				6.	Six geese a-laying,

				5.	Five golden rings,

				4.	Four calling birds,

				3.	Three French hens,

				2.	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back

				""";

	System.out.print(eightDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");


	}
}


public static void dayNine(){

	String nineDayOfChristmas = """ 

			On the ninth day of Christmas,my true love gave to me

				9.	Nine ladies dancing,

				8.	Eight maids a-milking,

				7.	Seven swans a-swimming,

				6.	Six geese a-laying,

				5.	Five golden rings,

				4.	Four calling birds,

				3.	Three French hens,

				2.	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back


			""";

	System.out.print(nineDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");
	}

}


public static void dayTen(){

	String tenDayOfChristmas = """ 

			On the tenth day of Christmas,my true love gave to me

				10.	Ten lords a-leaping,

				9.	Nine ladies dancing,

				8.	Eight maids a-milking,

				7.	Seven swans a-swimming,

				6.	Six geese a-laying,

				5.	Five golden rings,

				4.	Four calling birds,

				3.	Three French hens,

				2.	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back

				""";

	System.out.print(tenDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");
	}
}


public static void dayEleven(){

	String elevenDayOfChristmas = """ 

			On the eleventh day of Christmas,my true love gave to me

				11.	Eleven pipers piping,

				10.	Ten lords a-leaping,

				9.	Nine ladies dancing,

				8.	Eight maids a-milking,

				7.	Seven swans a-swimming,

				6.	Six geese a-laying,

				5.	Five golden rings,

				4.	Four calling birds,

				3.	Three French hens,

				2.	Two turtle doves,

				1.	And a partridge in a pear tree.

				0.	To go back
				
				""";

	System.out.print(elevenDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");
	}
}



public static void dayTwelve(){

	String twelveDayOfChristmas = """ 

			On the twelfth day of Christmas,my true love gave to me

				12.	Twelve drummers drumming,

				11.	Eleven pipers piping,

				10.	Ten lords a-leaping,

				9.	Nine ladies dancing,

				8.	Eight maids a-milking,

				7.	Seven swans a-swimming,

				6.	Six geese a-laying,

				5.	Five golden rings,

				4.	Four calling birds,

				3.	Three French hens,

				2.	Two turtle doves,

				1.	And a partridge in a pear tree!

				0.	To go back
		
				""";

	System.out.print(twelveDayOfChristmas);
	Scanner input = new Scanner(System.in);
	System.out.print("Here: ");
	int userChoice = input.nextInt();
	
	switch(userChoice){
			
		case 0:  christmasSongMenu();
		default: System.out.print("Oga Get Sense Abeggi!!!");
	}
}


public static void exit(){

	String exitingTheApp = """ 

			+++++++++++++++++++++++++++++++++++++++++++++++++++

					Exiting the App.....

				Thank You For Choosing My App.

			+++++++++++++++++++++++++++++++++++++++++++++++++++


				""";

	System.out.print(exitingTheApp);

}
}