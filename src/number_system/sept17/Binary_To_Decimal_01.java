// 17 September 2024
//Convert Binary to Decimal

package number_system.sept17;

public class Binary_To_Decimal_01 {
    public static void main(String[] args) {
        int binary = 1111;
        System.out.println("Binary Num  : " + binary);

        int decimalNumber = binary_To_Decimal2(binary);
        System.out.println("Decimal Num : " + decimalNumber);

//        Striver.BinaryToDecimal(binary);
//        Striver.striver(binary);

    }
    private static int binary_To_Decimal2(int binary){
        int deci=0;
        int base=1;
        while (binary!=0) {
            int last=binary%10;
            deci=deci+last*base;
//            System.out.println(last+" * "+base);
            binary/=10;
            base*=2;
        }
        return deci;
    }

    private int binary_To_Decimal(int num) {
        int decimal = 0;
        int pow = 0;
        while (num != 0) {
            int last = num % 10;
            decimal = (int) (decimal + last * Math.pow(2, pow));
            pow++;
            num /= 10;
        }
        return decimal;
    }

    private static int power(int num, int p) {
        int pow = 1;
        for (int i = 0; i < p; i++) {
            pow *= num;
        }
//        System.out.println(pow);
        return pow;
    }
}

class Striver {
    static void BinaryToDecimal(int num) {
        int newNum = 0;
        int d = 0;
        while (num != 0) {
            d++;
            int last = num % 10;
            int p = 1;
            for (int i = 1; i < d; i++) {
                p = p * 2;
            }
            newNum = newNum + last * p;
            num /= 10;
        }
        System.out.println("Decimal Num : " + newNum);
    }
    static void striver(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        int newNum = 0;
        int base = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                newNum = newNum + base;
//                System.out.println("new Num "+newNum+"  base "+base);
            }
            base *= 2;
        }
        System.out.println("Decimal Num : " + newNum);
    }
}