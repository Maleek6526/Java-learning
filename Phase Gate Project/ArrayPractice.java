import java.util.Arrays;
public class ArrayPractice{

	public static void main(String[] args){

		int[] element = {2, 4, 1, 5, 6, 7};

		int[] elementTwo = {3, 8, 7, 2, 5, 1};

		int[] array = new int[3];

		int[] arrayTwo = new int[3];

		int counter = 0;

		for(int count = 1; count < element.length; count+=2){

				

			array[counter] = element[count-1] + element[count];


			arrayTwo[counter] = elementTwo[count-1 ]+ elementTwo[count];
			counter++;
		}


		System.out.println(Arrays.toString(array));
		System.out.print(Arrays.toString(arrayTwo));

	}

}