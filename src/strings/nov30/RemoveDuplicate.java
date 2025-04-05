// 30 November 2024
package strings.nov30;

public class RemoveDuplicate {
    static boolean[] visit;

    public static void main(String[] args) {
        String string = "bcabc";

        String ans=mySolution(string);
        System.out.println(ans);

    }

    static String mySolution(String str) {
        visit = new boolean[256];
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!visit[c]) {
                newStr += str.charAt(i);
                visit[c] = true;
            }
//            System.out.println(visit[i] + " " + c);
        }
        return newStr;
    }
}