import java.util.*;
class str{
    int f1;
    str(String a, String b){
        f1 = -1;
        for(int i=0; i<=a.length()-b.length(); i++){
            if(a.charAt(i) == b.charAt(b.length() - 1)){
                int f = 0;
                for(int j=0; j<b.length(); j++){
                    if(a.charAt(i+j) != b.charAt(b.length() - 1 - j)){
                        f = 1;
                        break;
                    }
                }
                if(f == 0){
                    f1 = i;
                    break;
                }
            }
        }
    }
}
public class StringR{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String a = in.nextLine();
        System.out.println("Enter second string: ");
        String b = in.nextLine();
        str s = new str(a,b);
        if(s.f1!=-1){
            System.out.println("Reverse of substring is found at "+s.f1+".");
        }else{
            System.out.println("Reverse is not found.");
        }
        in.close();
    }
}