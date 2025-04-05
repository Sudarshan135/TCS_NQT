//06 September 2024
//Check whether a number is positive or negative
package numbers.sept06;
import numbers.Num;

public class Numbers_08 {
    public static void main(String[] args) {
        int start= Num.enterNumber();
        int end = Num.enterNumber();
        for (int i = start; i <= end; i++) {
            new Numbers_08().checkSign(i);
        }
    }

    void checkSign(int num) {
        if (num < 0) {
            System.out.println(num + " Negative ");
        } else if (num > 0) {
            System.out.println(num + " Positive ");
        } else {
            System.out.println("Zero ");
        }
    }
}