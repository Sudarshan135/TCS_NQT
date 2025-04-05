// 19 September 2024
//octal to decimal
package number_system.sept19;

public class Octal_To_Decimal_02 {
    public static void main(String[] args) {
        int octal = 345;

        int decimal = octal_To_decimal(octal);
        System.out.println("Octal   Num : " + octal);
        System.out.println("Decimal Num : " + decimal);
    }

   static int octal_To_decimal(int num) {
        int base = 1;
        int decimal = 0;
        while (num != 0) {
            int last = num % 10;
//            System.out.println(decimal+" + "+last+" * "+base);
            decimal = decimal + last * base;
            num /= 10;
            base *= 8;
        }
        return decimal;
    }

}