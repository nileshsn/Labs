//4. Write a java program to find prime factors of given number

import java.util.Scanner;

class Prime{
    int a;
    public void check_prime(int a){
        int c, i, j;
        for(i=1; i<=a; i++){
            c = 0;
            if(a%i==0){
                for(j=1; j<=i; j++){
                    if(i%j==0){
                        c++;
                    }
                }
                if(c == 2){
                    System.out.println(i);
                }
            }
        }
    }
}
public class fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Prime p = new Prime();
        System.out.print("Enter any number: ");
        p.a=sc.nextInt();
        p.check_prime(p.a);
    }
}
