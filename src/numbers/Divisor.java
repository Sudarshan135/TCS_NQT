package numbers;

public class Divisor {
    public static void main(String[] args) {
        Divisor d=new Divisor();
        int num = 10;
      int result=  d.sumOfDivisors1(num);
        System.out.println("Result : "+result);

        d.divisor(num);
        System.out.println("sum of all "+sumOfAllDivisors(num));
    }

    public int sumOfDivisors1(int n) {
//        sum_div(1)+sum_div(2)+sum_div(3)+.....sum_div(n)

        int sum = 0;
      for (int i=1;i<=n;i++){
          for (int j = 1; j <= i; j++) {
              if (i % j == 0) {
                  sum += j;
//                  System.out.println("Sum " + sum);
              }
          }
      }
        return sum;
    }

    void divisor(int num) {
        for (int i = 1;  i*i <= num; i++) {
            if (num % i == 0) {
                    System.out.println(i+" * "+num/i);
                if (num/i!=i){
                    System.out.println(num/i+" * "+i);
                }
            }

        }
    }

    public static int sumOfAllDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += ( n / i ) * i;
        }
        return sum;
    }

}
