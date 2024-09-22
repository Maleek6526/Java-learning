import java.util.Scanner;

public class ElementsInOddPosition{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of list you want to create: ");
		int listCreated = scanner.nextInt();

		int [] myArrayLists = new int [listCreated];

		for(int count = 0; count < myArrayLists.length; count++){

			System.out.print("Enter the elements: ");

			myArrayLists[count] = scanner.nextInt();

		}

		getElementsInAList(myArrayLists);

		
		

	}

public static void getElementsInAList(int[] arrayList){

	for(int count = 0; count < arrayList.length; count++){	

		if(count % 2 == 0){								System.out.print(arrayList[count]);
		}
	}	
}

}