import java.util.*;
class Knap{
    int Knap(int i, int w, int wt[], int val[]){
        if(i==0){
            if(wt[0]<=w){
                return val[0];
            }
            else{
                return 0;
            }
        }
        int nt = Knap(i-1, w, wt, val);
        int t = Integer.MAX_VALUE;
        if(wt[i]<=w){
            t = val[i] + Knap(i-1, w-wt[i], wt, val);
        }
        return Math.max(t, nt);
    }
    int Knap1(int wt1[], int val1[], int w, int n){
        return Knap(n-1, w, wt1, val1);
    }
}
public class knsb{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        System.out.println("Enter w: ");
        int w = in.nextInt();
        int wt1[] = new int[n];
        int val1[] = new int[n];
        System.out.println("Enter wt and val: ");
        for(int i=0; i<n; i++){
            wt1[i] = in.nextInt();
            val1[i] = in.nextInt();
        }
        Knap k = new Knap();
        int ans = k.Knap1(wt1, val1, w, n);
        System.out.println("Max value: "+ans);
    }
}