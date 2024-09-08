import java.util.*;

public class CurrentDateAndTime{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter in milliseconds: ");
		long userInput = scanner.nextLong();

		String currentOutput = getCurrentTime(userInput);

		System.out.println(currentOutput);
	
	}


public static String getCurrentTime(long number){

	long seconds = number / 1000;

	long currentSeconds = seconds % 60;

	long minute = seconds / 60;

	long currentMinute = minute % 60;

	long hours = minute / 60;

	long currentHours = minute % 24;

	return String.format("Current date and time is %d:%d:%d", currentHours, currentMinute, currentSeconds);
}
}