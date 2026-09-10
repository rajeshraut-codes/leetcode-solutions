class Solution {
    public long countCommas(long n){
        long ans=0L;
        long k=1000L;
        while (n>=k){
            ans+=(n-k+1);
            k*=1000L;
        }
        return ans;
    }
}