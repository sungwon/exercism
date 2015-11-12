import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {

      Map<String, Integer> letterKeys = new TreeMap<String, Integer>();

      for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
         for (String letter : entry.getValue()) {
            letterKeys.put(letter.toLowerCase(), entry.getKey());
         }
      }
      return letterKeys;
   }
}
