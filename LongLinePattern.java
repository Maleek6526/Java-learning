public class LongLinePattern{

	public static void main(String[] args){

		for(int i = 1; i <= 10; i++){

			for(int j = 1; j <= i; j++){

				System.out.print("*");
	
			}System.out.println();

		}

System.out.println();
System.out.println();
System.out.println();

		for(int i = 1; i <= 10; i++){

			for(int j = 10; j >= i; j--){

				System.out.print("*");
	
			}System.out.println();

		}

System.out.println();
System.out.println();
System.out.println();

	for(int i = 1; i <=  10; i++){

		for(int j = 10; j > i; j--){

			System.out.print(" ");

		}
		for(int k = 1; k <= i; k++){

			System.out.print("*");

		}System.out.println();


	}





System.out.println();
System.out.println();
System.out.println();

	for(int i = 10; i >=  1; i--){

		for(int j = 10; j > i; j--){

			System.out.print(" ");

		}
		for(int k = 1; k <= i; k++){

			System.out.print("*");

		}System.out.println();


	}

System.out.println();
System.out.println();
System.out.println();



	for(int i = 1; i <= 5; i++){

		for(int j = 5; j > i; j--){

			System.out.print(" ");

		}

		for(int k = 1; k <= (2 * i - 1); k++){

			System.out.print("*");

		}System.out.println();


	}

	for(int i = 4; i >= 1; i--){

		for(int j = 5; j > i; j--){

			System.out.print(" ");

		}

		for(int k = 1; k <= (2 * i - 1); k++){

			System.out.print("*");

		}System.out.println();


	}

	}



}