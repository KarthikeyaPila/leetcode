class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(); 
        for(String str : strs) {
            sb.append("©" + str); 
        }

        return sb.toString(); 
    }

    public List<String> decode(String str) {
        
        List<String> res = new ArrayList<>(); 
        StringBuilder sb = new StringBuilder();
        if (str.length() == 0) {
            return res;
        }

        char[] chr = str.toCharArray(); 
    
        for (int i=1; i<chr.length; i++) {
            char ch = chr[i];
            if(ch != '©') {
                sb.append(ch);
            } else if (ch == '©') {
                res.add(sb.toString());
                sb.setLength(0); // resets the sb. 
            }
        }

        res.add(sb.toString());
        
        return res; 
    }
}
