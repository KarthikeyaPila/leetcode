class Solution {
    public int[] twoSum(int[] nums, int target) { 

        Map<Integer, Integer> hs = new HashMap<>(); 

        for(int i=0; i<nums.length; i++) {
            // Integer val1 = Integer.valueOf(nums[i]);
            // Integer val2 = Integer.valueOf(target - nums[i]);
            // hs.put(val1, i);
            // boolean exists = hs.containsKey(val1) && hs.containsKey(val2);
            // if(exists && !hs.get(val1).equals(hs.get(val2))) {
            //     return new int[] {i, hs.get(val2)};
            // }

            int complement = target - nums[i];

            if (hs.containsKey(complement)) {
                return new int[] { hs.get(complement), i };
            } else {
                hs.put(nums[i], i);
            }

        }

        return new int[] {0,1};
    }
}
