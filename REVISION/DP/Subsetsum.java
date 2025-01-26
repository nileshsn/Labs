//Recursion.

import java.util.*;
class Sub{
    int wt[];
    int n, w;
    Sub(int n, int w){
        this.n=n;
        this.w=w;
        wt = new int[n];
    }
    boolean Subset(int n, int w){
        if(w == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(wt[n-1]<=w){
            return Subset(n-1, w-wt[n-1]) || Subset(n-1, w);
        }
        else{
            return Subset(n-1, w);
        }
    }
}
public class Subsetsum{
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
