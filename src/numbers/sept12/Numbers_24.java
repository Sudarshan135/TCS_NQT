//12 September 2024
//Given two integers N1 and N2, find their greatest common divisor
package numbers.sept12;
import numbers.Num;

import static java.lang.Math.min;

public class Numbers_24 {
    public static void main(String[] args) {
        int n1 = Num.enterNumber();
        int n2 = Num.enterNumber();

//        int gcd = new Numbers_24().gcd3(n1, n2);
//        System.out.println("greatest common divisor : " + gcd);
//
        int gcd2 = new Numbers_24().equilateralAlgorithm(n1, n2);
        System.out.println("greatest common divisor : " + gcd2);

        int gcd3 = new Numbers_24().primeFactorization(n1, n2);
        System.out.println("greatest common divisor : " + gcd3);

    }

    boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num < 2 || num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    int primeFactorization(int a, int b) {
        int gcd = 1;
        int div = 2;
        while (div <= min(a, b)) {
            if (isPrime(div)) {
                while (a % div == 0 && b % div == 0) {
                    a /= div;
                    b /= div;
                    gcd = gcd * div;
                    System.out.println(gcd);
                }
            }
            div++;
        }
        return gcd;
    }

    int equilateralAlgorithm(int a, int b) {
//        gcd(a,b)=gcd(a%b,b)
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }

    }

    int gcd(int n1, int n2) {
        int gcf = 1;
        int min = min(n1, n2);
        for (int i = 2; i*i <= min; i++) {
//            System.out.println(i);
            if (n1 % i == 0 && n2 % i == 0) {
                gcf = i;
            }
        }
        return gcf;
    }

    int gcd3(int n1, int n2) {
        int gcf = 1;
        int min = min(n1, n2);
//        as we have to find greatest we will start form min
        for (int i = min; i > 1; i--) {
//            System.out.println(i);
            if (n1 % i == 0 && n2 % i == 0) {
                gcf = i;
                break;
            }
        }
        return gcf;
    }

    int gcd2(int n1, int n2) {
        while (n1 % n2 != 0) {
            int r = n1 % n2;
            System.out.println("r " + r + " n1 " + n1 + " n2 " + n2);
            n1 = n2;
            n2 = r;
            System.out.println(" n1 " + n1 + " n2 " + n2);
        }
        return n2;
    }
}