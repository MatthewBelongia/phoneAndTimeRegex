import java.util.Scanner;

/**
 * Created by matthewb on 6/7/16.
 */
public class App {

    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();
/*
        String sampleNum = "(555) 867 5309";
        String intNum = "1(555) 867 5309";
        String int2Num = "12(555) 867 5309";

        String int3Num = "123(555) 867 5309";


        String failNum = "(44a) 555 1234";
        String passnum = "123 456 6789";
        String passintnum = "12123 456 6789";

        String withdashes = "123-555-5769";
        String allNums = "1234567890";
        String allNums2 = "12345678901";
        String allNums3 = "123456789012";

        String time = "1:15am1:25am";
        String time1 = "1:15";
        String time2 = "1:15";
        String time4 = "12:15 am";


        System.out.println(inputHandler.numberToText(time));
        System.out.println(inputHandler.numberToText(time1));
        System.out.println(inputHandler.numberToText(time2));
        System.out.println(inputHandler.isTime(time4));
        System.out.println(inputHandler.numberToText(time4));




        System.out.println(inputHandler.numberToText(sampleNum));
        System.out.println(inputHandler.numberToText(intNum));
        System.out.println(inputHandler.numberToText(int2Num));
        System.out.println(inputHandler.numberToText(int3Num));


        System.out.println(inputHandler.numberToText(failNum));
        System.out.println(inputHandler.numberToText(passnum));
        System.out.println(inputHandler.numberToText(passintnum));

        System.out.println(inputHandler.numberToText(withdashes));
        System.out.println(inputHandler.numberToText(allNums));
        System.out.println(inputHandler.numberToText(allNums2));
        System.out.println(inputHandler.numberToText(allNums3));
*/

        while(true){
            System.out.println("Enter Time or Phone Number");
            String input = inputHandler.promptUserInputForString();
            if(input.equals("quit")){
                break;
            }
            System.out.println(inputHandler.numberToText(input));
        }


    }
}
