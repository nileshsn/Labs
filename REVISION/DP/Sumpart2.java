//Tabulation.

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
        for(int i=0; i<=n; i++){
            for(int j=0; j<=w; j++){
                if(a[i][j] != false){
                    return a[i][j];
                }
                if(j == 0){
                    return a[i][j] = true;
                }
                if(i == 0){
                    return a[i][j] = false;
                }
                if(wt[i-1] <= j){
                    return a[i][j] = partition(wt, i, j-wt[i-1]) || partition(wt, i-1, j);
                }else{
                    return a[i][j] = partition(wt, i-1, j);
                }
            }
        }
        return a[n][w];
    }
}
public class Sumpart2{
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
            }else{
                System.out.println("Equal sum partition is not possible.");
            }
        }
    }
}