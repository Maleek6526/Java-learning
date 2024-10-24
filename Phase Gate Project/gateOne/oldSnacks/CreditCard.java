import java.util.Scanner;

public class CreditCard{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		try {

			System.out.println("Hello, Kindly Enter Card details to verify");
			String cardNumber = scanner.nextLine();

			System.out.print(checkValidity(cardNumber));
		}
		
		catch (Exception e) {
		
			System.out.println("Invalid Input");

		}

	}
		
	public static String getModifiedString(String card){

		String aboutToModify = card;

		String modifiedCardNumber = aboutToModify.replace(" ", "").replace("_", "");

		int length = modifiedCardNumber.length();
		
		if(length >= 13 && length <= 16){

			if(modifiedCardNumber.startsWith("4")) {
	
				System.out.println("**Credit Card Type: Visa Card");

				System.out.println("**Credit Card Digit Length "+length);

				System.out.println("**CreditCard Number: "+ modifiedCardNumber);

			} 

			else if (modifiedCardNumber.startsWith("5")) {

				System.out.println( "**Credit Card Type: MasterCard Card");

				System.out.println("**Credit Card Digit Length "+length);

				System.out.println("**CreditCard Number: "+ modifiedCardNumber);

			} 
			else if (modifiedCardNumber.startsWith("37")) {

				System.out.println("**Credit Card Type: American Express Card");

					System.out.println("**Credit Card Digit Length "+length);

					System.out.println("**CreditCard Number: "+ modifiedCardNumber);

			} 
			else if (modifiedCardNumber.startsWith("6")) {

				System.out.println("**Credit Card Type: Discover Card");

					System.out.println("**Credit Card Digit Length "+length);

					System.out.println("**CreditCard Number: "+ modifiedCardNumber);

				}
			else {

				System.out.println("**Credit Card Type: Invalid Card");

				System.out.println("**Credit Card Digit Length "+length);

				System.out.println("**CreditCard Number: "+ modifiedCardNumber);

			}

		}

		else{
			System.out.println("Invalid Credit Card!");

		}

		return modifiedCardNumber;

	}	
	
	
	public static int[] getConvertedIntCreditCard(String modifiedCard){

		String alreadyModified = getModifiedString(modifiedCard);

		int[] convertedIntCreditCard = new int[alreadyModified.length()];
			
		for(int count = 0; count < alreadyModified.length(); count++){

			convertedIntCreditCard[count] = Integer.valueOf(String.valueOf(modifiedCard.charAt(count)));

		} 
			
		return convertedIntCreditCard;

	}


	public static int[] getOddAndEvenIndexes(String elements){

		int[] data = getConvertedIntCreditCard(elements);

		int[] arrayDoubleConvertedIntCreditCard = new int[data.length];

		int doubleConvertedIntCreditCard = 0;

		for(int count = 0; count < data.length; count++){

			if(data.length % 2 == 0){

				if(count % 2 == 0){

					doubleConvertedIntCreditCard = data[count] * 2;

					if(doubleConvertedIntCreditCard > 9){
									
						doubleConvertedIntCreditCard -= 9;		

					}
						
					else{

						doubleConvertedIntCreditCard = data[count] * 2;

					}

					arrayDoubleConvertedIntCreditCard[count] = doubleConvertedIntCreditCard;
							
				}

				else{

					arrayDoubleConvertedIntCreditCard[count] = data[count];

				}
			}


			else if (data.length % 2 == 1){

				if(count % 2 != 0){

					doubleConvertedIntCreditCard = data[count] * 2;

					if(doubleConvertedIntCreditCard > 9){
									
						doubleConvertedIntCreditCard -= 9;					
		
					}

					else{

						doubleConvertedIntCreditCard = data[count] * 2;

					}

					arrayDoubleConvertedIntCreditCard[count] = doubleConvertedIntCreditCard;
				}
			}

			else{

				arrayDoubleConvertedIntCreditCard[count] = data[count];
			}
								
		}

				
		return arrayDoubleConvertedIntCreditCard;

	}
	

	public static String checkValidity(String validity){

		int[] checkValidity = getOddAndEvenIndexes(validity);

		int totalArraySum = 0;

		String result = "";

		for(int count = 0; count < checkValidity.length; count++){

			totalArraySum += checkValidity[count];
			
		}

		if(totalArraySum % 10 == 0){
				
			result = "**Credit Card Vadility Status: Valid";

		}

		else{

			result = "**Credit Card Vadility Status: Invalid";

		}

		return result;
	}

		

}