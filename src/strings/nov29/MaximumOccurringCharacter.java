// 29 November 2024
package strings.nov29;

//Maximum occurring character in a string
public class MaximumOccurringCharacter {
    public static void main(String[] args) {
        String s = "SUDARSHAN";
        mySolution(s);
        maxOccurence(s);

    }

    static void maxOccurence(String str) {
        int maxfreq = 0;
        char ans = 'a';
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
             count[str.charAt(i)]++;
            if (count[str.charAt(i)] > maxfreq) {
                maxfreq=count[str.charAt(i)];
                ans=str.charAt(i);
            }
        }
        System.out.println(ans +" "+maxfreq);
    }

    static void mySolution(String s1) {
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
//            if (c == s1.charAt(i)) {
            freq[c]++;
//                System.out.println(c);
//            }
        }

        int max = freq[0];
        int index = 0;
        for (int i = 1; i < freq.length; i++) {
//            if (freq[i] > 0) {
//                System.out.println((char) i + " " + freq[i]);
//            }
            if (max <= freq[i]) {
                max = freq[i];
                index = i;
            }
        }
        System.out.println((char) index + " " + max);
    }

}