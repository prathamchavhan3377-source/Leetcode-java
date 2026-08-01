class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int currentmax = nums[0];
        int currentmin=nums[0];
        int n = nums.length;

        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=currentmax;
                currentmax=currentmin;
                currentmin=temp;
            }
            currentmax = Math.max(nums[i],nums[i]*currentmax);
            currentmin = Math.min(nums[i],nums[i]*currentmin);
            max = Math.max(currentmax , max );
        }
        return max;
    }
}