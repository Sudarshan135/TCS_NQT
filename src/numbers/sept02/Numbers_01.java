//02 September 2024
//Check if a number is Palindrome or Not
package numbers.sept02;

import numbers.Num;

public class Numbers_01  {
    public static void main(String[] args) {
        Numbers_01 q01=new Numbers_01();
        int num = Num.enterNumber();

         boolean isPalindrome= q01.isPalindrome(num);
        if (isPalindrome){
            System.out.println("Num is palindrome : ");
        } else {
            System.out.println("Not a palindrome ! ");
        }
    }
  private   boolean isPalindrome(int num){
        int pali = 0;
        int orignal=num;

        while (num > 0) {
            int last = num % 10;
            num = num / 10;
            pali= pali*10+last;
//            System.out.println(pali);
        }
       return pali==orignal;
    }
}