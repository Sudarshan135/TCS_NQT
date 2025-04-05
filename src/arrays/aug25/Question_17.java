//25 August 2024
//Maximum Product Subarray in an Array
package arrays.aug25;
import arrays.Array;
public class Question_17 extends Array{
    public static void main(String[] args) {
        Question_17 q17=new Question_17();
        int[] arr = q17.createArray();


     int [] result=  maxProduct(arr);
     int maxProduct=result[0];
     for (int i:result){
         if(i>maxProduct){
             maxProduct=i;
         }
     }
        System.out.println("Max Product of Array is : "+maxProduct);
    }

    static int [] maxProduct(int[] a) {
        int n = a.length;
        int end;
        int[]  subarray=new int[n];

        for (int i = 0; i < n; i++) {
            end = i + 1;
            int prod = a[0];
            for (int j = 0; j < end; j++) {
                prod = prod * a[j];
                subarray[j] = prod;

//                System.out.print(a[j] + " , ");
//                System.out.print(subarray[j]+" ");
            }

            System.out.println("product " + prod);
        }
        return subarray;
    }
}