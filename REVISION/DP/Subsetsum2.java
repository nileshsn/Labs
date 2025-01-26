//Tabulation.

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
    }
    int Subset(int n, int w){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=w; j++){
                if(j == 0){
                    a[i][j] = 1;
                    continue;
                }
                if(i == 0){
                    a[i][j] = 0;
                    continue;
                }
                if(wt[i-1] <= j){
                    a[i][j] = a[i-1][j-wt[i-1]] | a[i-1][j];
                }
                else{
                    a[i][j] = a[i-1][j];
                }
            }
        }
        return a[n][w];
    }
}
public class Subsetsum2{
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
