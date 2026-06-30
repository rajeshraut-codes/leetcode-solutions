class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        StringBuilder str = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i<sb.length() ; i++){
            char ch = sb.charAt(i);
            if(ch != ' '){
                str.append(ch);
            }else if(str.length()>0){
                str.reverse();
                ans.append(str);
                ans.append(' ');
                str.setLength(0);

            }
        }
        if(str.length() > 0){
            str.reverse();
            ans.append(str);
        }
        return ans.toString().trim();
    }
}