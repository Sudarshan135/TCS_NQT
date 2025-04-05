// 08 October 2024
package strings;

import java.util.Scanner;

public class Input {
    public static String enterString(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        return s;
    }
}