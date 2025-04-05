// 20 September 2024
//Convert digits/numbers to words

package number_system.sept20;

import java.util.Scanner;

public class Digits_Numbers_To_Words {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter  4 digit Num ");
        int num = in.nextInt();
        convertNumToWord(num);
        in.close();
    }

    private static void convertNumToWord(int num) {
        int orignal=num;
        int u=num%10;
        num/=10;
//        System.out.println(u+"  "+num);
        int t= num % 10;
        num /= 10;
//        System.out.println(t + "  " + num);
        int h = num % 10;
        num /= 10;
//        System.out.println(h + "  " + num);
        int th = num % 10;
        num /= 10;
//        System.out.println(th + "  " + num);

        String []single_digit = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};
        String []multiple = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy"
                , "Eighty", "Ninety"};
        String hd="Hundred";
        String thd="Thousand";

        if (orignal<20){
            System.out.println(orignal+" : "+single_digit[orignal]);
        }else if (orignal>=20 && orignal<=99){
            System.out.println(orignal+" : "+multiple[t]+" "+single_digit[u]);
        }else if (orignal>=100 && orignal<=999){
            System.out.println(orignal+" : "+single_digit[h]+" "+hd+" "+multiple[t]+" "+single_digit[u]);
        } else if (orignal>=1000&& orignal<=9999) {
            System.out.println(orignal+" : "+single_digit[th]+" "+thd+" "+single_digit[h]+" "+hd+" "+multiple[t]+
                    " "+single_digit[u]);
        }



    }
}