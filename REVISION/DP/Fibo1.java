//Using Memorization method.

import java.util.*;
class Fibnacii{
    int a[], n;
    public Fibnacii(int n){
        this.n=n;
        a=new int[n+1];
        for(int i=0; i<=n; i++){
            a[i]=-1;
        }
    }
    int fib(int n){
        if(a[n]!=-1){
            return a[n];
        }
        if(n==0||n==1){
            return a[n]=1;
        }
        else{
            return a[n]=fib(n-2)+fib(n-1);
        }
    }
}
class Fibo1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Fibnacii f=new Fibnacii(n);
        System.out.println(f.fib(n));
    }
}