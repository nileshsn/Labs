import java.util.Scanner;

class Cycle {
    int[] a;
    int[][] adj;
    int n;

    public Cycle(int n, int[][] adj) {
        this.n = n;
        this.a = new int[n];
        this.a[0] = 0;
        this.adj = adj;
    }

    boolean isSafe(int k, int i) {
        if (adj[a[k - 1]][i] != 1) {
            return false;
        }
        for (int j = 1; j < k; j++) {
            if (a[j] == i) {
                return false;
            }
        }
        if (k == (n - 1) && adj[i][0] != 1) {
            return false;
        } 
        return true;
    }

    void fill(int n, int k) {
        if (k >= n) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + "\t");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i < n; i++) {
            if (isSafe(k, i)) {
                a[k] = i;
                fill(n, k + 1);
            }
        }
    }
}

public class Hamilton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of vertices:");
        int n = sc.nextInt();
        int[][] adj = new int[n][n];
        System.out.println("Enter the adjacency matrix of the graph:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }

        Cycle hc = new Cycle(n, adj);
        hc.fill(n, 1);
        sc.close();
    }
}
