import java.util.*;
class Point{
    int a, b;
    Point(int a, int b){
        this.a = a;
        this.b = b;
    }
}
public class Closestpair{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of points: ");
        int n = in.nextInt();
        Point p[] = new Point[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter "+(i+1)+" point: ");
            int a = in.nextInt();
            int b = in.nextInt();
            p[i] = new Point(a, b);
        }
        double min = Double.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            int count = 0;
            for(int j=i+1; j<n; j++){
                double ai = Math.pow((p[i].a - p[j].a), 2);
                double bi = Math.pow((p[i].b - p[j].b), 2);
                double d = Math.sqrt(ai + bi);
                if(d < min){
                    min = d;
                }
                else if(d == min){
                    System.out.println("Closest pair points are: ("+p[i].a+","+p[i].b+"),("+p[j].a+","+p[j].b+")");
                    count = 1;
                    break;
                }
            }
            if(count != 0){
                break;
            }
        }
        System.out.println("Minimum distance b/w two points: "+min+".");
    }
}