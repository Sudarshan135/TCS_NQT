// 09 September 2024
//Print Fibonacci Series up to Nth term
package numbers.sept09;
import numbers.Num;

public class Numbers_17 {
    public static void main(String[] args) {
        int num = Num.enterNumber();
//         fibbonaci(num);
      for (int i=0;i<num;i++){
          System.out.println(fibonacci(i));
      }
    }

    static void fib(int num) {
        int p = 0;
        int c = 1;
        for (int i = 0; i <= num; i++) {
            System.out.println(p);
            int n = p + c;
            p = c;
            c = n;

        }
    }

    static int fibonacci(int N){

        // Base Condition.
        if(N <= 1){
            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);

        return last + slast;


    }
}