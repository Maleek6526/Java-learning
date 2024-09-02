public class DivisibleBy3Or4{

	public static void main(String[] args){

		int counter = 0;

		for(int count = 100; count <= 200; count++){

			

		if(count % 3 == 0 || count % 4 == 0){

			System.out.printf("%d ",count);
			counter++;

		}

		if(counter %10==0){

			System.out.print("");

		}

			

		}

	}

}