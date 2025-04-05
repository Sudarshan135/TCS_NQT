//10 September 2024
//Calculate the Power of a Num
package numbers.sept10;
import numbers.Num;
public class Numbers_19 {
    public static void main(String[] args) {
        int num = Num.enterNumber();
        int pow = Num.enterNumber();

        double power = power2(num, pow);
        System.out.println(power);
    }

    static double power2(int num, int pow) {
        int temp = pow;
//        int ans = 1;
        double ans = 1;
        if (pow < 0) {
            pow *= -1;
        }
        if (num == 0 || num == 1) {
            return num;
        }
        while (pow > 0) {
            if (pow % 2 != 0) {
                ans = ans * num;
                pow = pow - 1;
            } else {
                pow = pow / 2;
                num = num * num;
            }
        }
        if (temp < 0) {
            ans = 1 / ans;
        }
        return ans;
    }

    public static long power(int N, int R) {
        long pow = 1;
        for (int i = 0; i < R; i++) {
            pow *= N;
        }
        return pow;
    }
}