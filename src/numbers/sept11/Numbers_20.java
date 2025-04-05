//     11 September 2024
//Factors of a Given Num

package numbers.sept11;

public class Numbers_20 {
    public static void main(String[] args) {
        int num=36;
       factors(num);
    }
   static void factors(int num){
        for (int i=1;i*i<=num;i++){
            if (num%i==0){
                if (num/i!=i){
                    System.out.println(i+" * "+num/i);
                } else {
                    System.out.println(i+" * "+i);
                }
            }
        }
    }
}