// 28 October 2024
package strings.oct28;

import java.util.Arrays;

public class FrequencyOfLetters {
    public static void main(String[] args) {
        String data = "takeuforward";
        mySolution(data);
        System.out.println();
        usingSingleLoop(data);
    }

    static void mySolution(String data) {

        for (char c : data.toCharArray()) {
            char[] temp = data.toCharArray();
            int count = 0;
            for (int i = 0; i < temp.length; i++) {
                if (c == temp[i]) {
                    count++;
                }
            }
            System.out.print(c + "" + count + " : ");
        }

    }

    static void usingSingleLoop(String data) {
//        sort the array
        data=SortString(data);
//        System.out.println(data);
        char c = data.charAt(0);
        int count = 1;
        for (int i = 1; i < data.length(); i++) {
            if (c == data.charAt(i)) {
//                check if current and next char is same
                count++;
            }else {
                System.out.print(c+""+count+" : ");
//                if not set char to next index char
                c=data.charAt(i);
                count=1;
            }
        }
        System.out.print(c+""+count+" : ");

    }
    public static String SortString(String str) {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}