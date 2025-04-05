//14 September 2024
//If the sum of digits is divisible by the number then it is called Harshad number.
package numbers.sept14;

public class Numbers_26 {
    public static void main(String[] args) {
        int num = 378;
          boolean ans=isHarshadNumber(num);
        System.out.println("is Harshad Num : "+ans);
    }
   static boolean isHarshadNumber(int num){
        int orignal=num;
        int sum = 0;
        while(num!=0){
            sum=sum+num%10;
            num/=10;
        }
        System.out.println(sum);
        return  orignal%sum==0;
    }
}