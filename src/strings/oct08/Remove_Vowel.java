// 08 October 2024
//write a program to remove vowels from a given String.
package strings.oct08;

public class Remove_Vowel {
    public static void main(String[] args) {
        String string = "take u forward";

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                string=string.substring(0, i)+ string.substring(i + 1);
            }
            System.out.println(string);

        }

    }
}