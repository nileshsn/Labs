//Recursion.

import java.util.*;
class Equalsum{
    boolean partition(int wt[], int n, int w){
        if(w == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(wt[n-1] <= w){
            return partition(wt, n, w-wt[n-1]);
        }
        else{
            return partition(wt, n-1, w);
        }
    }
}
public class Sumpart{
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
            Equalsum e = new Equalsum();
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