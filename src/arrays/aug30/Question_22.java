//30 August 2024
//Check if Array is a subset of another array or not
package arrays.aug30;
import arrays.Array;
public class Question_22 extends Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 2};
        int[] arr2 = {11, 12, 13, 15, 16};

        boolean result = isSubset(arr1, arr2);
        if (result) {
            System.out.println( "arr1  is Subset of  arr2");
        } else {
            System.out.println("arr1 + \" is not  Subset of \" + arr2");

        }
    }

    static boolean isSubset(int arr1[], int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        if (m > n) {
            return false;
        }
        for (int k : arr1) {
            boolean found = false;
            for (int i : arr2) {
                if (k == i) {
                    System.out.println("found :" + k);
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}