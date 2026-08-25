class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int x = 0;
        for(int i = 0 ; i < nums.length; i++) {
            ans[i] = (i % 2 == 0) ? nums[x++] : nums[n++];
        }
        return ans;
    }
}