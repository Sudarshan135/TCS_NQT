//05 September 2024
//Check whether a number is Perfect Num or not
package numbers.sept05;
import numbers.Num;

public class Numbers_06 {
    public static void main(String[] args) {
        int num = Num.enterNumber();
        System.out.println("Is Perfect Num : "+isPerfect(num));
        System.out.println();

        System.out.println("Is Perfect Num : "+checkPerfect(num));
    }

    static boolean isPerfect(int num) {
        int sum = 0;  //as one is divisor of any number
        if (num==1){
            return false;
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
//                System.out.println(i + "   " + sum);
            }
        }
        return sum == num;
    }

    static  boolean checkPerfect(int num){
        int sum=1;
        if (num==1){
            return false;
        }
        for (int i=2;i*i<=num;i++){

            if (num%i==0) {
                sum=sum+i;
//                System.out.println(i+"   "+sum);
                if (num/i!=i){
                    sum=sum+(num/i);
//                    System.out.println(num/i+"   "+sum);
                }
            }
        }
      return sum==num;
    }
}