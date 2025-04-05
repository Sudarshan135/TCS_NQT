//26 August 2024
//Find all Symmetric Pairs in the array of pairs
package arrays.aug26;

public class Question_18 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {

            for (int col = row + 1; col < arr.length; col++) {
                if (arr[col][0] == arr[row][1] && arr[col][1] == arr[row][0]) {
                    System.out.print(arr[row][0] + "  " + arr[row][1]+"\n");
                    break;
                }
            }
        }
    }
}