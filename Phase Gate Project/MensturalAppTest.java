import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class MensturalAppTest{


	@Test
	public void getOvulationPeriodTest(){

		//Given

		MensturalApp myMensturalApp = new MensturalApp();
		LocalDate startDate = LocalDate.parse("2024-10-07");

		int lengthOfOvulation = 28;


		//When

		LocalDate result = getOvulationPeriod(startDate, lengthOfOvulation);

		LocalDate expected = LocalDate.parse("2024-10-21");
		
		//Check

		assertEquals(expected, result);


	}

		
}
