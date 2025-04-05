// 18 September 2024
//Decimal to octal

package number_system.sept18;

public class Decimal_To_Octal_03 {
    public static void main(String[] args) {
        int decimal = 1356;
        int octal = decimal_To_Octal(decimal);

        System.out.println("Decimal Num : " + decimal);
        System.out.println("Octal Num   : " + octal);

    }

    static int decimal_To_Octal(int num) {
        int octal = 0;
        int base = 1;
        while (num != 0) {
            int r = num % 8;
            octal = octal + r * base;
            System.out.println(octal + "   " + r + "    " + base);
            num /= 8;
            base *= 10;
        }
//        System.out.println(octal);
        return octal;
    }
}