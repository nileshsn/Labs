import java.util.*;
class Class{
  int n;
  int key[];
  int freq[];
  public Class(int n, int key[], int freq[]){
    this.n = n;
    this.key = key;
    this.freq = freq;
  }
  int obst(int i, int j){
    int min = Integer.MAX_VALUE;
    if(i > j){
        return 0;
    }
    if(i == j){
      return freq[i];
    }
    for(int k=i; k<=j; k++){
      int val = obst(i, k-1)+obst(k+1, j)+sum(i, j);
      if(val < min){
        min = val;
      }
    }
    return min;
  } 
  int sum(int m, int n){
    int sum = 0;
    for(int i=m; i<=n; i++){
        sum += freq[i];
    }
    return sum;
  }
}
public class Optimal{
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