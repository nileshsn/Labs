

import java.util.Scanner;
class FindWays{
    int n;
    int tWeight;
    int wts[];
    FindWays(int n,int tWeight,int wts[]){
        this.n = n;
        this.tWeight = tWeight;
        this.wts = wts;
    }
    int nWays(int n,int tWeight){
        if(tWeight == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(wts[n-1] <= tWeight){
            return nWays(n, tWeight-wts[n-1])+nWays(n-1, tWeight);
        } else {
            return nWays(n-1, tWeight);
        }
    }

}
class NoOfWays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" n :");
        int n = sc.nextInt();
        System.out.print("value to find :");
        int tweight = sc.nextInt();
        int wts[] = new int[n];
        System.out.println("fill coins[] :");
        for(int i=0; i<n; i++){
            wts[i] = sc.nextInt();
        }
        FindWays obj = new FindWays(n, tweight, wts);
        System.out.println(obj.nWays(n, tweight));
        sc.close();
    }
}