public class NumbersInThrees{

	public static void main(String[] args){

		int j = 0;

		int k = 0;


		System.out.printf("number\tsquare\tcube%n");

		for(int i = 0; i <= 10; i++){

			j = (int) Math.pow(i , 2);

			k = (int) Math.pow(i , 3);

		System.out.printf("%d\t%d\t%d%n", i, j, k);

		}
	}
}