import java.util.*;
class one{
    int count;
    int ind;
    one(String a, String b){
        count = 0;
        ind = -1;
        for(int i=0; i<a.length()-b.length(); i++){
            if(a.charAt(i) == b.charAt(0)){
                int f = 0;
                int skip = 1;
                int k = i;
                for(int j=0; j<b.length(); j++){
                    skip += 1;
                    if(b.charAt(j) != a.charAt(k)){
                        f = 1;
                        break;
                    }
                    k = k+skip;
                }
                if(f == 0){
                    ind = i;
                    count++;
                }
            }
        }
    }
}
public class Skipmulti{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String a = in.nextLine();
        String b = in.nextLine();
        one o = new one(a,b);
        if(o.count > 0){
            System.out.println("Match found at "+o.ind+"."); 
            System.out.println("Count is: "+o.count+".");
        }else{
            System.out.println("Match not found.");
        }
    }
}