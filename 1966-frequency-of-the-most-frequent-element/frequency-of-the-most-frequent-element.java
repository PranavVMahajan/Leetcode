class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;
        int n = nums.length;
        int l = 0, res = 1;
        for(int r=0;r<n;r++){
            total += nums[r];
            while((long) nums[r] * (r - l + 1) - total > k){
                total -= nums[l];
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}