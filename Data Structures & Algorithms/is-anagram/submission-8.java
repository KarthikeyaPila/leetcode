class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> hs1 = new HashMap<>(); 
        Map<String, Integer> hs2 = new HashMap<>(); 

        char[] s1 = s.toCharArray(); 
        char[] t1 = t.toCharArray(); 

        int len = s.length() > t.length() ? s.length() : t.length(); 
        for(int i=0; i<len; i++) {
            if(i < s.length()) {
                String si = String.valueOf(s1[i]);
                hs1.put(si, hs1.getOrDefault(si, 0) + 1); 
            }
            
            if(i < t.length()) {
                String ti = String.valueOf(t1[i]);
                hs2.put(ti, hs2.getOrDefault(ti, 0) + 1);
            }
        }

        if(hs1.equals(hs2)) {
            return true; 
        }

        return false; 
    }
}
