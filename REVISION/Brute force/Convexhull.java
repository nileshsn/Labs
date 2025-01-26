import java.util.*;

class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Convexhull {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of points: ");
        int n = in.nextInt();
        Point[] p = new Point[n];
        System.out.println("Enter the points:");
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            p[i] = new Point(x, y);
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = p[j].y - p[i].y;
                int b = p[i].x - p[j].x;
                int c = p[i].x * p[j].y - p[i].y * p[j].x;
                
                int positivep = 0;
                int negativep = 0;
                
                for (int k = 0; k < n; k++) {
                    int val = a * p[k].x + b * p[k].y - c;
                    if (val > 0) {
                        positivep++;
                    } else if (val < 0) {
                        negativep++;
                    }
                }
                
                if (positivep == 0 || negativep == 0) {
                    System.out.println("(" + p[i].x + "," + p[i].y + ") (" + p[j].x + "," + p[j].y + ") are edge points");
                }
            }
        }
        
        in.close();
    }
}
