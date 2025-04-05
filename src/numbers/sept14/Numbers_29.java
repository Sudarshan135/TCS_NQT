// 14 September 2024
//Find the sum of numbers in the given range.
package numbers.sept14;
import numbers.Num;

public class Numbers_29 {
    public static void main(String[] args) {
        Numbers_29 n29=new Numbers_29();

        int start= Num.enterNumber();
        int end= Num.enterNumber();
       int ans= n29.sumOfNumber(start,end);
        System.out.println("Sum of Numbers is : "+ans);

    }
    int sumOfNumber(int s,int e){
        int sum=0;
        for (int i=s;i<=e;i++){
            sum+=i;
//            System.out.println(sum);
        }
        return sum;
    }
}