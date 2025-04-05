// 04 October 2024

package sorting.oct04;

public class Merge_Sort {
    static int n;

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 0, 7, 9, 6, 7};
        n = arr.length;
        System.out.println(n);
        int l = 0;
        int h = arr.length - 1;

        merge_Sort(arr, l, h);
    }

    static void merge_Sort(int[] arr, int l, int h) {
        if (l >= h) return;
        int mid = ( l + h ) / 2;
        merge_Sort(arr, l, mid);
        merge_Sort(arr, mid + 1, h);
        merge(arr, l, mid, h);
    }

    static int i;

    static void merge(int[] arr, int l, int mid, int h) {
        int[] temp = new int[h - l + 1];
        i = 0;
        int left = l;
        int right = mid + 1;

        while (left <= mid && right <= h) {
            if (arr[left] <= arr[right]) {
                temp[i] = arr[left];
                i++;
                left++;
            } else {
                temp[i] = arr[right];
                i++;
                right++;
            }
        }
        while (left <= mid) {
            temp[i] = arr[left];
            i++;
            left++;
        }
        while (right <= h) {
            temp[i] = arr[right];
            i++;
            right++;
        }
        for (i = 0; i < temp.length; i++) {
            arr[l + i] = temp[i];  // Copying from temp back to arr
        }
        System.out.println();
        for (int r : temp) {
            System.out.print(r + "   ");
        }

    }
}
