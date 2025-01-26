import java.util.*;
class Matrix{
  int a[];
  public Matrix(int n){
    a = new int[n+1];
  }
  int mcm(int i, int j){
    int min = Integer.MAX_VALUE;
    int val = 0;
    if(i == j){
      return 0;
    }
    for(int k=i; k<j; k++){
      val = mcm(i, k)+mcm(k+1, j)+a[i-1]*a[j]*a[k];
      if(val < min){
        min = val;
      }
    }
    return min;
  } 
}
public class MCMulti{
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