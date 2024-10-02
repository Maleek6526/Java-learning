import java.util.Scanner;
public class StringPalindrome{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your names: ");
		String name = scanner.nextLine();

		if(palindrome(name)){
		
			System.out.println("This is a palindrome");

		}

		else{

			System.out.println("This is not a palindrome");


		}

	}

	public static Boolean palindrome(String str){

		StringBuilder build = new StringBuilder(str);

		String reverse = build.reverse().toString();

		return str.equals(reverse);

	}

}