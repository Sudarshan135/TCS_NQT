//14 September 2024
//Sum Of Digits of A Num
package numbers.sept14;
import numbers.Num;

public class Numbers_28 {
    public static void main(String[] args) {
        Numbers_28 n28=new Numbers_28();
        int num= Num.enterNumber();
        int ans= n28.sumOfDigits(num);
        System.out.println("Sum of digits is : "+ans);

    }
    int sumOfDigits(int num){
        int sum=0;
        while (num!=0){
           int last=num%10;
           sum+=last;
           num/=10;
        }
        return sum;
    }
}