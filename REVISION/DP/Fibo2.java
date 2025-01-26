// //Using Tabulation method.

// import java.util.*;
// class Fibnocci2{
//     int a[], n;
//     public Fibnocci2(int n){
//         this.n=n;
//         a=new int[n+1];
//     }

//     int fib(int n){
//         for(int i=0; i<=n; i++){
//             if(i==0||i==1){
//                 a[i]=i;
//             }
//             else{
//                 a[i]=a[i-2]+a[i-1];
//             }
//         }
//         return a[n];
//     }
// }
// class Fibo2{
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         Fibnocci2 f=new Fibnocci2(n);
//         System.out.println(f.fib(n));
//     }
// }

#include<stdio.h>

int climbStairs(int n)
{
    int a[n+1];
    for(int i=0;i<=n;i++)
        a[i] = -1;
    for(int i=0;i<=n;i++)
    {
        if(i<=1)
            a[i] = 1;
        else
            a[i] = a[i-1] + a[i-2];    
    }
    return a[n];
}
void main()
{
    int n;
    printf("Enter no. of steps : ");
    scanf("%d",&n);
    int ways = climbStairs(n);
    printf("No. of ways : %d\n",ways);
}