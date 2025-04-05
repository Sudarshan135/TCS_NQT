// 09 October 2024
package strings.oct09;

import strings.Input;

public class Remove_Spaces {
    public static void main(String[] args) {
        String str = Input.enterString();

        removeSpaces(str);
        System.out.println("___________________");

        char[] chars = str.toCharArray();
        int count = removeSpaces(chars);

        System.out.println(String.valueOf(chars));
//        subsequence return the substring/subsequence of char array
        System.out.println(String.valueOf(chars).subSequence(0, count));

    }

    static void removeSpaces(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c==' ') {
                str = str.substring(0, i) + str.substring(i+1);
            }
        }
        System.out.println(str);
    }

    static int removeSpaces(char[] str) {

        int count = 0; // to track spaces seen so far

        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                str[count] = str[i];
                count++; // increment coun
            }
        }

        return count;
    }
}