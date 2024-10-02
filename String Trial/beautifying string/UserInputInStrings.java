import java.util.Scanner;
public class UserInputInStrings{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter are your names: ");
		String name = scanner.next();

		System.out.println("How are you today "+ name);

	}

}