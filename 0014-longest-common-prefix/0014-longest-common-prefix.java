class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        int count=0;
        while(count < a.length() && count < b.length()){
            if(a.charAt(count)==b.charAt(count)){
                count++;
            } else{
                break;
            }
        }
        return a.substring(0, count);
    }
}