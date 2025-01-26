//Memorization. 

import java.util.*;
class MinSub {
    int n, w;
    int wt[];
    int a[][];
    public MinSub(int n, int w) {
        this.n = n;
        this.w = w;
        a = new int[n + 1][2*w + 1];
        for (int i=0; i<=n; i++) {
            for (int j=0; j<=2*w; j++) {
                a[i][j] = -1;
            }
        }
    }
    int minSub(int wt[], int n, int tSum) { 
        if (n == 0) {
            return Math.abs(tSum);
        }
        if (a[n][tSum + w] != -1) { 
            return a[n][tSum + w];
        }
        return a[n][tSum + w] = Math.min(minSub(wt, n - 1, tSum + wt[n - 1]), minSub(wt, n - 1, tSum - wt[n - 1]));
    }
}

public class Mindiff1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        System.out.println("Enter wt values: ");
        int wt[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            wt[i] = in.nextInt();
            sum += wt[i];
        }
        MinSub m = new MinSub(n, sum);
        int min = m.minSub(wt, n, 0);
        System.out.println("Minimum subset difference is: " + min);
    }
}
