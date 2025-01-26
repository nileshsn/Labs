import java.util.*;
class Matrix{
  int n;
  int a[];
  int dp[][];
  public Matrix(int n){
    this.n = n;
    a = new int[n+1];
    dp = new int[n+1][n+1];
  }
  int mcm(){
    for(int l=0; l<n; l++){
        for(int i=1; i<=n-l; i++){
            int min = Integer.MAX_VALUE;
            int val = 0;
            int j = i+l;
            if(i == j){
                dp[i][j] = 0;
                continue;
            }
            for(int k=i; k<j; k++){
                val = dp[i][k]+dp[k+1][j]+a[i-1]*a[j]*a[k];
                if(val < min){
                    min = val;
                }
            }
            dp[i][j] = min;
        }
    }
    return dp[1][n];
  } 
}
public class MCMulti2{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter no of matrix: ");
    int n = in.nextInt();
    Matrix m = new Matrix(n);
    System.out.println("Enter matrix row col values: ");
    for(int i=0;i<=n;i++){
      m.a[i]=in.nextInt();
    }
    System.out.println("no of minimun multiplications:"+m.mcm());
  //   System.out.println("DP Matrix:");
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= n; j++) {
  //         if (i > j) {
  //           System.out.print("  -  "); // Print dashes for unused cells
  //         } else {
  //           System.out.printf("%5d ", m.dp[i][j]); // Print the values with padding
  //         }
  //       }
  //       System.out.println();
  //     }
  }
}