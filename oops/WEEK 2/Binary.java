//3. Write a Java program to implement binary search.
import java.util.Scanner;

class BinarySearch {
    
    int bsearch(int a[], int key) {
        int first = 0;
        int last = a.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (a[mid] == key) {
                return mid; // Element found, return index
            } else if (a[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1; // Element not found
    }
}

class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = in.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the sorted elements:");
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }

        System.out.print("Enter the key to search: ");
        int key = in.nextInt();

        BinarySearch search = new BinarySearch();
        int result = search.bsearch(a, key);

        if (result != -1) {
            System.out.println("Element is found at index: " + result);
        } else {
            System.out.println("Element is not found!");
        }
    }
}














/*class BinarySearch {
    
    void bsearch (int a[], int first, int last, int key)
    {
        int mid = (first+last)/2;
        while (first<=last)
        {
            if (a[mid]<key)
            {
                first = mid+1;
            }
            else if(a[mid]==key)
            {
                System.out.println("Element is found at index:"+mid);
                break;
            }
            else
            {
                last=mid+1;
                mid=(first+last)/2;
            }
            if (first>last)
            {
                System.out.println("Element is not found!");
            }
        }
    }
}

class Binary {
    public static void main(String[] args) {
       

        int a[]= {1, 2, 3, 4, 5, 6, 7};
        int key = 7;
        int last = a.length-1;
    
        BinarySearch search = new BinarySearch();
        search.bsearch(a,0,last, key);

    }
}
*/

