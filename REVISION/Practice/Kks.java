import java.util.Scanner;

class Edge {
    int s, d, w;
    Edge(int s, int d, int w) {
        this.s = s;
        this.d = d;
        this.w = w;
    }
}

class Msp {
    int g[][], p[], n;
    int val = 0;

    Msp(int g[][], int n) {
        this.g = g;
        this.n = n;
        p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
        }
        findMsp();
        System.out.println("Total weight: " + val);
        printParentChild();
    }

    void findMsp() {
        int edgeAdd = 0;
        while (edgeAdd < n - 1) {
            Edge e = findV();
            if (e == null) break;
            int u = e.s;
            int v = e.d;
            int pu = findP(u);
            int pv = findP(v);
            if (pu != pv) {
                val += e.w;
                p[pv] = pu;
                edgeAdd++;
            }
            g[u][v] = g[v][u] = -1;
        }
    }

    Edge findV() {
        int min = Integer.MAX_VALUE;
        int u = -1, v = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] != -1 && g[i][j] < min) {
                    u = i;
                    v = j;
                    min = g[i][j];
                }
            }
        }
        if (u == -1 || v == -1) return null;
        return new Edge(u, v, min);
    }

    int findP(int n) {
        if (n == p[n]) {
            return n;
        }
        return p[n] = findP(p[n]);
    }

    void printParentChild() {
        System.out.println("Parent - Child ");
        for (int i = 0; i < n; i++) {
            if (p[i] != i) {
                System.out.format("%d - %d\n", p[i], i);
            }
        }
    }
}

public class Kks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of vertices: ");
        int n = in.nextInt();
        int g[][] = new int[n][n];
        System.out.println("Enter edges: ");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i != j) {
                    System.out.format("%d - %d: ", i, j);
                    g[i][j] = g[j][i] = in.nextInt();
                } else {
                    g[i][j] = g[j][i] = -1;
                }
            }
        }
        new Msp(g, n);
        in.close();
    }
}
