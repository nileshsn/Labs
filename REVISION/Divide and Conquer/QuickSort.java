import java.util.*;

class Sort {
    void Sort(int[] a, int low, int high) {
        if (low <= high) {
            int i = low+1;
            int j = high;
            int pivot = low;

            while (i < j) {
                while (i <= high && a[i] <= a[pivot]) {
                    i++;
                }
                while (a[j] > a[pivot]) {
                    j--;
                }
                if (i < j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else {
                    int temp = a[j];
                    a[j] = a[pivot];
                    a[pivot] = temp;
                }
                Sort(a, low, j - 1);
                Sort(a, j + 1, high);
            }
        }
    }
}
public class QuickSort{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] a = new int[n];
        Sort s = new Sort();

        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        s.Sort(a, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        in.close();
    }
}
