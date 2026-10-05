class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int len = nums.length; 

        // for(int i=0; i<len-1; i++) {
        //     if(nums[i] == nums[i+1]){
        //         return true; 
        //     }
        // }

        // return false; 



        Map <Integer, Integer> hs = new HashMap<>();  

        for(int i=0; i<nums.length; i++) {
            Integer key = nums[i];
            if(hs.containsKey(key) == true){
                return true; 
            }

            hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1);
            // if(hs.get(nums[i]).equals(2)) {
            //     return true; 
            // }
        }

        return false; 
    }
}