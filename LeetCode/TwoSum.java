// // Given an array of integers nums and an integer target, 
// // return indices of the two numbers such that they add up to target.

// import java.util.*;
// class TwoSum {
//     public int[] twoSum(int[] nums, int target) {
//         // Logic 
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]+nums[j] == target){
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         return new int[] {};
//     }
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         // Enter size of array
//         int n = in.nextInt();
//         // Initialize 
//         int nums[] = new int[n];
//         // Enter the array values
//         for(int i=0; i<n; i++){
//             nums[i] = in.nextInt();
//         }
//         // Enter target value
//         int target = in.nextInt();
//         // Create object and call
//         TwoSum s = new TwoSum();
//         int[] index = s.twoSum(nums, target);
//         // Print Results
//         if(index.length == 2){
//             System.out.println("["+index[0]+","+index[1]+"]");
//         }
//         else{
//             System.out.println("No Solution.");
//         }
//     }
// }


//Using Hashing (Better Solution)
import java.util.HashMap;
import java.util.Map;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Create a hash map to store numbers and their indices
        int n = nums.length;
        for (int i = 0; i < n; i++) { // Iterate through the array
            int x = nums[i]; // Get the current number
            int y = target - x; // Calculate the complement needed to reach the target
            if (map.containsKey(y)) { // Check if the complement exists in the hash map
                return new int[] { map.get(y), i }; // return "YES";  // If the complement exists, return the indices of the complement and the current number
            }
            map.put(x, i);// If the complement doesn't exist, add the current number and its index to the hash map
        }
        return new int[] { -1, -1 }; // return "NO"; // If no solution is found, return an array with -1 and -1
    }
    public static void main(String[] args) {
           // Example usage:
           int[] nums = {2, 7, 11, 15};
           int target = 17;
           TwoSum s = new TwoSum();
           int[] ind = s.twoSum(nums, target);
           System.out.println("Indices: [" + ind[0] + ", " + ind[1] + "]");
       }
} 