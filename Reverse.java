import java.util.Scanner;

public class Reverse {

	public static void main(String... args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String userinput = scanner.nextLine();


		StringBuilder maleek = new StringBuilder(userinput);
		maleek.reverse();
		System.out.println(maleek.toString());


	}

}