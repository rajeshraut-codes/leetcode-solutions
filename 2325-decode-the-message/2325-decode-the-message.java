class Solution{
    public String decodeMessage(String key, String message){
        Map <Character,Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char curr = 'a';
        for(char ch:key.replaceAll(" ","").toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,curr++);
            }
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){   
                sb.append(' ');
            }
            else{
                sb.append(map.get(message.charAt(i)));
            }
        }
        return sb.toString();
    }
}