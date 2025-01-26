//1. Write a Java Program to implement Wrapper classes and their methods.

import java.util.Scanner; 
class Wrapper 
{ 
    public static void main(String args[]) 
    { 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter a Number"); 
        int a=s.nextInt(); 
        Integer c = new Integer(a); 
        
        System.out.println("Enter another Number"); 
        int b=s.nextInt(); 
        Integer d = new Integer(b); 
        System.out.println("Addition of given numbers is: "+(c+d)); 
        System.out.println("Substraction of given numbers is: "+(c-d)); 
        System.out.println("Multiplication of given numbers is: "+(c*d)); 
        System.out.println("Division of given numbers is: "+(c/d)); 
    } 
} 