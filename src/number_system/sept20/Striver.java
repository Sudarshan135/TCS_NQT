// 20 September 2024

package number_system.sept20;

public class Striver {
    public static void interconverting(String str) {
        String[] single_digit = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine"};
        String[] two_digits = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "ninteen", "twelve"};
        String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy"
                , "eighty", "ninty"};
        String[] tens_power = new String[]{"hundred", "thousand"};

        if (str.length() == 0) {
            System.out.println("");
            return;
        } else if (str.length() == 1) {
            System.out.println((str.charAt(0)) +" : "+single_digit[str.charAt(0)-'0']);
            return;
        }

        int len = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (len > 2) {
                if (str.charAt(i) - '0' != 0) {
                    System.out.print(single_digit[str.charAt(i) - '0'] + " ");
                    System.out.print(tens_power[len - 3] + " ");
                }
                len--;
            } else {
                if (str.charAt(i) - '0' == 1) {
                    System.out.print(two_digits[str.charAt(i + 1) - '0'] + " ");
                    return;
                } else if (str.charAt(i) - '0' != 0) {
                    System.out.print(tens_multiple[str.charAt(i) - '0'] + " ");
                    if (str.charAt(i + 1) - '0' != 0)
                        System.out.print(single_digit[str.charAt(i + 1) - '0']);
                    return;
                }
            }
        }
    }

    public static void main(String args[]) {
        String str = "19";

        System.out.println("lenght "+str.length());
        interconverting(str);
    }
}