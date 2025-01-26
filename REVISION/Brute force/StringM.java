import java.util.*;

class Str {
    int f1;
    int ind;

    Str(String a, String b) {
        f1 = 0;
        ind = -1;  
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
                    f1 = 1;
                    ind = i;
                    break; 
                }
            }
        }
    }
}

public class StringM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String a = in.nextLine();
        System.out.println("Enter the second string: ");
        String b = in.nextLine();

        Str s = new Str(a,b);
        if (s.f1 == 1) {
            System.out.println("Match found at " + s.ind + ".");
        } else {
            System.out.println("Match not found.");
        }
    }
}
