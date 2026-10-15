class Solution {
    public int trap(int[] height) {
        if(height == null || height.length < 3) {
            return 0;
        }

        int l = 0;
        int r = height.length - 1;
        int lmax = 0;
        int rMax = 0;
        int water = 0;

        while(l < r) {
            
            if(height[l] < height[r]) {
                if(height[l] >= lmax) {
                    lmax = height[l];
                } else {
                    water += lmax - height[l]; 
                }
                l++;
            } else {
                if (height[r] >= rMax) {
                    rMax = height[r]; 
                } else {
                    water += rMax - height[r];
                }
                r--;
            }
        }

        return water;
    }
}
