//24 August 2024
//Find all the non-repeating elements in an array
package arrays.aug24;
import arrays.Array;
public class Question_16 extends Array {
    public static void main(String[] args) {
        Question_16 q16=new Question_16();
            int [] arr= q16.createArray();
              q16.find_NonRepeated(arr);
    }

    void find_NonRepeated(int [] arr){

         for (int i=0;i<arr.length;i++){
             int temp=arr[i];
             int count=0;
             for (int j=0;j<arr.length;j++){
                 if (arr[j]==temp){
                    count++;
                 }
             }
             if (count==1){
                 System.out.println(arr[i]);
             }
         }


    }
}