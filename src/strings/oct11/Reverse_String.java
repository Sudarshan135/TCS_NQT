// 11 October 2024
package strings.oct11;

import strings.Input;

import java.util.Stack;

public class Reverse_String {
    public static void main(String[] args) {
        String str = Input.enterString();
        String result = reverse(str);
        System.out.println("Orignal String : " + str);
        System.out.println("Reverse String : " + result);

       String result2= string_Reverse(str);
        System.out.println("Reverse String : " + result2);

    }

    static String reverse(String str) {
        int right = str.length() - 1;
        String rev = "";
        for (int i = right; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
//        System.out.println(rev);
        return rev;
    }

    static String  string_Reverse(String s){
        String rev="";
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        int i=0;
        while(!stack.isEmpty()){
            rev= rev+stack.pop();
        }
//        System.out.println(rev);
        return rev;
    }
}