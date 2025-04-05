//02 September 2024
//Find all Palindrome Numbers in a given range
package numbers.sept02;

import numbers.Num;

public class Numbers_02  {
    public static void main(String[] args) {
        Numbers_02 n02=new Numbers_02();
        int start= Num.enterNumber();
        int end = Num.enterNumber();

        n02.printPalindrome(start,end);
    }

   private boolean isPalindrome(int start){
        int num=start;
        int pali=0;
        while (start>0){
                int lastDigit=start%10;
                pali=pali*10 +lastDigit;
                start/=10;
            }
        return pali== num;
    }
    private void printPalindrome(int min ,int max){
        while (min<=max){
           if (isPalindrome(min)){
               System.out.print(min+"  ");
           }
            min++;
        }
    }

}