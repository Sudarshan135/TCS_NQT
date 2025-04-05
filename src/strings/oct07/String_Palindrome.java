// 07 October 2024
//Check if the string is palindrome
package strings.oct07;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        sc.close();

        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome) {
            System.out.println("Palindrome ");
        } else {
            System.out.println(" Not Palindrome ");
        }

    }

    static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
//            rev =rev.concat(String.valueOf(temp[i]));
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        return str.equalsIgnoreCase(rev);
    }
}
