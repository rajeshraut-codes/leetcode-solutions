class Solution {
    public int reverseDegree(String s) {
        int idx = 1;
        int total = 0;
        for(char c : s.toCharArray()){
            int reversePos = 26 - (c - 'a');
            total += reversePos * idx;
            idx++;
        }
        return total;
    }
}