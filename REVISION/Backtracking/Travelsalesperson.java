import java.util.Scanner;

class TSP {
    int[] a;
    int[][] adj;
    int n;
    int minCost = Integer.MAX_VALUE;

    public TSP(int n, int[][] adj) {
        this.n = n;
        this.a = new int[n];
        this.a[0] = 0;
        this.adj = adj;
    }

    boolean isSafe(int k, int i) {
        if (adj[a[k - 1]][i] == 0) {
            return false;
        }
        for (int j = 1; j < k; j++) {
            if (a[j] == i) {
                return false;
            }
        }
        if (k == (n - 1) && adj[i][0] == 0) {
            return false;
        }
        return true;
    }

    void fill(int n, int k, int cost) {
        if (k >= n) {
            cost += adj[a[k - 1]][a[0]]; // add the cost to return to the start
            if (cost < minCost) {
                minCost = cost;
                System.out.print("Path: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + "\t");
                }
                System.out.println("Cost: " + minCost);
            }
            return;
        }
        for (int i = 1; i < n; i++) {
            if (isSafe(k, i)) {
                a[k] = i;
                fill(n, k + 1, cost + adj[a[k - 1]][i]);
            }
        }
    }
}

public class Travelsalesperson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();
        int[][] adj = new int[n][n];
        System.out.println("Enter the adjacency matrix (weights of edges) of the graph:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }

        TSP tsp = new TSP(n, adj);
        tsp.fill(n, 1, 0);
        System.out.println("Minimum cost: " + tsp.minCost);
        sc.close();
    }
}
