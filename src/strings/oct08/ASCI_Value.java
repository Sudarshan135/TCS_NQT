// 08 October 2024
//Find the ASCII value of the character.
package strings.oct08;

import strings.Input;

public class ASCI_Value {
    public static void main(String[] args) {
//          we store the character value in an integer which gives us the ASCII value of the character.
//        char c = 'e';
//        int ascii = c;

        String str = Input.enterString();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c + " ----> " + (int) c);
        }

    }
}