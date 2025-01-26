import java.util.*;
class Point{
    int a, b;
    Point(int a, int b){
        this.a = a;
        this.b = b;
    }
}
public class Postoffice{
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
        ArrayList<Double> distance = new ArrayList<>();
        double min = Double.MAX_VALUE;
        for(int i=0; i<n; i++){
            double sum = 0;
            for(int j=0; j<n; j++){
                double ai = ((p[i].a - p[j].a) * (p[i].a - p[j].a));
                double bi = ((p[i].b - p[j].b) * (p[i].b - p[j].b));
                double d = Math.sqrt(ai + bi);
                sum += d;
            }
            distance.add(sum);
            if((sum) < min){
                min = sum;
            }
        }
        System.out.println("Minimum sum of distances: "+min);
        System.out.println("Distances from each point: "+distance);
        System.out.println("Best point to setup post office: ("+p[distance.indexOf(min)].a+", "+p[distance.indexOf(min)].b+")");
    }
}