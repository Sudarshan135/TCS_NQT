// 08 October 2024
//count the number of vowels, consonants, and spaces in that string.
package strings.oct08;

import strings.Input;

public class Vowel_Spaces_Consonats {
    public static void main(String[] args) {
        String str = Input.enterString().toLowerCase();

        int vowel = 0;
        int consonant = 0;
        int space = 0;
        int symbols=0;
        int digit=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;

            } else if (c == ' ') {
                space++;
            } else if (c>='a'&& c<='z'){
                consonant++;
            }else {
                if (Character.isDigit(c))
                    digit++;
                  else
                symbols++;

            }
//            System.out.print(":  "+vowel + "  " + consonant+ " " +space );
        }
        System.out.print("Vowels     : "+vowel + "\nConsonants : " + consonant+ "\nSpaces     : " +space+" " + "\nSysmbols   : "+symbols );

    }
}