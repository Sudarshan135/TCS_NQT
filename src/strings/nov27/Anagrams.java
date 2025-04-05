// 27 November 2024
package strings.nov27;

import arrays.Array;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "INTEGER";
        String str2 = "TEGERNI";

        System.out.println(anagram(str1,str2));


    }

    static  boolean anagram(String s1,String s2){
        char [] c1=sort(s1);
        char[] c2=sort(s2);
        if (c1.length!=c2.length){
            return false;
        }
        for (int i=0 ; i<c1.length;i++){
            if (c1[i]!=c2[i]){
              return false;
            }
        }
        return true;
    }
    static char[] sort(String s){
        char[] c= s.toCharArray();
        Arrays.sort(c);
        return c;
    }
}