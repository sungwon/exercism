import java.util.HashMap;
import java.util.Map;

public class WordCount {

    private Map<String, Integer> counts = new HashMap<String, Integer>();

    public WordCount() {

    }
    
    public Map<String, Integer> Phrase(String phrase) {

        String[] words = phrase.split("\\W+");

        for (String word : words) {
            word = word.toLowerCase();
            int count = 0;
            if (counts.containsKey(word)) {
                count = counts.get(word);
            }
            counts.put(word, ++count);
        }

        return counts;
    }

}
