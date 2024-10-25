import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

	try{

		System.out.print("How many number of student do you have? ");
		int numberOfStudents = scanner.nextInt();

		System.out.print("How many subjects do they offer? ");
		int numberOfSubjects = scanner.nextInt();

		if(numberOfStudents > 0){
	
			if(numberOfSubjects > 0){

				getStudentChart(numberOfStudents, numberOfSubjects);

			}

			else{

				System.out.println("Invalid Input");

			}

		}

		else{

			System.out.println("Oga Haffa you now!!");

		}

		

	}

	catch(Exception e){

		System.out.println("Invalid input");

	}

	}

	public static int[][] getInputCollected(int num, int sub){

		Scanner scanner = new Scanner(System.in);

		String savingInputDisplay = """ 

				Saving >>>>>>>>>>>>>>>>>>>>>
				Saved successfully

				""";

		System.out.println(savingInputDisplay);


		int[][] studentGrade = new int [num][sub];
	
		for(int index = 0; index < studentGrade.length; index++){
			for(int count = 0; count < studentGrade[index].length; count++){

				System.out.println("Enter score for student " + (index+1) + ": ");
				System.out.println("Enter student score in Subject" + (count+1) + ": ");

				studentGrade[index][count] = scanner.nextInt();

	
			String storingInputDisplay = """ 

				Saving >>>>>>>>>>>>>>>>>>>>>
				Saved successfully

			""";

		System.out.println(storingInputDisplay);

			}
			System.out.println();

		}
			return studentGrade;
	}


	public static void getStudentChart(int num, int sub){

		int[] bubbleSorting = new int[num];

		int[] totalPosition = new int[num];


		int[] newPositioning = new int[num];

		int[][]scoreInputs = getInputCollected(num, sub);

		System.out.println("==============================================================================================================================================");

			System.out.print("SUBJECT \t");

		for(int index = 0; index < sub; index++){


			System.out.print("SUB"+ (index+1) + " \t ");

		}

			System.out.print("TOT \t AVE \t POS");

			System.out.println();

		System.out.println("===============================================================================================================================================");
		
		for(int index = 0; index < scoreInputs.length; index++){

			int sum = 0;
			float average = 0;

			System.out.print("STUDENT "+ (index+1) );	

			for(int count = 0; count < scoreInputs[index].length; count++){

				sum += scoreInputs[index][count];
				System.out.print(" \t " + scoreInputs[index][count]);

			}
				bubbleSorting[index] = sum;

				totalPosition[index] = sum;

				average = (float) sum / sub;
			System.out.print(" \t"+sum);
			System.out.printf(" \t%.2f", average);
			System.out.println();

		}

		System.out.println("==============================================================================================================================================");



		for(int index = 1; index < bubbleSorting.length; index++){

			int temp = 0;
	
			for(int count = 1; count < bubbleSorting.length; count++){

				if(bubbleSorting[count] < bubbleSorting[count-1]){
	
					temp = bubbleSorting[count];

					bubbleSorting[count] = bubbleSorting[count-1];
				
					bubbleSorting[count-1] = temp;

				}

				

			}
		}

		for(int index = 0; index < bubbleSorting.length; index++){

				int counter = 1;

			for(int count = 0; count < bubbleSorting.length; count++){

				if(totalPosition[index] < bubbleSorting[count]) counter++;

			}

			newPositioning[index] = counter;

		}

			for(int display = 0; display < newPositioning.length; display++){


				System.out.println(newPositioning[display]);

			}



		

	}


}