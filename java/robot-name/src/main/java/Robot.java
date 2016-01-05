/**
 * Created by sungwon on 1/5/16.
 */

import java.util.HashSet;
import java.util.Random;

public class Robot {


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
        return (char) (random.nextInt(26) + 65);

    }

    private String generate3DigitNumberString() {
        String digit = "";

        for (int i = 0; i<3; i++) {
            int num = (random.nextInt(10));
            digit += Integer.toString(num);
        }
        return digit;

    }

}
