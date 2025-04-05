// 16 September 2024
//Area of Circle
package numbers.sept16;
import numbers.Num;

public class Numbers_33 {
    public static void main(String[] args) {
        int rad= Num.enterNumber();
        float ans=areaOfCircle(rad);
        System.out.println("Area of Circle : "+ans);
    }
    private static float areaOfCircle(int rad){
        return 3.14f*rad*rad;
    }
}