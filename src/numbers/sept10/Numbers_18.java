//10 September 2024
//Factorial of a Num : Iterative and Recursive
package numbers.sept10;
import numbers.Num;

public class Numbers_18 {
    public static void main(String[] args) {
        int num = Num.enterNumber();

        double fact = factorial(num);
        System.out.println("Factorial is : " + fact);

        iterativeFactorial(num);

    }

    static void iterativeFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    static double factorial(int num) {

        if (num == 0) {
            return 1;
        }
        double fact = num * factorial(num - 1);
        return fact;
    }
}