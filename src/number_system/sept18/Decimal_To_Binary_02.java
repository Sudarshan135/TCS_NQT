// 18 September 2024
//Convert Decimal_To_Binary

package number_system.sept18;

public class Decimal_To_Binary_02 {
    public static void main(String[] args) {

        int decimal = 125;
        int binary = decimal_to_Binary(decimal);

        System.out.println("Decimal Num : " + decimal);
        System.out.println("Binary  Num : " + binary);
//        System.out.println(n);
    }

    private static int decimal_to_Binary(int n) {
        int base = 1;
        int binary = 0;
        while (n != 0) {
            int r = n % 2;
            n /= 2;
            binary = binary + base * r;
//            System.out.println(binary + " =  " + base + "  * " + r);
            base *= 10;
        }
//        System.out.println( "Binary Num   "+binary);
        return binary;
    }
}