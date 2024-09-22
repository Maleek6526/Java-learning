import java.util.Scanner;

public class ElementsInTheList{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of list you want to create: ");
		int listCreated = scanner.nextInt();

		int [] myArrayLists = new int [listCreated];

		for(int count = 0; count < myArrayLists.length; count++){

			System.out.print("Enter the elements: ");

			myArrayLists[count] = scanner.nextInt();

		}

		System.out.print("Enter numbers of list you needed to check: ");
		int choice = scanner.nextInt();

		boolean chechNumbers = getElementsInAList(myArrayLists, choice);

		System.out.print(chechNumbers);

	}

public static boolean getElementsInAList(int[] arrayList, int checker){

	for(int count = 0; count < arrayList.length; count++){				if(arrayList[count] == checker){

			return true;

		}	
	}return false;


}
}