// 16 September 2024
//Express given number as Sum of Two Prime Numbers
package numbers.sept16;

public class Numbers_32 {
    public static void main(String[] args) {
        printPrime(4);
    }

    private static void printPrime(int num) {
        if (num <=4) {
            System.out.println("No prime pairs exist for numbers less than 4.");
            return;
        }
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                int n1 = i;
                for (int j = i+1; j <= num; j++) {
                    if ( isPrime(j)) {
                        int n2 = j;
                        if (n1 + n2 == num) {
                            System.out.println("n1+n2 : " + ( n1 + n2 )+" ("+i+" "+j+" )");
                        }
                    }
                }
//                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;//prime
        } else if (num < 2 || num % 2 == 0) {
//            checks whether number is even if num is even then it is not prime
            return false;//not prime
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
//              checks whether number is divisible by any odd number then it is not prime
                return false;
            }
        }
        return true;
    }

}