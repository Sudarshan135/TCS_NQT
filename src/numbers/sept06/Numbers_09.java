//06 September 2024
//Sum of first N Natural Numbers
package numbers.sept06;

import numbers.Num;

public class Numbers_09 extends Num {
    public static void main(String[] args) {

        int start= Num.enterNumber();
        int end= Num.enterNumber();
        for (int i=start;i<=end;i++){
            int result=sumOf(i);
            System.out.println(i+"   "+result);
        }
    }

   static int sumOf(int num){
        int sum=0;
        for (int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
}