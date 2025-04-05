//08 September 2024
//Reverse digits of a number

package numbers.sept08;

import numbers.Num;

public class Numbers_15 extends Num {
    public static void main(String[] args) {
        int num = Num.enterNumber();
        System.out.println(reverseNumber(num));
    }

    static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;
        }
        return rev;
    }

    void reverse(int num) {
        int d = countDigit(num);
        int newNum = 0;
        for (int i = 1; i <= d; i++) {
            int last = num % 10;
            newNum += last * powerOf(10, d - i);
//            System.out.println(newNum);
            num = num / 10;
        }
        System.out.println(newNum);
    }

    int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    int powerOf(int num, int pow) {
        int power = 1;
        for (int i = 0; i < pow; i++) {
            power *= num;
        }
        return power;
    }

}