import java.util.ArrayList;
import java.util.*;

public class UniqueSort{
    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<>();

        System.out.println("Enter 5 Elements: ");
        Scanner in = new Scanner(System.in);
        for(int i=0; i<5; i++){
            int n = in.nextInt();
            if(!temp.contains(n)){
                temp.add(n);
            }
        }
        Collections.sort(temp);
        System.out.println(temp);
    }
}