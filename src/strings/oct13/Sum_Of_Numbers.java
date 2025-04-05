// 13 October 2024
package strings.oct13;

public class Sum_Of_Numbers {
    public static void main(String[] args) {
        String str = "1xyz23";
        int sum= sumOfNumbers(str);
        System.out.println("Sum_Of_Numbers  : "+sum);

        System.out.println("________________________");
      String result=  sumNumber(str);
        System.out.println("Sum_Of_Numbers  : "+result);

    }

    static String sumNumber(String string) {
        String sum = "";
        int n = string.length();
        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
            if (c >= '0' && c <= '9') {
                sum = sum + c;
                System.out.println(sum + "   " + c);
            }
        }
        return sum;
    }

    static int sumOfNumbers(String string) {
        int n = string.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
            if (c >= '0' && c <= '9') {
                sum = sum * 10 + ( c - '0' );
                System.out.println(sum+"   "+c);
            }
        }
        return sum;
    }

}