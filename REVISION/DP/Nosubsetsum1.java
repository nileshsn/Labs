//Memorization.

import java.util.*;
class Sub{
    int wt[];
    int a[][];
    int n, w;
    Sub(int n, int w){
        this.n=n;
        this.w=w;
        wt = new int[n];
        a = new int[n+1][w+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=w; j++){
                a[i][j] = -1;
            }
        }
    }
    int Subset(int n, int w){
        if(a[n][w] != -1)
            return a[n][w];
        if(w == 0)
            return 1;
        if(n == 0)
            return 0;
        if(wt[n-1] <= w){
            return a[n][w] = Subset(n-1, w-wt[n-1]) + Subset(n-1, w);
        }
        else{
            return Subset(n-1, w);
        }
    }
}
public class Nosubsetsum1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = in.nextInt();
        System.out.println("Enter the w value: ");
        int w = in.nextInt();
        Sub s = new Sub(n, w);
        System.out.println("Enter the wt values: ");
        for(int i=0; i<n; i++){
            s.wt[i] = in.nextInt();
        }
        System.out.println(s.Subset(n, w));
    }
}
