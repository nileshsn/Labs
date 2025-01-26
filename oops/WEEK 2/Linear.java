//2. Write a Java program to implement linear search.
import java.util.Scanner;

class LinearSearch {
    int a[];
    int key;
    int n;

    LinearSearch(int size) {
        a = new int[size];
        n = size;
    }

    int lsearch() {
        for (int i = 0; i < n; i++) {
            if (key == a[i]) {
                return i;
            }
        }
        return -1;
    }
}

class Linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = in.nextInt();

        LinearSearch search = new LinearSearch(size);

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            search.a[i] = in.nextInt();
        }

        System.out.print("Enter the key to search: ");
        search.key = in.nextInt();

        int res = search.lsearch();

        if (res != -1) {
            System.out.println(search.key + " is present at index: " + res);
        } else {
            System.out.println(search.key + " is not present.");
        }
    }
}














/*class LinearSearch {
    int a[] = {3, 6, 8, 1, 10, 5};
    int key = 1;
    int n = a.length;
    int lsearch()
    {
        for (int i=0; i<n; i++)
        {
            if (key==a[i])
            {
                return i;
            }
        }
        return -1;
    }
}
class Linear {
    public static void main(String[] args) {
        int res;
        LinearSearch search = new LinearSearch();
        res = search.lsearch();
        System.out.println("1 is present at index:"+res);
    }
}*/

