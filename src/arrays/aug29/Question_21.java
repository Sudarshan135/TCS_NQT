//29 August 2024
//Finding equilibrium index of an array
package arrays.aug29;
import arrays.Array;
public class Question_21 extends Array {
    public static void main(String[] args) {
        Question_21 q21 = new Question_21();
        int[] arr = {2,3,-1,8,4};
        q21.better(arr);

    }
      void better(int [] arr){
        int n=arr.length;
        int []sum=new int[n];
        int s=0;
        for (int i=0;i<n;i++){
          s+=arr[i];
          sum[i]=s;

        }
         for (int i=1;i<n-1;i++){
             int r=0;
             int l=0;
             r=sum[i]-arr[i];
             l=sum[sum.length-1]-arr[i];
             System.out.println(r+"   "+l);
         }

      }
    void brute(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int right = 0;
            int left = 0;
            for (int j = 0; j < i; j++) {
                left += arr[j];
            }
            for (int k = i + 1; k < n; k++) {
                right += arr[k];
            }
            System.out.println(left + "  " + right);

            if (left == right) {
                System.out.println("Equilibrium index  : " + i);
            }
        }
    }
}