import java.util.*;

class Number {
    int[] a;
    int[] b;
    int n;

    public Number(int n) {
        this.n = n;
        a = new int[n];
        b = new int[n];
    }

    void fill(int n, int k) {
        if (k == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(k, b[i])) {
                a[k] = b[i];
                fill(n, k + 1);
            }
        }
    }

    boolean isSafe(int k, int i) {
        for (int j = 0; j < k; j++) {
            if (a[j] == i) {
                return false;
            }
        }
        return true;
    }
}

public class Btnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        Number num = new Number(n);

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            num.b[i] = sc.nextInt();
        }

        num.fill(n, 0);
        sc.close();
    }
}
