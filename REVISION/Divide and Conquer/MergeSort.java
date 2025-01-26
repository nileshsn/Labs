import java.util.*;

class Sort {
    void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    void merge(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int[] b = new int[a.length];
        int k = low;

        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }
        while (i <= mid) {
            b[k++] = a[i++];
        }
        while (j <= high) {
            b[k++] = a[j++];
        }
        for (k = low; k <= high; k++) {
            a[k] = b[k];
        }
    }
}
public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] a = new int[n];
        Sort s = new Sort();

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        s.mergeSort(a, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        in.close();
    }
}
