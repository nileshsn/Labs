//5. Write a java program to find whether given number is Palindrome or not


import java.util.Scanner;
class palindrome{
    int num;
    public void palindrome(int num){
        int org_num=num;
        int rev_num=0;
        while(num!=0){
            rev_num = (rev_num * 10)+(num%10);
            num=num/10;
        }
        if(org_num==rev_num){
            System.out.println(org_num+ " is a palindrome");
        }
        else{
            System.out.println(org_num+ " is not a palindrome");
        }
    }
}
class Palin{
    public static void main(String[] args){
        palindrome palobj=new palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        palobj.num = sc.nextInt();
        palobj.palindrome(palobj.num);
    }
}
