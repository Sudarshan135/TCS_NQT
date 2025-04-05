// 12 October 2024
package strings.oct12;

public class Remove_Brackets {
    public static void main(String[] args) {
        String str = "a+((b-c)+d)";
        System.out.println(str);

        String  result =remove_Brackets(str);
        System.out.println(result);

    }

    static String remove_Brackets(String str) {
        int n = str.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c != '(' && c != ')') {
                ans = ans.concat(c + "");
            }
        }
        return ans;
    }
}