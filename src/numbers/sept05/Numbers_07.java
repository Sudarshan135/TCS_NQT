// 05 September 2024
//Check whether a given number is even or odd
package numbers.sept05;
import numbers.Num;

public class Numbers_07 extends Num {
    public static void main(String[] args) {
        Numbers_07 n07 = new Numbers_07();

        int start = Num.enterNumber();
        int end = Num.enterNumber();
        new Numbers_07().printEvenOddNumber(start, end);

    }

    void checkEven(int num) {
        if (num % 2 == 0) {
            System.out.print(num);
        }
    }

    void checkOdd(int num) {
        if (num % 2 != 0) {
            System.out.print(num + "       ");
        }
    }

    void printEvenOddNumber(int start, int end) {
        System.out.print("Odd    Even");
        while (start <= end) {
            checkEven(start);
            System.out.println();
            checkOdd(start);
            start++;

        }
    }
}