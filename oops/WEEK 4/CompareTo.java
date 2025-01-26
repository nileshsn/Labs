//1. Write an application that uses String method compareTo to compare two strings defined by the user.
//2. Write an application that uses String method equals and equalsIgnoreCase to tests any two string objects for equality.
//3. Write an application that uses String method indexOf to determine the total number of occurrences of any given alphabet in a defined text.
//4. Write an application that uses String method concat to concatenate two defined strings.
//6. Write an application that finds the length of a given string.
//7. Write an application that uses String method charAt to reverse the string.

import java.util.*;
class CompareTo
{
    public static void main(String[] args)
    {
        String str1 = new String("enug");
        String str2 = new String("Nilesh");
        System.out.println(str1.compareTo(str2)); // Q1
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.length()); //Q6
        System.out.println(str1.concat(str2)); //Q4
        System.out.println(str1.equals(str2)); //Q2
        System.out.println(str1.equalsIgnoreCase(str2)); //Q2
        System.out.println(str1.indexOf('n')); //Q3
        System.out.println(str2.indexOf('h')); //Q3
        System.out.println(str1.charAt(2));  //Q7
        System.out.println(str1.contains("u"));
        System.out.println(str1.substring(2));
    }
    
}
 