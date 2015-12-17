import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

    private String keyword;
    private int keywordSize;
    private Map<Character, Integer> keywordLetters;

    public Anagram(String word) {
        this.keyword = word.toLowerCase();
        this.keywordSize = word.length();

        keywordLetters = countLetters(keyword);
    }

    public List<String> match(List<String> words) {

        List<String> result = new ArrayList<String>();

        for (String word : words) {
            if (isAnagramOf(word)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean isAnagramOf(String word) {
        Map<Character, Integer> currentWordLetters;

        word = word.toLowerCase();

        // if the words aren't the same length, don't even bother checking anymore
        if ((word.length() != keywordSize) || (word.equals(keyword))) {
            return false;
        } else {
            currentWordLetters = countLetters(word);
            for (char key : currentWordLetters.keySet()) {
                if (keywordLetters.get(key) != currentWordLetters.get(key)) {
                    return false;
                }
            }
            return true;
        }
    }

    private Map<Character, Integer> countLetters(String word) {
        Map<Character, Integer> letterCounts = new HashMap<Character, Integer>();

        int count;
        for (char curChar : word.toCharArray()) {
            count = letterCounts.containsKey(curChar) ? letterCounts.get(curChar) : 0;
            letterCounts.put(curChar, ++count);
        }
        return letterCounts;
    }

}
