// 13 August 2024
// Find Second Smallest and SecondLargest Element in an array
package arrays.aug13;
import arrays.Array;
public class Question_03 extends Array{


    public static void main(String[] args) {
        Question_03 q03=new Question_03();
        int [] arr=q03.createArray();
        q03.display(arr);

     int[] result = q03.findSmallestLargest(arr);
        q03.display(result);

        q03.findSmallestElements(arr);
        q03.findLargestElements(arr);
    }

    int[] findSmallestLargest(int[] arr) {
        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;
       int  smallest = arr[0];
       int sSmallest = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > largest) {
                sLargest = largest;
                largest = i;
            } else if (i > sLargest && i != largest) {
                sLargest = i;
            }

            if (i< smallest) {
                sSmallest=smallest;
                smallest = i;
            } else if (i < sSmallest && i != smallest) {
                sSmallest = i;
            }
        }

        return new int[] {smallest,sSmallest,largest,sLargest};
//        System.out.println(largest);
//        System.out.println(sLargest);
//        System.out.println(smallest);
//        System.out.println(sSmallest);
    }

  void findLargestElements(int[] arr) {
        int largest = arr[0];
       int sLargest = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int j : arr) {
            if (j > sLargest && j != largest) {
                sLargest = j;
            }
        }
        System.out.println("largest " + largest);
        System.out.println("Second largest " + sLargest);

    }

   void findSmallestElements(int[] arr) {
       int  smallest = arr[0];
       int sSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sSmallest=smallest;
                smallest = arr[i];
            }
        }
        for (int j : arr) {
            if (j < sSmallest && j != smallest) {
                sSmallest = j;
            }
        }
        System.out.println("Smallest " + smallest);
        System.out.println("second Smallest " + sSmallest);
    }

}