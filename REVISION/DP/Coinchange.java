//Recursion.

import java.util.*;
class Coin{
    int wt[];
    int n, w;
    Coin(int n, int w){
        this.n=n;
        this.w=w;
        wt = new int[n];
    }
    int Change(int n, int w){
        if(w == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(wt[n-1]<=w){
            return Change(n, w-wt[n-1]) + Change(n-1, w);
        }
        else{
            return Change(n-1, w);
        }
    }
}
public class Coinchange{
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
