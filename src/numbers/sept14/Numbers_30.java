//14 September 2024
//Find permutations in which n people can occupy r seats in a classroom.
package numbers.sept14;
import numbers.Num;

public class Numbers_30 {
    public static void main(String[] args) {
        Numbers_30 n30=new Numbers_30();

     int n = Num.enterNumber();
     int r= Num.enterNumber();
    int ans= n30.permitation(n,r);
        System.out.println("Permutations in which n people can occupy r seats : "+ans);
    }
    int permitation(int n,int r){
        int fact=1;
        for(int i=n;i>n-r;i--){
            System.out.println(i+"  "+(n-r));
            fact=fact*i;
        }

        return  fact;
    }
}