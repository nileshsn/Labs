//6. Write a java program for sorting a given list of names

import java.util.Scanner;

class SortStrings {
    void sort() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = in.nextInt();

        String str[] = new String[n];
        System.out.println("Enter the strings: ");

        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }

        for (int j = 0; j < n; j++) {
            for (int i = j + 1; i < n; i++) {
                if (str[i].compareTo(str[j]) < 0) {
                    String temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
        }
        System.out.println("sorted strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

        in.close();
    }
}

class StringSort {
    public static void main(String[] args) {
        SortStrings sorting = new SortStrings();
        sorting.sort();
    }
}


































/*class SortStr
{
    void sort()
    {
        String str[] = {"nilesh","mahesh","ricky","morty"};
        String temp;
        System.out.println("Strings in sorted order");
        for (int j=0; j<str.length; j++)
        {
            for (int i=j+1; i<str.length; i++)
            {
                if (str[i].compareTo(str[j])<0)
                {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
            System.out.println(str[j]);
        }
    }
}
class StringSort
{
    public static void main(String[] args)
    {
        SortStr sorting = new SortStr();
        sorting.sort(); 
    }
}*/