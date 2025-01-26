/*6. Write an application that declares 5 integers, determines and prints the largest
and smallest in the group.*/

import java.util.Scanner;

class Compare{
    int num[] = new int[5];
    public void testNum(){
        int small = num[0];
        int large = num[0];
        for(int i=1; i<num.length; i++){
            if(num[i]<small){
                small = num[i];
            }
            else if(num[i]>large){
                large = num[i];
            }
        }
        System.out.println("smallest number: "+small);
        System.out.println("largest number: "+large);
    }
}
public class Comparator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Compare compare = new Compare();

        System.out.println("Enter 5 integers: ");
        for(int i=0; i<5; i++){
            System.out.println("Enter numbers "+(i+1)+": ");
            compare.num[i] = sc.nextInt();
        }
        compare.testNum();
        sc.close();
    }
}