import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Mbti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.print("Please enter your name: ");
	String name = scanner.nextLine();

	System.out.println();

	ArrayList <String> theAnswers = new ArrayList <> ();

        String[] optionsA = {"expend energy, enjoy groups","Interpret literally","logical, thinking, questioning","organized, orderly","more outgoing, think out loud","practical, realistic, experiential","candid, straightforward, frank","plan, schedule","seek many tasks, public activities, interaction with others","standard, usual, conventional","firm, tend to criticize, hold the line","regulated, structured","external, communicative, express yourself","focus on here-and-now","tough-minded, just","preparation, plan ahead","active, initiate","facts, things, what is, ideas","matter of fact, issue-oriented","control, govern"};

	String[] optionsB = {
  "conserve energy, enjoy one-on-one","look for meaning and possibilities", "empathetic, feeling, accommodating", "flexible, adaptable","more reserved, think to yourself", "imaginative, innovative, theoretical","tactful, kind, encouraging","unplanned, spontaneous","seek private, solitary activities with quiet to concentrate","different, novel, unique","gentle, tend to appreciate, conciliate","easy-going, live and let live",
"internal, reticent, keep to yourself","look to the future, global perspective, big picture","tender-hearted, merciful","go with the flow, adapt as you go","reflective, deliberate","ideas, dreams, what could be, philosophical","sensitive, people-oriented, compassionate","latitude, freedom"};



while(true){
	for(int count = 0; count < optionsA.length; count++){

		System.out.printf("A %s\t B %s%n", optionsA[count], optionsB[count] );
		String userInput = scanner.next();

			if(userInput.equalsIgnoreCase("A")){

				theAnswers.add(optionsA[count]);
			}

			else if(userInput.equalsIgnoreCase("B")){

				theAnswers.add(optionsB[count]);
			}


			else{

				System.out.println("You have enter an invalid input. please pick the right option (A or B)");

			}

	}

}

	 		System.out.println("Thank you, " + name + ". Here are your answers:");
        	for (String answer : theAnswers) {
        		    System.out.println(answer);
        	}
	
	}
	
}