//Recursion.

import java.util.*;
class Knaps{
    int wt[];
    int val[];
    int n, w;
    Knaps(int n, int w){
        this.n=n;
        this.w=w;
        wt = new int[n];
        val = new int[n];
    }
    int knap(int n, int w){
        if(n==0||w==0){
            return 0;
        }
        if(wt[n-1]<=w){
            return Math.max(val[n-1]+knap(n-1,w-wt[n-1]),knap(n-1, w));
        }
        else{
            return knap(n-1, w);
        }
    }
}
public class Knapsack{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = in.nextInt();
        System.out.println("Enter the w value: ");
        int w = in.nextInt();
        Knaps k = new Knaps(n, w);
        System.out.println("Enter the wt and val values: ");
        for(int i=0; i<n; i++){
            k.wt[i] = in.nextInt();
            k.val[i] = in.nextInt();
        }
        System.out.println(k.knap(n, w));
    }
}
