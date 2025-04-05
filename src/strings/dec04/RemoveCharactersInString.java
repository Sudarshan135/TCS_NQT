// 04 December 2024
package strings.dec04;

public class RemoveCharactersInString {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cefz";

        StringBuffer newstr=new StringBuffer();

        for (int i = 0; i < str1.length(); i++) {
            boolean visit=false;
            char c = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                char d = str2.charAt(j);
                if (c == d) {
                  visit=true;
                }
            }

            if (!visit){
                newstr.append(c);
            }

        }
        System.out.println(newstr);
    }
}