// 18 September 2024
// Binary to octal

package number_system.sept18;

public class Binary_To_Octal_01 {
    public static void main(String[] args) {
        int binary = 11111;//1100110;

        int decimal=b2_Decimal(binary);
        System.out.println();
        int octal=decimal_To_Octal(decimal);

        System.out.println("Binary  Num : "+binary);
        System.out.println("Decimal Num : "+decimal);
        System.out.println("Octal   Num : "+octal);
    }

    private static int b2_Decimal(int num) {
        int base = 1;
        int deci = 0;
        while (num != 0) {
            int last = num % 10;
            deci = deci + last * base;
            System.out.println(last+ " * " + base);

            num /= 10;
            base *= 2;
        }
        return deci;
    }
    static int decimal_To_Octal(int num){
        int octal=0;
        int base=1;
        while (num!=0){
            int r=num%8;
            octal=octal+r*base;
            System.out.println(r+" * "+base);
            num/=8;
            base*=10;
        }
//        System.out.println(octal);
        return octal;
    }

}