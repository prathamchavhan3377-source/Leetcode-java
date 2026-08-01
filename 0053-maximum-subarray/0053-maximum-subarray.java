class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int current = nums[0] ;
        int n=nums.length ;
        for(int i=1;i<n ;i++){
            current = Math.max(nums[i] , current + nums[i]);
            maxsum = Math.max( maxsum , current);
        }  
        return maxsum;  
    }
}