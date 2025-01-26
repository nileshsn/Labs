import java.util.*;
class Matrix{
  int a[];
  int dp[][];
  public Matrix(int n){
    a = new int[n+1];
    dp = new int[n+1][n+1];
    for(int i=0; i<=n; i++){
      for(int j=0; j<=n; j++){
        dp[i][j] = -1;
      }
    }
  }
  int mcm(int i, int j){
    int min = Integer.MAX_VALUE;
    int val = 0;
    if(dp[i][j] != -1){
      return dp[i][j];
    }
    if(i == j){
      return dp[i][j] = 0;
    }
    for(int k=i; k<j; k++){
      val = mcm(i, k)+mcm(k+1, j)+a[i-1]*a[j]*a[k];
      if(val < min){
        min = val;
      }
    }
    return dp[i][j] = min;
  } 
}
public class MCMulti1{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter no of matrix: ");
    int n = in.nextInt();
    Matrix m = new Matrix(n);
    System.out.println("Enter matrix row col values: ");
    for(int i=0;i<=n;i++){
      m.a[i]=in.nextInt();
    }
    System.out.println(m.mcm(1, n));
  }
}