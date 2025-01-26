import java.util.*;
class one{
    int f1;
    one(String a, String b){
        f1 = -1;
        for(int i=0; i<a.length()-b.length(); i++){
            if(a.charAt(i) == b.charAt(0)){
                int f = 0;
                int skip = 0;
                for(int j=0; j<b.length(); j++){
                    if(b.charAt(j) == a.charAt(i+j+skip)){
                        f++;
                    }
                    skip++;
                }
                if(f == b.length()){
                    f1 = i;
                    break;
                }
            }
        }
    }
}
public class Skipone{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String a = in.nextLine();
        String b = in.nextLine();
        one o = new one(a,b);
        if(o.f1 != -1){
            System.out.println("Match found at "+o.f1+".");
        }else{
            System.out.println("Match not found.");
        }
    }
}