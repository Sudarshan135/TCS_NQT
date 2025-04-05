// 19 September 2024
 //octal to binary
package number_system.sept19;

public class Octal_To_Binary_01 {
    public static void main(String[] args) {
        int octal = 170;

        int decimal = Octal_To_Decimal_02.octal_To_decimal(octal);
        int binary = octal_To_Binary(decimal);

        System.out.println("Octal   Num : " + octal);
        System.out.println("Decimal Num : " + decimal);
        System.out.println("Binary  Num : " + binary);

    }

    private static int octal_To_Binary(int decimal) {
        int base = 1;
        int binary = 0;
        while (decimal != 0) {
            int r = decimal % 2;
//            System.out.println(binary + " +  " + base + "  * " + r);
            binary = binary + base * r;
            decimal /= 2;
            base *= 10;
        }
        return binary;
    }

}