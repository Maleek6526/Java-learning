package LittleHereAndThere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexTutorialTest {
    @Test
    public void testFirstNonsense(){
        assertTrue(RegexTutorial.getPhoneNumber("09016660092"));
    }

    @Test
    public void testSecondNonsense(){
        assertTrue(RegexTutorial.getPhoneNumber("0716660092"));
    }

    @Test
    public void testThirdNonsense(){
        assertTrue(RegexTutorial.getPhoneNumber("07025284621"));
    }

    @Test
    public void testFourthNonsense(){
        assertTrue(RegexTutorial.getFirstStringNumber("+2347025284621"));
    }

    @Test
    public void testFifthNonsense(){
        assertTrue(RegexTutorial.getFirstStringNumber("+2347025284621"));
    }

}