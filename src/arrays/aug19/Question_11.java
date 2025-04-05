// 19 August 2024
// removing duplicate elements from sorted array
package arrays.aug19;
import arrays.Array;
public class Question_11 extends Array {
    public static void main(String[] args) {
        Question_11 q11=new Question_11();

        int [] arr=q11.createArray();
        q11.display(arr);

        int result=  q11.deleteDuplicate(arr);
        System.out.println(result);
        q11.display(arr);

//     for (int i=0;i<result;i++){
//         System.out.print(arr[i]+" | ");
//     }
    }
     int deleteDuplicate(int []arr){

        int n= arr.length;
        int count=0;
        for (int j=1;j<n;j++){
               if (arr[count]!=arr[j]){
                  arr[count+1]=arr[j];
                   count++;
               }
        }

       return count+1;
     }



}