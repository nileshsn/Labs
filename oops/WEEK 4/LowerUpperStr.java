//9. Write an application that changes any given string with uppercase letters, displays
//it, changes it back to lowercase letters and displays it

import java.util.*;
class LowerUpperStr
{
    public static void main(String[] args)
    {
        String str = new String();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String: ");
        str = in.nextLine();
        System.out.println("Lowercase: "+str.toLowerCase());
        System.out.println("Uppercase: "+str.toUpperCase());
        in.close();
    }
}