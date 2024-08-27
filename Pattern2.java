public class Pattern2{

	public static void main(String... args) {

		for(int count = 1; count <=5; count++) {

			System.out.println("");

			for(int counter = 1; counter <= count; counter++){

			System.out.print(" * ");

			}

		}


		for(int counter = 1; counter < 5; counter++){

			System.out.println("");

				for(int count = 4; count >= counter; count--) {
				
					System.out.print(" * ");
				
				}
			}



	}

}