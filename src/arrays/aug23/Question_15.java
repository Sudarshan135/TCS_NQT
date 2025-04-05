
//23 August 2024
//searching duplicates in array
package arrays.aug23;
import arrays.Array;
public class Question_15 extends Array{
    public static void main(String[] args) {
        Question_15 q15=new Question_15();
        int[] arr = q15.createArray();


        new Question_15().findDuplicate(arr);

    }


    void findDuplicate(int[] arr){
        int n = arr.length;
        int[] dup = new int[n];
        int current = 0;
        for (int i = 0; i < n-1; i++) {

            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]){
                    dup[current++]=arr[i];
                }
            }
        }
        for (int i=0;i<current;i++){
            System.out.println(dup[i]);
        }
    }
    int[] findDuplicate1(int[] arr) {
        int n = arr.length;
        int[] newarray = new int[n];

        for (int i = 0; i < n; i++) {
            int current = arr[i];

            for (int j = 0; j < n; j++) {
                if (current == arr[j] && j != i) {
                    if (newarray[j] != current) {
                        newarray[i] = current;
                        System.out.println("insert "+newarray[i]);
                    }
                }

            }
        }
        for (int i : newarray) {
            System.out.println(i);
        }
        return newarray;
    }
}