import java.util.*;
class Knap{
    int n, w;
    int wt[], val[];
    double r[];
    Knap(int n, int w){
        this.n = n;
        this.w = w;
        wt = new int[n];
        val = new int[n];
        r = new double[n];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter wt and val: ");
        for(int i=0; i<n; i++){
            wt[i] = in.nextInt();
            val[i] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            r[i] = (double) val[i]/wt[i];
        }
        bsort();
    }
    void bsort(){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(r[j]<r[j+1]){
                    double tempR = r[j];
                    r[j] = r[j+1];
                    r[j+1] = tempR;

                    int tempW = wt[j];
                    wt[j] = wt[j+1];
                    wt[j+1] = tempW;

                    int tempV = val[j];
                    val[j] = val[j+1];
                    val[j+1] = tempV;
                }
            }
        }
    }
    int fracknap(){
        int v = 0;
        for(int i=0; i<n; i++){
            if(wt[i]<=w){
                v += val[i];
                w -= wt[i];           
            }
            else{
                v += (w/(double) wt[i])*val[i];
                break;
            }
        }
        return v;
    }
}
public class fks{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = in.nextInt();
        System.out.println("Enter w value: ");
        int w = in.nextInt();
        Knap k = new Knap(n, w);
        System.out.println("Maximum value: "+k.fracknap());
    }
}