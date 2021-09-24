package no198_rob;

public class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int[] dp=new int[n];
        dp[0]=nums[0];
        if(n==1){
            return dp[0];
        }
        dp[1]=Integer.max(nums[0],nums[1]);
        if(n==2){
            return dp[1];
        }
        for(int i=2;i<n;i=i+1){
            dp[i]=Integer.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        Solution solution=new Solution();
        System.out.println(solution.rob(nums));
    }
}
