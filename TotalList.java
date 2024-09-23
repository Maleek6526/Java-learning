import java.util.Scanner;

public class TotalList{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of list you want to create: ");
		int listCreated = scanner.nextInt();
		int [] myArrayLists = new int [listCreated];

		for(int count = 0; count < myArrayLists.length; count++){

			System.out.print("Enter the elements: ");

			myArrayLists[count] = scanner.nextInt();

		}

		System.out.print(getElementsInAList(myArrayLists));

	}

public static int getElementsInAList(int[] arrayList){

	int sum = 0;

	for(int count = 0; count < arrayList.length; count++){

		sum += arrayList[count];

	}
	return sum;

}}