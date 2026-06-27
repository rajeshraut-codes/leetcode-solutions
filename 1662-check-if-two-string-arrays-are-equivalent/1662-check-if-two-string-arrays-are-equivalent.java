class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sb=new String();
        String st=new String();
        for(int i=0; i<word1.length;i++ ){
            sb=sb.concat(word1[i]);
        }
        for(int j=0; j<word2.length;j++ ){
            st=st.concat(word2[j]);
        }
        return sb.equals(st);
    }
}