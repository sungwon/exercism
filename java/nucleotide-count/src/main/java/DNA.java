import java.util.TreeMap;

public class DNA {

    private String dnaString;
    private char[] dnArray = {'A', 'C', 'G', 'T'};

    public DNA(String dnaString) {
        this.dnaString = dnaString;
    }

    private boolean isNucleotide(char nucleotide) {
        for (int i=0; i<dnArray.length; i++) {
            if (dnArray[i] == nucleotide) {
                return true;
            }
        }
        return false;
    }

    public int count(char nucleotide) {

        if (!isNucleotide(nucleotide)) throw new IllegalArgumentException();

        int count = 0;
        for (int i=0; i<dnaString.length(); i++) {
            if (dnaString.charAt(i) == (nucleotide)) {
                count++;
            }
        }
        return count;
    }

    public TreeMap nucleotideCounts() {
        TreeMap map = new TreeMap();


        for (int i=0; i<dnArray.length; i++) {
            map.put(dnArray[i], count(dnArray[i]));
        }

        return map;
    }

}
