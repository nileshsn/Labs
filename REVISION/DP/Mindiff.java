//Recursion. 

import java.util.*;
class MinSub {
    int minSub(int wt[], int n, int tSum) { 
        if (n == 0) {
            return Math.abs(tSum);
        }
        return Math.min(minSub(wt, n - 1, tSum + wt[n - 1]), minSub(wt, n - 1, tSum - wt[n - 1]));
    }
}

public class Mindiff {
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
        MinSub m = new MinSub();
        int min = m.minSub(wt, n, 0);
        System.out.println("Minimum subset difference is: " + min);
    }
}
