public class DivisibleBy3And4{

	public static void main(String... args){


		int numbers = 100;


		for(numbers = 100; numbers <=120;numbers = numbers + 1) {

		
		if(numbers % 4 == 0){

		       System.out.printf("%d%n",       numbers);

		}
		   if(numbers % 3 == 0 ){

		       System.out.printf("%d     ", numbers);

		}

		}
	}

}