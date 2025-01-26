//Tabulation. 

import java.util.*;
class MinSub {
    int n, w;
    int wt[];
    boolean a[][];
    public MinSub(int n, int w) {
        this.n = n;
        this.w = w;
        a = new boolean[n + 1][w + 1];
    }
    int minSub(int wt[], int n, int tSum) { 
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=w; j++) {
                if(i == 0){
                    a[i][j] = (j == 0);
                }else {
                    if (wt[i - 1] <= j) {
                        a[i][j] = a[i - 1][j] || a[i - 1][j - wt[i - 1]];
                    } else {
                        a[i][j] = a[i - 1][j];
                    }
                }
            }
        }
        int mins = Integer.MAX_VALUE;
        for (int j = 0; j <= w / 2; j++) {
            if (a[n][j]) {
                mins = Math.min(mins, tSum - 2 * j);
            }
        }
        return mins;
    }
}

public class Mindiff2 {
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
        int mins = m.minSub(wt, n, sum);
        System.out.println("Minimum subset difference is: " + mins);
    }
}
