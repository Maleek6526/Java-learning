import java.util.Scanner;
import java.util.Arrays;

public class StringToCharArrays{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		String[] put = name.split(", ");

		System.out.print(Arrays.toString(put));

		char[] input = name.toCharArray();
		System.out.print(Arrays.toString(input));


	}

}