//14 September 2024
//If the sum of divisors of a number is greater than the number then it is called abundant number.
package numbers.sept14;
import numbers.Num;
public class Numbers_27 {
    public static void main(String[] args) {
        Numbers_27 n27 = new Numbers_27();
        int num = Num.enterNumber();

        boolean ans = n27.divisors(num);
        System.out.println("is abundant number : " + ans);

        boolean ans2 = n27.abundantNumber(num);
        System.out.println("is abundant number : " + ans2);
    }

    boolean divisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println("SUM  : "+sum);
        return sum > num;
    }

    boolean abundantNumber(int num) {
        int sum = 0;
        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                if (num / i != i ) {
                    sum=sum+i+num/i;
//                    System.out.println(i+" X  "+num/i);
                }
            }
        }
        sum-=num;
        System.out.println("SUM  : "+sum);
        return sum > num;
    }

}