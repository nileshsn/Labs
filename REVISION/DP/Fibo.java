//Using Recursive approach.

import java.util.*;
class Fibnacii{
    int n;
    public Fibnacii(int n){
        this.n=n;
    }
    int fib(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return fib(n-2)+fib(n-1);
        }
    }
}
class Fibo{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Fibnacii f=new Fibnacii(n);
        System.out.println(f.fib(n));
    }
}