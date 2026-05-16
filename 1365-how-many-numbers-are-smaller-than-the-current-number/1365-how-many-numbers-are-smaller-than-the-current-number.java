class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; 
        int n = nums.length;
        for (int num : nums) count[num]++;
        int[] smallerCount = new int[101];
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            smallerCount[i] = sum; 
            sum += count[i];  
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = smallerCount[nums[i]];
        }  
        return result;
    }
}