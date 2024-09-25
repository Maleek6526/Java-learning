import java.util.Scanner;
public class StringReverse{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String userInput = scanner.nextLine();

		System.out.print(getpalindromeString(userInput));

	}


public static boolean getpalindromeString(String data){

	int theLength = data.length();

	for(int i = 0; i < theLength; i++){

		if(data.charAt(i) != data.charAt(theLength - 1 - i)){

			return false;

		}
	}	
	return true;
}

}