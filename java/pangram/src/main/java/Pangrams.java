public class Pangrams {

    final static int LETTERS = 26;
    final static int ALPHA_LETTER = 97; // ascii code of first letter

    public static boolean isPangram(String sentenceString) {
        boolean[] alphabucket = new boolean[26]; // could optimize with a bitmap
        String sentence = sentenceString.toLowerCase();

        // if sentence has fewer letters than the alphabet, don't bother doing any more work
        if (sentence.length() < LETTERS) return false;

        int alphaIndex;
        for(int i=0; i< sentence.length(); i++) {
            alphaIndex = sentence.charAt(i)-ALPHA_LETTER;
            if (alphaIndex >=0 && alphaIndex < LETTERS) {
                alphabucket[alphaIndex] = true;
            }
        }

        for (boolean curBool: alphabucket) {
            if (curBool != true) return false;
        }
        return true;
    }
}