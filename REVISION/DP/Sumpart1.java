//Memorization.

import java.util.*;
class Equalsum{
    int n, w;
    int wt[];
    boolean a[][];
    Equalsum(int n, int w){
        this.n = n;
        this.w = w;
        a = new boolean[n+1][w+1];
    }
    boolean partition(int wt[], int n, int w){
        if(a[n][w] != false){
            return a[n][w];
        }
        if(w == 0){
            return a[n][w] = true;
        }
        if(n == 0){
            return a[n][w] = false;
        }
        if(wt[n-1] <= w){
            return a[n][w] = partition(wt, n, w-wt[n-1]);
        }else{
            return a[n][w] = partition(wt, n-1, w);
        }
    }
}
public class Sumpart1{
    public static void main(String[] args){
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = in.nextInt();
        System.out.println("Enter wt value: ");
        int wt[] = new int[n];
        for(int i=0; i<n; i++){
            wt[i] = in.nextInt();
            sum += wt[i];
        }
        if(sum % 2 == 1){
            System.out.println("Equal sum partition is possible.");
        }
        else if(sum % 2 == 0){
            sum = sum/2; 
            Equalsum e = new Equalsum(n, sum);
            boolean r = e.partition(wt, n, sum);
            if(r == true){
                System.out.println("Equal sum partition is possible.");
            }
            else{
                System.out.println("Equal sum partition is not possible.");
            }
        }
    }
}