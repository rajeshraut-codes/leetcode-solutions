class Solution {
    public int subsetXORSum(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < ((int)Math.pow(2,nums.length)); i++) {
            int subsetXor = 0;
            for (int j = 0; j < nums.length; j++) 
            {
                if ((i & (1 << j)) != 0) 
                {
                    subsetXor ^= nums[j];
                }
            }
            totalSum += subsetXor;
        }
        return totalSum;
    }
}