// 14 October 2024
package strings.oct14;

public class Capitalize_Letter {
    public static void main(String[] args) {
        String str = "take u forward is awesome";
        myApproach(str);
    }

    static void myApproach(String str) {

        String[] tokens = str.split(" ");
        String capital="";

        for (String s : tokens) {
            int n = s.length();
//            if we substract 32 from char then it gives value of capital letter
            if (n == 1) {
                s = s.toUpperCase();
            } else {
                char f = (char) ( s.charAt(0) );
                char l = (char) ( s.charAt(n - 1) );
                s = Character.toUpperCase(f) + s.substring(1, n - 1) + Character.toUpperCase(l);
                System.out.println(s);
                capital=capital+s+" ";
            }
        }
        System.out.println(capital);
    }
}