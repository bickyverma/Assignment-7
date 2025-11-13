//2. Target Sum (LeetCode 494) 
// Link: https://leetcode.com/problems/target-sum/description/ 
// Objective: Count the number of ways to assign + or - to reach the target sum. 
// Requirements: - Write Recursive Solution - Write Memoization Solution - Write Tabulation Solution

public class Q1 {
    class Solution{
    public int findTargetSumWays(int [] nums, int target){
        return helper(nums, 0, 0 ,target);
    }
    private int helper(int[] nums, int ind, int sum, int target){
        if(ind == nums.length){
            return(sum == target) ? 1:0;
        }

        int add = helper(nums, ind + 1, sum + nums[ind], target);
        int minus = helper(nums, ind + 1, sum - nums[ind], target);

        return add + minus;
    }
}
}


//tabulation

// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         int total = 0;
//         for (int n : nums) total += n;

//         if (Math.abs(target) > total) return 0;
//         if ((total + target) % 2 != 0) return 0;
//         int P = (total + target) / 2;
//         if (P < 0) return 0;

//         int[] dp = new int[P + 1];
//         dp[0] = 1; 

//         for (int num : nums) {
//       
//             for (int j = P; j >= num; j--) {
//                 dp[j] += dp[j - num];
//             }
//         }
//         return dp[P];
//     }
// }
