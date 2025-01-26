/*8. Write an application that finds the substring from any given string using substring
method and startsWith & endsWith methods.*/

import java.util.Scanner;

class MyString {
    private String inStr;
    public MyString(String inStr) {
        this.inStr = inStr;
    }

    public String findSubstring(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > inStr.length() || startIndex > endIndex) {
            return "Invalid indices";
        }
        return inStr.substring(startIndex, endIndex);
    }

    public boolean startsWith(String prefix) {
        return inStr.startsWith(prefix);
    }

    public boolean endsWith(String suffix) {
        return inStr.endsWith(suffix);
    }
}

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inStr = in.nextLine();

        MyString myString = new MyString(inStr);

        System.out.print("Enter start index for substring: ");
        int startIndex = in.nextInt();

        System.out.print("Enter end index for substring: ");
        int endIndex = in.nextInt();

        String substrResult = myString.findSubstring(startIndex, endIndex);
        System.out.println("Substring: " + substrResult);
        in.nextLine(); 
        System.out.print("Enter a prefix to check if the string starts with it: ");
        String prefix = in.nextLine();
        System.out.println("Starts with prefix? " + myString.startsWith(prefix));

        System.out.print("Enter a suffix to check if the string ends with it: ");
        String suffix = in.nextLine();
        System.out.println("Ends with suffix? " + myString.endsWith(suffix));

        in.close();
    }
}
