class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hs = new HashMap<>(); 

        for(int el : nums) {
            hs.put(el, hs.getOrDefault(el, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(hs.keySet());
        Collections.sort(list, (a,b) -> hs.get(b) - hs.get(a));

        int[] res = new int[k];

        for(int i=0; i<k; i++) {
            res[i] = list.get(i);
        }

        return res; 
    }
}
