//  08 September 2024
//Greatest of three numbers

package numbers.sept08;

import numbers.Num;

public class Numbers_13 extends Num {
    public static void main(String[] args) {
        Numbers_13 n13 = new Numbers_13();

        int a = Num.enterNumber();
        int b = Num.enterNumber();
        int c = Num.enterNumber();

        int max = ( a > b ) ? ( ( a > c ) ? a : c ) : ( ( b > c ) ? b : c );
        System.out.println("MAX = " + max);

        int max2 = n13.gretest(a, b, c);
        System.out.println("MAX = " + max2);

        int greatest = n13.gretest(a, b, c);
        System.out.println("MAX = " + greatest);

    }

    int gretest(int a, int b, int c) {

        if (a > b) {
            if (a > c) {
                return a;
            }
            return c;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    int gretestOfThree(int a, int b, int c) {

        if (a > b && a > c){
            return a;
        }  else if(b>c && c>a ){
            return b;
        } else {
            return c ;
        }

    }
}