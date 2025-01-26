//1. Write a Java program to sort given list of numbers.
import java.util.Scanner;
import java.util.Arrays;
class Sort{
    int n;
    int[] num;
    public Sort(){
        num = new int[n];
    }
    public void test(){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
}
class Sorting{
    public static void main (String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        Sort s = new Sort();
        System.out.println("Enter size: ");
        s.n = in.nextInt();
        s.num = new int[s.n];
        for(int i=0; i<s.n; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            s.num[i] = in.nextInt();
        }
        System.out.print("Sorted numbers: ");
        s.test();
        for(int j=0; j<s.n; j++){
            System.out.print(s.num[j]+" ");
        }
        in.close();
    }
}