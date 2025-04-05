package numbers;
import java.util.Scanner;

abstract public class Num {
   public static int enterNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Num : ");
        return sc.nextInt();
    }
    static int count(int num) {
        int c = 0;
        if (num < 2) {
            return num;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                c++;
                if (num / i != 0) {
                    c++;
                }
            }
        }
//        System.out.println(num + "        " + c);
        return c;
    }
    static int square(int num){
        return num*num;
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
}