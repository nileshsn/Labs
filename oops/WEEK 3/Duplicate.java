/*3. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
 each number is read display it only if it’s not a duplicate of any number already read
 display the complete set of unique values input after the user enters each new value*/

import java.util.*;

class Num
{
  int a[] = new int[100];
}
class Duplicate
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Num num = new Num();
    for (int i=0; i<5; i++)
    {
      System.out.println("Enter any num between 10 to 100 only: ");
      int n = in.nextInt();
      if (n>10 && n<100)
      {
        if (num.a[n]==0)
        {
          num.a[n]=n;
          System.out.println("you entered a new number: "+num.a[n]);
        }
        else
        {
          System.out.println("Already exists!");
        }
      }
      else
      {
        System.out.println(n+" is out of given range");
      }
    } 
    in.close();
  }
}