//diagonal path matrix
import java.util.*;

class matrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int l=1;
        int [][] a=new int[n][n];
        for(int k=0;k<n;k++){
            for(int i=0;i<n-k;i++){
                int j=i+k;
                a[i][j]=l++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
}