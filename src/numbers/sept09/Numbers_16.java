// 09 September 2024
//Maximum and Minimum digit in a number
package numbers.sept09;
import numbers.Num;
public class Numbers_16 {
    public static void main(String[] args) {
        int num = Num.enterNumber();

        int max = maxDigit(num);
        int min = minDigit(num);

        System.out.println("Min : " + min + "  Max : " + max);

        int[] minmax = digitMinMax(num);
        System.out.println("Min : " + minmax[0] + "  Max : " + minmax[1]);

    }

    static int[] digitMinMax(int num) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        while (num != 0) {
            int last = num % 10;
            if (last > max) {
                max = last;
//              System.out.println("last   "+last+ " Max = "+max);
            }
            if (last < min) {
                min = last;
            }
            num /= 10;
        }
        return new int[]{min, max};
    }

    static int maxDigit(int num) {
        int max = 0;
        while (num != 0) {
            int last = num % 10;
            if (last > max) {
                max = last;
//              System.out.println("last   "+last+ " Max = "+max);
            }
            num = num / 10;
        }
        return max;
    }

    static int minDigit(int num) {
        int min = Integer.MAX_VALUE;
        while (num != 0) {
            int last = num % 10;
            if (last < min) {
                min = last;
            }
            num /= 10;
        }

        return min;
    }
}