// 4. House Robber (LeetCode 198) 
// Link: https://leetcode.com/problems/house-robber/

import java.util.Arrays;

public class Q2 {
    class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }

    private int helper(int[] nums, int i, int[] dp) {
        if (i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];

        int rob = nums[i] + helper(nums, i + 2, dp);

        int skip = helper(nums, i + 1, dp);

        dp[i] = Math.max(rob, skip);
        return dp[i];
    }
}





        // int even = 0;
        // int odd = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(i % 2 == 0){
        //         even += nums[i];
        //     }else{
        //         odd += nums[i];
        //     }
        // }
        // int ans = Math.max(even, odd);
        // return ans;
}
