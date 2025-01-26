import java.util.*;
class Str {
    int f1;
    Str(String a, String b) {
        f1 = 0; 
        for (int i = 0; i <= a.length() - b.length(); i++) {
            if (a.charAt(i) == b.charAt(0)) {
                int f = 0;
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i + j) != b.charAt(j)) {
                        f = 1;
                        break;
                    }
                }
                if (f == 0) {
                    f1++;
                }
            }
        }
    }
}
public class StringC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String a = in.nextLine();
        System.out.println("Enter the second string: ");
        String b = in.nextLine();

        Str s = new Str(a,b);
        System.out.println("Count of substring: " + s.f1 + ".");

    }
}
