// 5. House Robber II (LeetCode 213) 
// Link: https://leetcode.com/problems/house-robber-ii/

import java.util.Arrays;

public class Q3 {
    class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; 

        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = helper(nums, 0, n - 2, dp1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = helper(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }

    private int helper(int[] nums, int start, int end, int[] dp) {
        return robRange(nums, start, end, start, dp);
    }

    private int robRange(int[] nums, int i, int end, int start, int[] dp) {
        if (i > end) return 0;
        if (dp[i] != -1) return dp[i];

        int rob = nums[i] + robRange(nums, i + 2, end, start, dp);
        int skip = robRange(nums, i + 1, end, start, dp);

        dp[i] = Math.max(rob, skip);
        return dp[i];
    }
}

}
