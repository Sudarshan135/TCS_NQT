// 16 September 2024
//Roots of Quadratic Equation
package numbers.sept16;

public class Numbers_34 {


    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        rootsOfEqn(a, b, c);
    }

    private static int rootsOfEqn(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        if (d == 0) {
            System.out.println("Roots are real and Equal : " + d);
        } else if (d > 0) {
            System.out.println("Roots are real and unique : " + d);
        } else {
            System.out.println("Imaginary roots " + d);
        }
        int discriminant = (int) Math.sqrt(d);
        int root1 = (int) ( ( -b + discriminant ) / ( 2 * a ) );
        int root2 = (int) ( ( -b - discriminant ) / ( 2 * a ) );

        System.out.println("Roots : "+root1 +", "+root2);
        return d;
    }
}