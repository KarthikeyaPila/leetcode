class Solution {

    public static int binarySearch(int l, int r, int[] arr, int tar) {
        if(l > r) {
            return -1;
        }

        int mid = (l + r) / 2;

        if(arr[mid] == tar) {
            return mid;
        }

        if(arr[mid] > tar) {
            return binarySearch(l, mid-1, arr, tar);
        } else {
            return binarySearch(mid+1, r, arr, tar);
        }
    }

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length-1, nums, target);
    }
}
