import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Sorted array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.print("Enter the key: ");
        int k = sc.nextInt();
        
        int low = 0, high = n - 1, mid;
        boolean found = false;
        
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == k) {
                System.out.println("Item is found at index " + mid);
                found = true;
                break;
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("Item not found");
        }
        
        sc.close();
    }
}
