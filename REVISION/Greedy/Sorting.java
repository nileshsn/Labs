import java.util.Scanner;

class Knap {
    int[] wt;
    int[] val;
    double[] ratio;
    int n, w;

    public Knap(int n, int w) {
        this.n = n;
        this.w = w;
        wt = new int[n];
        val = new int[n];
        ratio = new double[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weights and values:");
        for (int i = 0; i < n; i++){
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) val[i] / wt[i];
        }
        bubbleSort();
    }

    void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ratio[j] < ratio[j + 1]) {
                    double tempRatio = ratio[j];
                    ratio[j] = ratio[j + 1];
                    ratio[j + 1] = tempRatio;

                    int tempWt = wt[j];
                    wt[j] = wt[j + 1];
                    wt[j + 1] = tempWt;

                    int tempVal = val[j];
                    val[j] = val[j + 1];
                    val[j + 1] = tempVal;
                }
            }
        }
    }

    int fks() {
        int v = 0;
        for (int i = 0; i < n; i++) {
            if (wt[i] <= w) {
                v += val[i];
                w -= wt[i];
            } else {
                v += (w / (double) wt[i]) * val[i];
                break;
            }
        }
        return v;
    }
}

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        System.out.println("Enter maximum weight:");
        int w = sc.nextInt();
        Knap k = new Knap(n, w);
        System.out.println("Maximum value we can obtain = " + k.fks());
    }
}
