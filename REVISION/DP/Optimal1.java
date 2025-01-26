import java.util.*;
class Class{
  int n;
  int key[];
  int freq[];
  int a[][];
  public Class(int n, int key[], int freq[]){
    this.n = n;
    this.key = key;
    this.freq = freq;
    a = new int[n+2][n+2];
    for(int i=0; i<=n+1; i++){
      for(int j=0; j<=n+1; j++){
        a[i][j] = -1;
      }
    }
  }
  int obst(int i, int j){
    int min = Integer.MAX_VALUE;
    if(a[i][j] != -1){
      return a[i][j];
    }
    if(i > j){
      return a[i][j] = 0;
    }
    if(i == j){
      return a[i][j] = freq[i];
    }
    for(int k=i; k<=j; k++){
      int val = obst(i, k-1)+obst(k+1, j)+sum(i, j);
      if(val < min){
        min = val;
      }
    }
    return a[i][j] = min;
  } 
  int sum(int m, int n){
    int sum = 0;
    for(int i=m; i<=n; i++){
        sum += freq[i];
    }
    return sum;
  }
}
public class Optimal1{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n = in.nextInt();
    int[] key = new int[n];
    int[] freq = new int[n];
    System.out.println("Enter key and freq values: ");
    for (int i = 0; i < n; i++) {
        key[i] = i+1;
        freq[i] = in.nextInt();
    }
    Class c = new Class(n, key, freq);
    System.out.println("Min operations required: " + c.obst(1, n - 1));
  }
}