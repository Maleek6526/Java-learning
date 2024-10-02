import java.util.Scanner;
public class StringEdit{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String sentence = scanner.nextLine();


		char firstCharacter = sentence.charAt(0);

		if(!Character.isUpperCase(firstCharacter))
		firstCharacter = Character.toUpperCase(firstCharacter);

		System.out.print(firstCharacter + sentence.substring(1));

		if(!sentence.endsWith(".")) System.out.print(".");
		

	}

}