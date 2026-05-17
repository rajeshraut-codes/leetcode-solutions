class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0;
        int n = nums.length;
        for(int num:nums){
            total = total + num;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            int val = nums[i];
            if(i==0||i==n-1){
                nums[i] = Math.abs(total-nums[i]);
            }else{
                nums[i] = Math.abs(sum-(total - sum - nums[i]));
            }
            sum = sum+val;
        }
        return nums;
    }
}