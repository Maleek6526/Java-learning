public class DisplayPatternNumbers{

	public static void main(String[] args){

	displayPattern(3);
	

	}


public static void displayPattern(int number){

	

	for(int i = 1; i <= number; i++){

			int p = 1;
		for(int j = 1; j <= number-i; j++){

			System.out.print(" ");
	
		}
			for(int j = 1; j<=i; j++){

				System.out.print(p);

				p++;

			}

		System.out.println(" ");

		

	}


}


} 