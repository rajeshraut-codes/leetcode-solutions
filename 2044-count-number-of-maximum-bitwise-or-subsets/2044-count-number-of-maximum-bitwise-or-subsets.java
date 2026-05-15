class Solution 
{
    public int maxOr=0;
    public int count=0;
    public int countMaxOrSubsets(int[] nums){
        maxOr=0;
        for (int num : nums){
            maxOr |= num;
        }
        count = 0;
        backtrack(nums, 0, 0);
        return count;
    }
    public void backtrack(int[] nums, int index, int currentOr){
        if (index == nums.length){
            if (currentOr == maxOr) 
            {
                count++;
            }
            return;
        }
        backtrack(nums, index + 1, currentOr | nums[index]);
        backtrack(nums, index + 1, currentOr);
    }
}