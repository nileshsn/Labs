//Memorization.

import java.util.*;
class Coin{
    int wt[];
    int a[][];
    int n, w;
    int m=Integer.MAX_VALUE;
    Coin(int n, int w){
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
    int Change(int n, int w){
        if(a[n][w] != -1)
            return a[n][w];
        if(w == 0)
            return 0;
        if(n == 0)
            return m-1000;
        if(wt[n-1] <= w){
            return a[n][w] = Math.min(1+Change(n, w-wt[n-1]), Change(n-1, w));
        }
        else{
            return Change(n-1, w);
        }
    }
}
public class Mincoin1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = in.nextInt();
        System.out.println("Enter the w value: ");
        int w = in.nextInt();
        Coin c = new Coin(n, w);
        System.out.println("Enter the wt values: ");
        for(int i=0; i<n; i++){
            c.wt[i] = in.nextInt();
        }
        System.out.println(c.Change(n, w));
    }
}
