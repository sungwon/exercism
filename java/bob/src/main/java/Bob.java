/**
 * Created by sungwon on 1/4/16.
 */
public class Bob {

    public String hey(String phrase) {
        String answer = "Whatever.";

        if (isSilence(phrase)) {
            answer = "Fine. Be that way!";
        } else if (isShouting(phrase)) {
            answer = "Whoa, chill out!";
        } else if (isQuestion(phrase)) {
            answer = "Sure.";
        }

        return answer;
    }

    public static boolean isShouting(String phrase) {
        if (!phrase.matches(".*\\p{javaLowerCase}.*") && phrase.matches(".*\\p{javaUpperCase}.*")) {
            return true;
        }
        return false;
    }

    public static boolean isQuestion(String phrase) {
        if (phrase.charAt(phrase.length()-1) == '?') {
            return true;
        }
        return false;
    }

    public static boolean isSilence(String phrase) {
        if (phrase.matches("\\s*")) {
            return true;
        }
        return false;
    }
}
