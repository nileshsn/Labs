import java.util.*;
class Knap{
    int Knap(int i, int w, int wt[], int val[]){
        if(i == 0){
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
public class KnapBacktrack{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = in.nextInt();
        System.out.println("Enter w value: ");
        int w = in.nextInt();
        System.out.println("Enter wt and val: ");
        int wt1[] = new int[n];
        int val1[] = new int[n];
        for(int i=0; i<n; i++){
            wt1[i] = in.nextInt();
            val1[i] = in.nextInt();
        }
        Knap k = new Knap();
        int ans = k.Knap1(wt1, val1, w, n);
        System.out.println("Max value: "+ans);
    }
}






// import java.util.*;
// class Knapsack {
//     int knapsack(int ind, int mwt, int[] wt, int[] val) {
//         if (ind == 0) {
//             if (wt[0] <= mwt) {
//                 return val[0];
//             } else {
//                 return 0;
//             }
//         }
//         int notTake = knapsack(ind - 1, mwt, wt, val);
//         int take = Integer.MIN_VALUE;
//         if (wt[ind] <= mwt) {
//             take = val[ind] + knapsack(ind - 1, mwt - wt[ind], wt, val);
//         }
//         return Math.max(take, notTake);
//     }
//     int knapsackb(int[] weight, int[] value, int mwt, int n) {
//         return knapsack(n - 1, mwt, weight, value);
//     }
// }
// public class KnapBacktrack {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n value: ");
//         int n = sc.nextInt();
//         System.out.print("Enter w value: ");
//         int mwt = sc.nextInt();
//         int[] weight = new int[n];
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter wt value: " + (i + 1) + ": ");
//             weight[i] = sc.nextInt();
//         }
//         int[] value = new int[n];
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter values: " + (i + 1) + ": ");
//             value[i] = sc.nextInt();
//         }
//         Knapsack ks = new Knapsack();
//         int ans = ks.knapsackb(weight, value, mwt, n);
//         System.out.println("Maximum value that can be obtained: " + ans);
//         sc.close();
//     }
// }