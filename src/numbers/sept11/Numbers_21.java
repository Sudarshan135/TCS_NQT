//11 September 2024
//Print all Prime Factors of the given number
package numbers.sept11;
import numbers.Num;

public class Numbers_21 {
    public static void main(String[] args) {
        Numbers_21 n21 = new Numbers_21();
        int num = Num.enterNumber();
        n21.factors(num);
        System.out.println();
        printPrime(num);
    }

    static void printPrime(int num) {
        //divide the number by only prime numbers
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + "  ");
            }
            while (num % i == 0) {
                num /= i;
//               System.out.println(num);
            }
        }
//     if number is itself prime factor
        if (num != 1) {
            System.out.println(num);
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    void factors(int num) {

        int j = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
                if (num / i != i) {
                    if (isPrime(num / i)) {
                        System.out.println(num / i);
                    }
                }
            }

        }

    }

}