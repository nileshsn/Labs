import java.util.*;
import java.math.*;
import java.io.*;

class chain {
    int n;
    int a[];

    public chain(int n) {
        this.n = n;
        a = new int[n + 1];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
        }
    }

    int mcm(int i, int j) {
        if (i == j)
            return 0;
        int min = Integer.MAX_VALUE;
        int val = 0;
        for (int k = i; k < j; k++) {
            val = mcm(i, k) + mcm(k + 1, j) + a[i - 1] * a[j] * a[k];
            if (val < min) {
                min = val;
            }

        }
        return min;
    }
}

public class mcmrecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chain c = new chain(n);
        System.out.println(c.mcm(1, n));
    }
}