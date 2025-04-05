// 25 November 2024
package strings.nov25;

public class Non_Repeating {
    public static void main(String[] args) {
        String str = "google";
        non_Repeating(str);
    }

    static void non_Repeating(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            freq[c]++; //this will increment value at given index
            System.out.println(c +"  "+freq[c]);
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.println((char) i);
            }
        }


    }
}