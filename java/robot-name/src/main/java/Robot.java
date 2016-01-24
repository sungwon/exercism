/**
 * Created by sungwon on 1/5/16.
 */

import java.util.HashSet;
import java.util.Random;

public class Robot {

    private final static int FIRST_UPPER_CASE_LETTER_ASCII_CODE = 65;

    private Random random;
    private String name;
    private HashSet<String> oldNames;


    public Robot() {
        random = new Random();
        oldNames = new HashSet<>();
        generateName();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        generateName();
    }

    private void generateName() {
        name = "" + generateUpperCaseLetter() + generateUpperCaseLetter() + generate3DigitNumberString();
        if (oldNames.contains(name)) {
            generateName();
        } else {
            oldNames.add(name);
        }
    }

    private char generateUpperCaseLetter() {
        return (char) (random.nextInt(26) + FIRST_UPPER_CASE_LETTER_ASCII_CODE);

    }

    private String generate3DigitNumberString() {
        int num = random.nextInt(1000);
        return String.format("%03d", num);
    }

}
