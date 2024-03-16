class Solution {
    public int binarySearch(int[] nums, int target) {
        int f = 0;
        int l = nums.length-1;
        if (target<nums[f]) return 0;
        if (target>nums[l]) return nums.length;
        while (f < l) {
            int m = f + (l - f) / 2;
            if (nums[m] == target) {
                return m;
            }if (target > nums[m]) {
                f = m + 1;
            }else {
                l=m;
            }
        }
        return f;
    }
    public int searchInsert(int[] nums, int target) {
        int a=binarySearch(nums,target);
        return a;
    }
}