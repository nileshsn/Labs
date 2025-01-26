import java.util.*;
class one{
    int count = 0;
    one(String a, String b){
        for(int i=0; i<a.length()-b.length()+1; i++){
            if(a.charAt(i) == b.charAt(0)){
                int f = 0;
                int skip = i;
                for(int j=0; j<b.length(); j++){
                    if(b.charAt(j) != a.charAt(skip)){
                        f = 1;
                        break;
                    }
                    skip+=2;
                }
                if(f == 0){
                    count++;
                }
            }
        }
    }
}
public class Skiponecount{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String a = in.nextLine();
        String b = in.nextLine();
        one o = new one(a,b);
        System.out.println("No of occurences of sub string when single char skipped :"+o.count+".");
    }
}