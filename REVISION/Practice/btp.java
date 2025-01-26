import java.util.*;
class Btper{
    char[] a;
    char[] b;
    int n;
    public Btper(int n){
        this.n = n;
        a = new char[n];
        b = new char[n];
    }
    void fill(int n, int k){
        if(k == n){
            for(int i=0; i<n; i++){
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for(int i=0; i<n; i++){
            if(isSafe(k, b[i])){
                a[k] = b[i];
                fill(n, k+1);
            }
        }
    }
    boolean isSafe(int k, char i){
        for(int j=0; j<k; j++){
            if(a[j] == i){
                return false;
            }
        }
        return true;
    }
}
public class btp{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        Btper bt = new Btper(n);
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            bt.b[i] = in.next().charAt(0);
        }
        bt.fill(n, 0);
    }
}