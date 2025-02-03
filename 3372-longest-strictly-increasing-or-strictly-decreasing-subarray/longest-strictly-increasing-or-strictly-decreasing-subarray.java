class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int inCount = 1;
        int decCount = 1;
        int maxLen = 1;
        for(int i=1;i<n;i++) {
            if(nums[i]>nums[i-1]) {
                inCount++;
            }
            else {
                inCount = 1;
            }
            maxLen = Math.max(maxLen, inCount);
        }
        for(int i=1;i<n;i++) {
            if(nums[i]<nums[i-1]) {
                decCount++;
            }
            else {
                decCount = 1;
            }
            maxLen = Math.max(maxLen, decCount);
        }
        return maxLen;
    }
}