//12 September 2024
/*A number is called an Automorphic number
if and only if its square ends in the same digits as the number itself.*/
package numbers.sept12;
import numbers.Num;

public class Numbers_23 {
    public static void main(String[] args) {
        int num = Num.enterNumber();
        boolean result = isAutomorphic(num);
        if (result) {
            System.out.println( "Automorphic Num ");
        }  else {
            System.out.println( "Not Automorphic Num ");
        }
        System.out.println("_______________");
        automorphic(num);
    }

    static boolean isAutomorphic(int num) {
        int square = num * num;
        while (num > 0) {
            System.out.println(num + "   " + square);
            if (num % 10 != square % 10) {
                return false;
            }
            num /= 10;
            square /= 10;
        }

        return true;
    }

    static void automorphic(int num) {
        int d = count(num);
        int mod = 1;
        for (int i = 0; i < d; i++) {
            mod *= 10;
            System.out.println(mod + "   " + d);
        }

        int sq = num * num;
        if (num % mod == sq % mod) {
            System.out.println("Automorphic Num ");
        } else {
            System.out.println("Not Automorphic number ");
        }

    }

    static int count(int num) {
        int c = 0;
        while (num > 0) {
            c++;
            num /= 10;
        }
        return c;
    }

}