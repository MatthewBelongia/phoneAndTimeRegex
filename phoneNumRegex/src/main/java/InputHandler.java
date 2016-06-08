import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by matthewb on 6/7/16.
 */
public class InputHandler {
    public Boolean isPhoneNumber(String input) {
        Boolean isPhoneNum = false;
        if (input.matches("(\\d{0,2})?([-.\\s])?(\\()?(\\d{3})?(\\))?([-.\\s])?\\d{3}([-.\\s])?\\d{4}")) {
            isPhoneNum = true;
        }
        /*
        else if(input.matches("(\\d{0,2})?([-.\\s])?\\d{3}\\s\\d{3}\\s\\d{4}")){
            isPhoneNum = true;
        }
        else if(input.matches("(\\d{0,2})?([-.\\s])?\\d{3}-\\d{3}-\\d{4}")){
            isPhoneNum = true;
        }
        else if(input.matches("(\\d{0,2})?([-.\\s])?\\(\\d{3}\\)-\\d{3}-\\d{4}")){
            isPhoneNum = true;
        }
        else if(input.matches("\\d{10,12}")){
            isPhoneNum = true;
        }
*/
        return isPhoneNum;
    }

    public Boolean isTime(String input) {
        Boolean isTime = false;
        if (input.matches("(([0-1]{1})?\\d{1}|20|21|22|23|24):([0-5]{1})(\\d{1})(\\s)?((am)|(pm)|(AM)|(PM))?")) {
            isTime = true;
        }
        return isTime;
    }

    public String convertToString(String input) {
        input = input.replaceAll("[^0-9]+", "");
        //System.out.println(input);
        String[] splitNum = input.split("");
        String stringConversion = "";
        int count = 0;
        for (String num : splitNum) {
            count++;
            if (input.length() == 10) {
                if (count == 4 || count == 7) {
                    stringConversion += " ";
                }
            } else if (input.length() == 11) {
                if (count == 2 || count == 5 || count == 8) {
                    stringConversion += " ";
                }
            } else if (input.length() == 7) {
                if (count == 4) {
                    stringConversion += " ";
                }
            } else if (input.length() == 12) {
                if (count == 3 || count == 6 || count == 9) {
                    stringConversion += " ";
                }
            }
            else if (input.length() == 13) {
                if (count == 4 || count == 7 || count == 10) {
                    stringConversion += " ";
                }
            }


            switch (num) {
                case "0":
                    stringConversion += "zero";
                    break;
                case "1":
                    stringConversion += "one";
                    break;
                case "2":
                    stringConversion += "two";
                    break;
                case "3":
                    stringConversion += "three";
                    break;
                case "4":
                    stringConversion += "four";
                    break;
                case "5":
                    stringConversion += "five";
                    break;
                case "6":
                    stringConversion += "six";
                    break;
                case "7":
                    stringConversion += "seven";
                    break;
                case "8":
                    stringConversion += "eight";
                    break;
                case "9":
                    stringConversion += "nine";
                    break;
                default:
                    break;
            }
        }


        return stringConversion;

    }

    public String timeConverter(String input) {
        String[] decoder = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", " nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty",
                "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
                "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty",
                "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty"};
        String militaryTime = " hundred hours";
        if (input.contains("am") || input.contains("pm")|| input.contains("AM")|| input.contains("PM")) {
            militaryTime = "";
        }

        input = input.replaceAll("[^0-9:]+", "");
        String timeText = "";
        String[] splitTime = input.split(":");
        Boolean space = true;
        if (input.contains("00")) {
            space = false;
        }
        for (String num : splitTime) {

            if(num.equals("00")){
                continue;
            }
            timeText += decoder[Integer.parseInt(num)];
            if (space) {
                timeText += " ";
                space = false;
            }

        }
        return timeText + militaryTime;
    }

    public String numberToText(String input) {
        String result = "I dont like people playing on my phone!";
        System.out.println(input);
        if (isPhoneNumber(input)) {
            result = convertToString(input);
        } else if (isTime(input)) {
            result = timeConverter(input);
        }
        return result;
    }

    public String promptUserInputForString() {
        Scanner promptUser = new Scanner(System.in);
        String input = promptUser.nextLine();
        return input;
    }
}
