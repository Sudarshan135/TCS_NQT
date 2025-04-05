//05 September 2024
//Check if a number is Armstrong Num or not
package numbers.sept05;
import numbers.Num;

public class Numbers_05 extends Num {
    public static void main(String[] args) {
        Numbers_05 n05 = new Numbers_05();

        int original = Num.enterNumber();

        int digitCount = n05.noOfDigits(original);

        boolean result = n05.isArmstrongNumber(original, digitCount);

        if (result){
            System.out.println("Armstrong Num ");
        } else {
            System.out.println("Not a Armstrong Num ");
        }

    }

    boolean isArmstrongNumber(int num, int digitCount) {
        int original = num;
        int sum = 0;
        for (int i = 1; i <= digitCount; i++) {
            int last = num % 10;
            int pow = this.powerOf(last, digitCount);
            sum = sum + pow;
            num = num / 10;
        }
        if (sum == original) {
            return true;
        }
        return false;
    }

    int powerOf(int num, int pow) {
        int pov = 1;
        for (int j = 0; j < pow; j++) {
            pov = pov * num;
        }
//        System.out.println("power of  " + num + " = " + pov);
        return pov;
    }

    int noOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

}