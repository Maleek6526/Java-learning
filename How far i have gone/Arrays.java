import java.util.Scanner;

public class Arrays{

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);

		int[] score = new int[10];

		for(int i = 0; i < 10; i++){

			System.out.print("Enter score: ");
			score[i] = scanner.nextInt();

		}

		for(int i = 0; i < 10; i++){

			System.out.printf("%10d", score[i]);

		}
	}


}