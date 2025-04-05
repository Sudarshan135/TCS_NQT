// 03 December 2024
package strings.dec03;

public class PrintDuplicates {
    public static void main(String[] args) {
        String string = "sinstriiintng";
        int[] ans = mySolution(string);

        for (int i = 0; i < ans.length; i++) {

            if (ans[i] > 1) {
                System.out.println((char) i + " - " + ans[i]);
            }
        }
    }

    static int[] mySolution(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }
        return freq;
    }
}