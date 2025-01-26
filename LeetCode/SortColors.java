import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Enter the number of elements
        int n = in.nextInt();
        int[] nums = new int[n];

        //Enter the elements (0, 1, or 2)
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        SortColors s = new SortColors();
        s.sortColors(nums);

        //Sorted colors
        for (int i = 0; i < nums; i++) {
            System.out.print(num + " ");
        }
        System.out.println();
        in.close();
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}