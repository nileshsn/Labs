// import java.util.*;

// class Binary {
//     int[] a;
//     int n;

//     public Binary(int n) {
//         this.n = n;
//         a = new int[n];
//     }

//     void fill(int n, int k) {
//         if (k == n) {
//             for (int i = 0; i < n; i++) {
//                 System.out.print(a[i]);
//             }
//             System.out.println();
//             return;
//         }
//         for (int i = 0; i <= 1; i++) {
//             a[k] = i;
//             fill(n, k + 1);
//         }
//     }
// }

// public class Btbinary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         Binary b = new Binary(n);
//         b.fill(n, 0);
//         sc.close();
//     }
// }

import java.util.*;

class Binary {
    int[] a;
    int n;

    public Binary(int n) {
        this.n = n;
        a = new int[n];
    }

    void fill(int n, int k) {
        if (k == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i <= 1; i++) {
            if (k == 0 || a[k-1] == 0 || i == 0) { 
                a[k] = i;
                fill(n, k + 1);
            }
        }
    }
}

public class Btbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        Binary b = new Binary(n);
        b.fill(n, 0);
        sc.close();
    }
}
