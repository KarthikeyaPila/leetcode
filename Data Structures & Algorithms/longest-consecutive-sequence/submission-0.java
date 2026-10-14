class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>(); 

        for(int num : nums) {
            map.add(num);
        }

        int max=0; 
        for(int num : map) {
            int count=0; 
            if(!map.contains(num-1)) {
                int k = num;
                while(map.contains(k++)) {
                    count++; 
                }

                max = Math.max(count, max);
            }
        }

        return max;
    }
}
