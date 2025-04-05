// 10 October 2024
package strings.oct10;

import strings.Input;

public class Remove_SpecialCharectors {
    public static void main(String[] args) {
        String str = Input.enterString();
        remove_SpecialCorrector(str);
    }

    static void remove_SpecialCorrector(String str) {
        String temp = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                temp = temp.concat(String.valueOf(c));
            }
        }
        System.out.println(temp);
    }
}