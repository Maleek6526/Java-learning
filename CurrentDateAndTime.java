import java.util.Scanner;

public class CurrentDateAndTime{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		long millis = System.currentTimeMillis();

		String currentOutput = getCurrentTime(millis);

		System.out.println(currentOutput);
	
	}


public static String getCurrentTime(long number){

	long seconds = number / 1000;

	long currentSeconds = seconds % 60;

	long minute = seconds / 60;

	long currentMinute = minute % 60;

	long hours = minute / 60;

	long currentHours = hours % 24;

	long finalCurrentHour = currentHours + 1;

	return String.format("Current date and time is %02d:%02d:%02d", finalCurrentHour, currentMinute, currentSeconds);
}
}