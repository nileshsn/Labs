//Tabulation.

import java.util.*;
class knaps{
    int wt[];
    int val[];
    int a[][];
    knaps(int n, int w){
        wt = new int[n];
        val = new int[n];
        a = new int[n+1][w+1];
    }
    int knap(int n, int w){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=w; j++){
                if(i == 0 || j == 0){
                    a[i][j] = 0;
                    continue;
                }
                if(wt[i-1] <=j ){
                    a[i][j] = Math.max(val[i-1]+knap(i-1, j-wt[i-1]), knap(i-1, j));
                }
                else{
                    a[i][j] = knap(i-1, j);
                }
            }
        }
        return a[n][w];
    }
}
public class knapsack2{
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