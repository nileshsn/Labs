import java.util.Scanner;

class Edge {
    int src, dest, weight;
    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Msp {
    int graph[][];
    int n;
    int par[];
    int value = 0;

    Msp(int graph[][], int n) {
        this.graph = graph;
        this.n = n;
        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        findMsp();
        System.out.println(value);
    }

    void findMsp() {
        int edgesAdded = 0;
        while (edgesAdded < n - 1) {
            Edge e = findVertices();
            if (e == null) break;
            int u = e.src;
            int v = e.dest;
            int pu = findPar(u);
            int pv = findPar(v);
            if (pu != pv) {
                value += e.weight;
                par[pv] = pu;
                edgesAdded++;
            }
            graph[u][v] = graph[v][u] = -1;
        }
    }

    Edge findVertices() {
        int min = Integer.MAX_VALUE;
        int u = -1;
        int v = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] != -1 && graph[i][j] < min) {
                    u = i;
                    v = j;
                    min = graph[i][j];
                }
            }
        }
        if (u == -1 || v == -1) return null;
        return new Edge(u, v, min);
    }

    int findPar(int n) {
        if (n == par[n]) {
            return n;
        }
        return par[n] = findPar(par[n]);
    }
}

public class Kruskals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no. of vertices:");
        int n = sc.nextInt();
        int graph[][] = new int[n][n];
        System.out.println("enter edges");

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i != j) {
                    System.out.format("%d - %d: ", i, j);
                    graph[i][j] = graph[j][i] = sc.nextInt();
                } else {
                    graph[i][j] = graph[j][i] = -1;
                }
            }
        }
        new Msp(graph, n);
        sc.close();
    }
}











// import java.util.Scanner;
// class edge{
//     int src, dest;
//     edge(int u, int dest){
//         this.src = u;
//         this.dest = dest;
//     }
// }
// class Msp{
//     int graph[][];
//     int n;
//     int par[];
//     int value = 0;

//     Msp(int graph[][], int n){
//         this.graph = graph;
//         this.n = n;
//         par = new int[n];
//         for(int i=0; i<n; i++){
//             par[i] = i;
//         }
//         findMsp();
//         System.out.println(value);
//     }
//     void findMsp(){
//         int k = n;
//         while(k > 0){
//             edge e = findVertices();
//             int u = e.src;
//             int v = e.dest;
//             int pu = findPar(u);
//             int pv = findPar(v);
//             if(pu != pv){
//                 value += graph[u][v];
//                 par[pu] = pv;
//             }
//             graph[u][v] = -1;
//             k--;
//         }
//     }
//     edge findVertices(){
//         int min = Integer.MAX_VALUE;
//         int u = 0; //here may get errror
//         int v = 0;//
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 if(graph[i][j] != -1 && graph[i][j] < min){
//                     u = i;
//                     v = j;
//                     min = graph[i][j];
//                 }
//             }
//         }
//         return new edge(u, v);
//     }
//     int findPar(int n){
//         if(n == par[n]){
//             return n;
//         }
//         return par[n] =  findPar(par[n]);
//     }
// }

// public class Kruskals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("no.of vertices :");
//         int n = sc.nextInt();
//         int graph[][] = new int[n][n];
//         System.out.println("enter edges");
        
//         for(int i=0; i<n; i++){
//             for(int j=i; j<n; j++){
//                 if(i != j){
//                     System.out.format("%d - %d :", i, j);
//                     graph[i][j] = graph[j][i] = sc.nextInt();
//                 } else {
//                     graph[i][j] = graph[j][i] = -1;
//                 }
//             }
//         }
//         new Msp(graph, n);
//         sc.close();
//     }
// }
