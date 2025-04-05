
//14 August 2024
//count the frequency of element
package arrays.aug14;
import arrays.Array;
public class Question_05 extends Array {

    public static void main(String[] args) {
        Question_05 q05 = new Question_05();

        int[] arr = q05.createArray();
        q05.display(arr);

        q05.getOccurrence(arr);

    }

    void getOccurrence(int[] arr) {
        boolean[] visit = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int occ = 0;
            if (visit[i]) {
                continue;
            }
            for (int j = i; j < arr.length; j++) {
                if (num == arr[j]) {
                    visit[j] = true;
                    occ++;
                }
            }
            System.out.println(arr[i] + " occured " + occ + "  times");
        }

    }
}