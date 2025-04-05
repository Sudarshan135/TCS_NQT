//12 September 2024
/*When the sum of factorial of individual digits of a number
is equal to the original number the number is called a strong number.*/

package numbers.sept12;

public class Numbers_22 {
    public static void main(String[] args) {
        int num = 26;
       boolean result= isStrongNumber(num);
       if (result){
           System.out.println("Strong Num ");
       } else {
           System.out.println("Not Strong Num ");
       }
    }

    static boolean isStrongNumber(int n) {
        int orignal = n;
        int sumOfFactorial = 0;
        while (n != 0) {
            int last = n % 10;
            sumOfFactorial += factorial(last);
//            System.out.println("last digit " + last + "  " + sumOfFactorial);
            n = n / 10;
        }
        if (orignal==sumOfFactorial) {
            return true;
        }
        return false;
    }

    static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}