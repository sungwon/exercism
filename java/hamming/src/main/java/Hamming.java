public class Hamming {

    public static int compute(String strand1, String strand2) {
        if (strand1.length() != strand2.length()) {
            throw new IllegalArgumentException();
        }

        int count = 0;


        for (int i=0; i<strand1.length(); i++) {
            if (strand1.charAt(i) != strand2.charAt(i)) {
                count++;
            }
        }

        return count;
    }

}
