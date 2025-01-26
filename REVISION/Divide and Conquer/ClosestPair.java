import java.util.Scanner;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ClosestPair {
    static Point cp1, cp2;

    public static void merge(Point[] arr, int low, int mid, int high) {
        Point[] b = new Point[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (arr[i].x <= arr[j].x) {
                b[k++] = arr[i++];
            } else {
                b[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            b[k++] = arr[i++];
        }
        while (j <= high) {
            b[k++] = arr[j++];
        }
        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = b[k];
        }
    }

    public static void mergeSort(Point[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static int bruteForce(Point[] p, int start, int end) {
        int min = Integer.MAX_VALUE;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                int distance = (p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y);
                if (distance < min) {
                    min = distance;
                    cp1 = p[i];
                    cp2 = p[j];
                }
            }
        }
        return min;
    }

    public static int closestPair(Point[] p, int start, int end) {
        if (end - start <= 3) {
            return bruteForce(p, start, end);
        }

        int mid = (start + end) / 2;
        int leftDist = closestPair(p, start, mid);
        int rightDist = closestPair(p, mid, end);

        int d = Math.min(leftDist, rightDist);

        Point[] s = new Point[end - start];
        int j = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(p[i].x - p[mid].x) < d) {
                s[j++] = p[i];
            }
        }

        return Math.min(d, stripClosest(s, j, d));
    }

    public static int stripClosest(Point[] s, int size, int d) {
        int min = d;
        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size && (s[j].y - s[i].y) < min; ++j) {
                int distance = (s[i].x - s[j].x) * (s[i].x - s[j].x) + (s[i].y - s[j].y) * (s[i].y - s[j].y);
                if (distance < min) {
                    min = distance;
                    cp1 = s[i];
                    cp2 = s[j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of points: ");
        int n = sc.nextInt();
        Point[] p = new Point[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the point %d as (x y): ", (i + 1));
            int x = sc.nextInt();
            int y = sc.nextInt();
            p[i] = new Point(x, y);
        }
        mergeSort(p, 0, n - 1);
        int minDist = closestPair(p, 0, n);
        System.out.println("The closest pair distance: " + minDist);
        System.out.println("Closest pair points are: (" + cp1.x + "," + cp1.y + "),(" + cp2.x + "," + cp2.y + ")");
        sc.close();
    }
}
