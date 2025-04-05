//06 September 2024
//Find Sum of AP Series
package numbers.sept06;

import numbers.Num;

public class Numbers_10 {
    public static void main(String[] args) {
        int a = Num.enterNumber();
        int d = Num.enterNumber();
        int n = Num.enterNumber();
        System.out.println(sumOfAP(a, d, n));
    }

    static int sumOfAP(int a, int d, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int next = a + i * d;
            sum += next;
//            System.out.println(i+ "   next  "+next);
        }
        return sum;
    }
}