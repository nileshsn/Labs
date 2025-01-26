//Memorization.

import java.util.*;
class knaps{
    int wt[];
    int val[];
    int a[][];
    knaps(int n, int w){
        wt = new int[n];
        val = new int[n];
        a = new int[n+1][w+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=w; j++){
                a[i][j] = -1;
            }
        }
    }
    int knap(int n, int w){
        if(a[n][w] != -1){
            return a[n][w];
        }
        if(n == 0 || w == 0){
            return 0;
        }
        if(wt[n-1] <=w ){
            return a[n][w] = Math.max(val[n-1]+knap(n, w-wt[n-1]), knap(n-1, w));
        }
        else{
            return a[n][w] = knap(n-1, w);
        }
    }
}
public class Unboundknap1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = in.nextInt();
        System.out.println("Enter the w value: ");
        int w = in.nextInt();
        knaps k = new knaps(n, w);
        System.out.println("Enter the wt and val: ");
        for(int i=0; i<n; i++){
            k.wt[i] = in.nextInt();
            k.val[i] = in.nextInt();
        }
        System.out.println(k.knap(n, w));
    }
}