// 19 December 2024
package strings.dec19;

public class LargestWord_inString {
    public static void main(String[] args) {
        String str = "Google doc is the most searched abdlklfhsdghasrgrui";

        String ans = mySolution(str);
        System.out.println("largest word in string : " + ans);
    }

    static String mySolution(String str) {

        String[] strings = str.split(" ");
        String largest = strings[0];
        for (int i = 1; i < strings.length; i++) {

            if (strings[i].length() > largest.length()) {
                largest = strings[i];
            }
        }
//        System.out.println(largest);
        return largest;
    }
}