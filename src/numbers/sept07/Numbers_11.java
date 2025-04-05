// 07 September 2024
//Program to find Sum of GP Series

package numbers.sept07;
import numbers.Num;
public class Numbers_11 extends Num {
    public static void main(String[] args) {
        Numbers_11 n11 = new Numbers_11();
        int a = Num.enterNumber();
        int r = Num.enterNumber();
        int n = Num.enterNumber();

        int sum = n11.sumOfGP(a, r, n);
        System.out.println("SUM " + sum);

        n11.sum(a,r,n);
    }

    int sumOfGP(int a, int r, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a;
            a = a * r;
            System.out.println(a +"    " + sum);
        }
        return sum;
    }

    void sum(int a,int r,int n){
        int sum=0;
        for (int i=0;i<n;i++){
            int next=a*this.powerOf(r,i);
             sum+=next;

        }
        System.out.println("Sum 2 = "+sum);
    }
    int powerOf(int num, int pow) {
        int pov = 1;
        for (int j = 0; j < pow; j++) {
            pov = pov * num;
        }
//        System.out.println("power of  " + num + " = " + pov);
        return pov;
    }
}