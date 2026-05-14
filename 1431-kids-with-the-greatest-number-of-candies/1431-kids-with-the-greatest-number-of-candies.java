class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        int n=candies.length;
        ArrayList<Boolean> y=new ArrayList<>(n);
        int c=0;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
                c=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i==c){
                y.add(c,true);
                continue;
            }
            else if((candies[i]+extraCandies)>=max){
                y.add(i,true);
            }
            else{
                y.add(i,false);
            }
        }
        return y;
    }
}