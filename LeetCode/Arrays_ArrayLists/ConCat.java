//2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)

import java.util.Scanner;

class ConCat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Enter Size.
        int n = in.nextInt();
        int nums[] = new int[n];
        //Enter Elements.
        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int ans[] = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        for(int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n = nums.length;
//         int ans[] = new int[2*n];
//         for(int i=0; i<n; i++){
//             ans[i] = nums[i];
//             ans[i+n] = nums[i];
//         }
//         return ans;
//     }
// }