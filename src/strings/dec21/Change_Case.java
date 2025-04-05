package strings.dec21;

public class Change_Case {
    public static void main(String[] args) {
        String s = "abcdABCD";
        StringBuffer ans =new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
//            System.out.println(c);
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + ' ');
                ans.append(c);
//                System.out.println(c);
            } else if (c >= 'a' && c <= 'z') {
                c = (char) (c - ' ');
                ans.append(c);
//                System.out.println(c);
            }
        }
        System.out.println(ans);
    }
}