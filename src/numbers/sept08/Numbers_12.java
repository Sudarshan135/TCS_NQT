//08 September 2024
package numbers.sept08;
import numbers.Num;
public class Numbers_12 extends Num {
    public static void main(String[] args) {
      Numbers_12 n12= new Numbers_12();
      int a= Num.enterNumber();
      int b= Num.enterNumber();

      int max=(a>b)?a:b;
        System.out.println("MAX = "+max);

     int r= n12.greatest(a,b);
        System.out.println("Greatest : "+r);
    }
    int greatest(int a,int b){
        if (a>b){
            return a;
        }
        return b;
    }
}