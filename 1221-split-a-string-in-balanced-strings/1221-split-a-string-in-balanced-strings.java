class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length(), count=0, r=0;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == 'R') {
                r++;
            } else {
                r--;
            }
            if(r==0){
                count++;
            }
        }
        return count;
    }
}