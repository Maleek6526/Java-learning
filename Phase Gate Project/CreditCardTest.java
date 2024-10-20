import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest{


	@Test
	public void getModifiedStringTest(){

		//Given

		CreditCard validator = new CreditCard();
		
		String card = "4388_5760_1840_2626";

		String cardTwo = "4388_5760_1841_0707";


		//When

		String result = validator.getModifiedString(card);

		String resultTwo = validator.getModifiedString(cardTwo);


		String expected = "4388576018402626";

		String expectedTwo = "4388576018410707";

		
		//Check

		assertEquals(expected, result);
		assertEquals(expectedTwo, resultTwo);

	}

	@Test
	public void getConvertedIntCreditCardTest(){

		//Given

		CreditCard validator = new CreditCard();
		
		String card = "4388576018402626";

		String cardTwo = "4388576018410707";


		//When

		int[] result = validator.getConvertedIntCreditCard(card);

		int[] resultTwo = validator.getConvertedIntCreditCard(cardTwo);


		int[] expected = {4, 3, 8, 8, 5, 7, 6, 0, 1, 8, 4, 0, 2, 6, 2, 6};

		int[] expectedTwo = {4, 3, 8, 8, 5, 7, 6, 0, 1, 8, 4, 1, 0, 7, 0, 7};

		
		//Check

		assertArrayEquals(expected, result);

		assertArrayEquals(expectedTwo, resultTwo);
		

	}

	@Test
	public void getOddAndEvenIndexesTest(){

		//Given

		CreditCard validator = new CreditCard();
		
		String card = "4388576018402626";

		String cardTwo = "4388576018410707";


		//When

		int[] result = validator.getOddAndEvenIndexes(card);

		int[] resultTwo = validator.getOddAndEvenIndexes(cardTwo);


		int[] expected = {8, 3, 7, 8, 1, 7, 3, 0, 2, 8, 8, 0, 4, 6, 4, 6};

		int[] expectedTwo = {8, 3, 7, 8, 1, 7, 3, 0, 2, 8, 8, 1, 0, 7, 0, 7};

		
		//Check

		assertArrayEquals(expected, result);

		assertArrayEquals(expectedTwo, resultTwo);
		

	}

	@Test
	public void checkValidityTest(){

		//Given

		CreditCard validator = new CreditCard();
		
		String card = "4388576018402626";

		String cardTwo = "4388576018410707";


		//When

		String result = validator.checkValidity(card);

		String resultTwo = validator.checkValidity(cardTwo);


		String expected = "**Credit Card Vadility Status: Invalid";

		String expectedTwo = "**Credit Card Vadility Status: Valid";

		
		//Check

		assertEquals(expected, result);

		assertEquals(expectedTwo, resultTwo);
		

	}


	@Test
	public void checkValidityTest(){

		//Given

		CreditCard validator = new CreditCard();
		
		String card = "4388576018402626";

		String cardTwo = "4388576018410707";


		//When

		String result = validator.checkValidity(card);

		String resultTwo = validator.checkValidity(cardTwo);


		String expected = "**Credit Card Vadility Status: Invalid";

		String expectedTwo = "**Credit Card Vadility Status: Valid";

		
		//Check

		assertEquals(expected, result);

		assertEquals(expectedTwo, resultTwo);
		

	}

}
