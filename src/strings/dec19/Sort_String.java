// 19 December 2024
package strings.dec19;

public class Sort_String {
    public static void main(String[] args) {
        String s = "axbycz";

//        StringBuffer answer = mySolution(s);
        sortString(s);
//        System.out.println(answer);

    }

    static StringBuffer mySolution(String string) {
        StringBuffer ans = new StringBuffer();
        int[] asci = new int[256];
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            asci[ch] = ch;
        }
        for (int i : asci) {
            char ch = (char) i;
            if (i != 0)
                ans.append(ch);

        }
//        System.out.println(ans);
        return ans;
    }

    static String sortString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            for (int j = i; j < chars.length; j++) {
                if (c > chars[j]) {
//                    System.out.println(chars[i] + " " + chars[j]);
//                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = c;

                    String ans = new String(chars);
                    System.out.println(ans);
                }
            }
//            System.out.println(chars[i]);
        }
        return str;
    }
}