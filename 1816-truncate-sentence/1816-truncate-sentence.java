class Solution {
    public String truncateSentence(String s, int k) {
        int c=0;
        String[] w=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String m: w){
            sb.append(m);
            c++;
            if(c==k){
                break;
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}