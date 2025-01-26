import java.util.Scanner;

class inner {
    int a[][], p[], v[], n;
    int val = 0;

    inner(int a[][], int n) {
        this.a = a;
        this.n = n;
        p = new int[n];
        v = new int[n];
        p[0] = -1;
        v[0] = 1;
        for (int i = 1; i < n; i++) {
            p[i] = i;
            v[i] = -1;
        }
        findMsp();
        System.out.println("Total weight: " + val);
    }

    void findMsp() {
        int k = n - 1;
        while (k > 0) {
            int min = Integer.MAX_VALUE;
            int p1 = -1, c = -1;
            for (int i = 0; i < n; i++) {
                if (v[i] == 1) {
                    for (int j = 0; j < n; j++) {
                        if (v[j] == -1 && a[i][j] != -1) {
                            if (a[i][j] < min) {
                                min = a[i][j];
                                p1 = i;
                                c = j;
                            }
                        }
                    }
                }
            }
            if (p1 != -1 && c != -1) {
                p[c] = p1;
                v[c] = 1;
                val += min;
                k--;
            }
        }
        System.out.println("Parent - Child ");
        for (int i = 0; i < n; i++) {
            if (p[i] != -1) {
                System.out.format("%d - %d ", p[i], i);
                System.out.println();
            }
        }
    }
}

public class Prm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = in.nextInt();
        int g[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    g[i][j] = -1;
                } else {
                    System.out.format("%d - %d: ", i, j);
                    g[i][j] = g[j][i] = in.nextInt();
                }
            }
        }
        new inner(g, n);
        in.close();
    }
}
