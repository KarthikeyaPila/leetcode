class Solution {
    public boolean isValid(String s) {
        Deque<String> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++) {
            String cur = String.valueOf(s.charAt(i));
            if (cur.equals("(") || cur.equals("{") || cur.equals("[")) {
                stack.push(cur);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                String top = stack.pop(); 
                
                if (cur.equals(")") && !top.equals("(")) return false;
                else if (cur.equals("}") && !top.equals("{")) return false;
                else if (cur.equals("]") && !top.equals("[")) return false;
            }
        }

        return stack.isEmpty();
    }
}
