import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sungwon on 1/7/16.
 */
public class PhoneNumber {

    private String number = "";

    public PhoneNumber(String stringNumber) {
        for (int i=0; i<stringNumber.length(); i++){
            char current = stringNumber.charAt(i);
            if (current >= '0' && current <= '9') {
                number += current;
            }
        }
        if (number.length() != 10) {
            if (number.charAt(0) == '1' && number.length() == 11) {
                number = number.substring(1, number.length());
            } else {
                number = "0000000000";
            }
        }
    }

    public String getNumber() {
        return number;
    }

    public String getAreaCode() {
        return number.substring(0,3);
    }

    public String pretty() {
        return "(" + getAreaCode() + ") " + number.substring(3,6) + "-" + number.substring(6,10);
    }

}
