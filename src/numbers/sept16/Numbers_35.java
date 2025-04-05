// 16 September 2024
//Adding Two fractions
package numbers.sept16;

public class Numbers_35 {
    public static void main(String[] args) {
        int n1 = 5;
        int d1 = 3;
        int n2 = 4;
        int d2 = 3;

        int lcm = lowestCommonMultiple(d1, d2);
        System.out.println("LCM of " + n1 + " And " + n2 + " is : " + lcm);

        addingFraction(n1,n2,d1,d2,lcm);


    }
      private static void addingFraction(int n1,int n2,int d1,int d2,int lcm) {
        int f1=lcm/d1;
        int f2=lcm/d2;
        int sum=(f1*n1)+(f2*n2);
        if (sum%lcm==0){
            sum=sum/lcm;
            lcm/=lcm;
        }
          System.out.println(sum+" / "+lcm);
      }
    private static int lowestCommonMultiple(int n1, int n2) {
        int div = 2;
        int lcm = 1;
        while (n1 != 1 || n2 != 1) {
            if (isPrime(div)) {
                while (n1 % div == 0 || n2 % div == 0) {
                    if (n1 % div == 0) {
                        n1 /= div;
                    }
                    if (n2 % div == 0) {
                        n2 /= div;
                    }
                    lcm *= div;
//                    System.out.println("div " + div);
                }
            }
            div++;
        }
//        System.out.println(lcm);
        return lcm;
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;//prime
        }
        if (num < 2) {
            return false;//not prime
        }
        if (num % 2 == 0) {
//            checks whether number is even if num is even then it is not prime
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
//              checks whether number is divisible by any odd number then it is not prime
                return false;
            }
        }
        return true;
    }
}