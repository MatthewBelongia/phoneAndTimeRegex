import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by matthewb on 6/7/16.
 */
public class InputHandlerSpecs {

    InputHandler inputHandler;

    @Before
    public void init(){
        inputHandler = new InputHandler();
    }

    @Test
    public void isPhoneNumberTest(){

        String notNum = "abc 123 4567";
        Boolean result = inputHandler.isPhoneNumber(notNum);
        assertFalse("input was not a number",result);
        String notrightLength = "1234 123 123";
        Boolean result2 = inputHandler.isPhoneNumber(notrightLength);
        assertFalse("input not correct format",result2);
        String num = "(123) 123 1234";
        Boolean result3 = inputHandler.isPhoneNumber(num);
        assertTrue("is correct format",result3);
        String num1 = "(123)-123-1234";
        Boolean result4 = inputHandler.isPhoneNumber(num1);
        assertTrue("is correct format",result4);
        String num2 = "1231231234";
        Boolean result5 = inputHandler.isPhoneNumber(num2);
        assertTrue("is correct format",result5);
    }

    @Test
    public void convertToTextTest(){

        String before = "(867) 530 0925";
        String converted = inputHandler.convertToString(before);
        assertEquals("Should covert all numbers to text representation","eightsixseven fivethreezero zeroninetwofive",converted);
    }

    @Test
    public void numberToTextTest(){

        String input = "123456789012";
        String converted = inputHandler.numberToText(input);
        assertEquals("Should covert to text representation if acceptable phoneNum","onetwo threefourfive sixseveneight ninezeroonetwo",converted);
    }
}
