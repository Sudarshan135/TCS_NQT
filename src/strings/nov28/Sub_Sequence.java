// 28 November 2024
//Count common sub-sequence in two strings
package strings.nov28;

public class Sub_Sequence {
    public static void main(String[] args) {
        String s = "abc";
      String [] ans=  findSubsequence(s);

      for (int i=0;i<ans.length;i++){
          System.out.println(ans[i]);
      }
    }

    static String[] findSubsequence(String str) {
        if (str.length() == 0) {
            String[] ans = {""};
            return ans;
        }
        String[] smallAns = findSubsequence(str.substring(1));
        String[] ans = new String[2 * smallAns.length];

        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }
        for (int i = 0; i < smallAns.length; i++) {
//         k=   ans[i+ smallAns.length]
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }
}