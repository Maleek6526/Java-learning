import java.util.Scanner;
import java.time.LocalDate;

public class MensturalApp{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		try{

			System.out.print("Please enter your name: ");
	
			String usersName = scanner.nextLine();

			System.out.print("The start date of the last period in this format (yyyy-mm-dd): ");
		
			String usersStartDate = scanner.nextLine();

		
			System.out.print("Please enter your circle length: ");

			int usersCicleLength = scanner.nextInt();

	
			System.out.print("Please how much days it your mensturation takes: ");
	
			int mensturalRange = scanner.nextInt();

			LocalDate startDate = LocalDate.parse(usersStartDate);

			System.out.println("Hi "+ usersName);

			System.out.println("Your next ovulation period is "+ getOvulationPeriod(startDate, usersCicleLength));

			System.out.println("Your next period date is "+ getNextPeriodDate(startDate, usersCicleLength));

			LocalDate[] fertileWindow = getFertileWindow(startDate, usersCicleLength);

			System.out.println("Your fertile window starts from "+fertileWindow[0] + " to " +fertileWindow[1]);

			LocalDate[] safePeriod = getSafePeriod(startDate, usersCicleLength);
			System.out.println("Your safe period starts from " + safePeriod[0] + " to " + safePeriod[1]);


			LocalDate[] flowDates = getFlowDate(startDate, mensturalRange, usersCicleLength);
			System.out.println("Your flow date starts from " + flowDates[0] + " to " + flowDates[1]);
		}
	
		catch(Exception e){

			System.out.print("Invalid input try again!");

		}

		

	}

	public static LocalDate getOvulationPeriod(LocalDate date, int length){

		int ovulation = length / 2;

		return date.plusDays(ovulation);
	}


	public static LocalDate getNextPeriodDate(LocalDate date, int length){

		return date.plusDays(length);

	}


	public static LocalDate[] getFertileWindow(LocalDate date, int length) {
		int ovulation = length / 2;

		int fertileCalculationBeforeOvulation = ovulation - 3;
		int fertileCalculationAfterOvulation = ovulation + 3;

		LocalDate[] fertileWindow = {
			date.plusDays(fertileCalculationBeforeOvulation),
			date.plusDays(fertileCalculationAfterOvulation)
		};

 
		return fertileWindow;
	}


	public static LocalDate[] getSafePeriod(LocalDate date, int length) {
		
		LocalDate myOvulation = getNextPeriodDate(date, length);
    
		LocalDate safeStart = myOvulation.minusDays(7);
		LocalDate safeEnd = myOvulation.plusDays(length);
    
		return new LocalDate[] { safeStart, safeEnd };
	
	}


	public static LocalDate[] getFlowDate(LocalDate date, int range, int length) {
		LocalDate flowDate = getNextPeriodDate(date, length);
    
		LocalDate flowStart = flowDate.minusDays(range);
		LocalDate flowEnd = flowDate;
    
		return new LocalDate[] { flowStart, flowEnd };
	}


}