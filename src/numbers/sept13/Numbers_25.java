//  13 September 2024
//Find LCM of two numbers
//int lcm = n1 * n2 / gcd;
package numbers.sept13;
import numbers.Num;
import static java.lang.Math.min;

public class Numbers_25 {
    public static void main(String[] args) {
        int n1 = Num.enterNumber();
        int n2 = Num.enterNumber();

        int lcm = lcm(n1, n2);
        System.out.println("LCM " + lcm);
    }

    static int lcm(int n1, int n2) {
        int gcd = gcd(n1, n2);
        int lcm = n1 * n2 / gcd;
        return lcm;
    }

    static int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = min(n1, n2); i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                System.out.println("GCD " + gcd);
                break;
            }
        }
        return gcd;
    }
}