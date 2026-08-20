class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int add=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    ans[add]=order[i];
                    add++;
                }
            }
        }
        return ans;
    }
}