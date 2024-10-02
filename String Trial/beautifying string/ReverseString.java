import java.util.Scanner;

public class ReverseString{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		StringBuffer sb = new StringBuffer(name);
		
		System.out.println(sb.reverse());
	}

}