public class Hamming {

    public static int compute(String strand1, String strand2) {
        if (strand1.length() != strand2.length()) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        char[] strandArray1 = strand1.toCharArray();
        char[] strandArray2 = strand2.toCharArray();

        for (int i=0; i<strandArray1.length; i++) {
            if (strandArray1[i] != strandArray2[i]) {
                count++;
            }
        }
        
        return count;
    }

}
