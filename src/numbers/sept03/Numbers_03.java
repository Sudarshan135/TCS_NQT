//03 September 2024
//prime number
package numbers.sept03;

import numbers.Num;

public class Numbers_03 {
    public static void main(String[] args) {
        Numbers_03 n03 = new Numbers_03();
        int num = Num.enterNumber();

        boolean result = isPrime(num);

        if (result) {
            System.out.println("PRIME");
        } else {
            System.out.println("NOT PRIME");
        }

        n03.checkPrime(num);

    }

    private static boolean isPrime(int num) {
        boolean prime = true;
        if (num < 2) {
            System.out.println(num);
            return false;
        }
        if (num == 2) {
            System.out.println(num);
            return true;
        }
        if (num % 2 == 0) {
            System.out.println(num);
            return false;
        }
        for (int i = 3; i * i < num; i += 2) {
            if (num % i == 0) {
                System.out.println(i);
                prime = false;
                break;
            }
        }
        return prime;
    }

    private static boolean isPrimeOptimal(int num) {
        boolean prime = true;

        if (num < 2) {
            prime = false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                prime = false;
                System.out.println(i);
                break;
            }
        }
        return prime;
    }

    private void checkPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime number ");
        } else {
            System.out.println("not a prime number ");
        }
    }

}