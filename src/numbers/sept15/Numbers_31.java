//15 September 2024
//Replace zero by one
package numbers.sept15;

public class Numbers_31 {
    public static void main(String[] args) {
        int num = 102003;
        int ans = replace2(num);
//    int ans1=reverse(ans);
        System.out.println("Num     : " + num);
        System.out.println("0 repalced : " + ans);
    }

    private static int replace2(int num) {
        if (num==0){
            return 1;
        }
        int ans = 0;
        int temp = 1;
        while (num > 0) {
            int d = num % 10;
            if (d ==0){
              d=1;
            }
            ans=d*temp+ans;
            num/=10;
            temp=temp*10;
//            System.out.println(num+"   "+temp+"  "+ans);
        }
       return ans;
    }

    private static int replace(int num) {
        int n = 0;
        while (num != 0) {
            int digit = num % 10;

            if (digit == 0) {
                digit = 1;
                n = n * 10 + digit;
            } else {
                n = n * 10 + digit;
            }
//            System.out.println(num+"   "+n);
            num /= 10;
        }
        n = reverse(n);
        return n;
    }

    private static int reverse(int n) {
        int r = 0;
        while (n !=0) {
            int last = n % 10;
            r = r * 10 + last;
            n /= 10;
        }
        return r;
    }
}