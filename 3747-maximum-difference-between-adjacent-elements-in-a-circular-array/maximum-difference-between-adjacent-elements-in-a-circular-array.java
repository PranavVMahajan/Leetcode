class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxAdj = 0;
        int n = nums.length;
        for(int i=1;i<n;i++){
            maxAdj = Math.max(maxAdj,Math.abs(nums[i]-nums[i-1]));
        }
        maxAdj = Math.max(maxAdj, Math.abs(nums[n - 1] - nums[0]));
        return maxAdj;
    }
}