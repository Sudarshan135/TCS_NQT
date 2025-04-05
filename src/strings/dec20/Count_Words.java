// 20 December 2024
package strings.dec20;

import strings.Input;

public class Count_Words {
    public static void main(String[] args) {
        String s = Input.enterString();
        int ans=count(s);
        System.out.println("Number of words : "+ans);

    }
    static int mySolution(String str){
        String[] words = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count++;
        }
       return count;
    }

    static int count(String str){
        int space=0;

        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                ++space;
            }
        }
//        System.out.println(space);
        return space+1;
    }
}