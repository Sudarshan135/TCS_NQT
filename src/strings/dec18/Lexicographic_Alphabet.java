// 18 December 2024
package strings.dec18;

public class Lexicographic_Alphabet {
    public static void main(String[] args) {
        String str = "abcdxyz";//bcdeyza
        StringBuffer ans = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            System.out.println((int)c);
            if (c == 'z') {
                ans.insert(i, 'a');
            } else if (c == 'Z') {
                ans.insert(i, 'Z');
            } else if (c >= 'A' && c < 'Z' || c >= 97 && c < 122) {
//                System.out.println("capital "+c);
                ans.append(++c);
            }
            System.out.println(ans);
        }
    }
}