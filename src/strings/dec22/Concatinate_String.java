package strings.dec22;

import strings.Input;

public class Concatinate_String {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2="World";

        String ans=str1+str2;
        System.out.println(ans);

        String ans2=str1.concat(str2);
        System.out.println(ans2);
    }
}