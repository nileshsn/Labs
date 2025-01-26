import java.util.*;

class Queens {
    int n;
    int[] a;

    public Queens(int n) {
        this.n = n;
        a = new int[n + 1];
    }

    void fill(int n, int k) {
        if (k > n) {
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (isSafe(k, i)) {
                a[k] = i;
                fill(n, k + 1);
            }
        }
    }

    boolean isSafe(int k, int i) {
        for (int j = 1; j < k; j++) {
            if (a[j] == i) {
                return false;
            }
            if (Math.abs(k - j) == Math.abs(i - a[j])) {
                return false;
            }
        }
        return true;
    }
}

public class NQueens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the board: ");
        int n = in.nextInt();
        Queens q = new Queens(n);
        q.fill(n, 1);
        in.close();
    }
}
