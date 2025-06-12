class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxAdj = 0;
        int n = nums.length;
        for(int i=1;i<n+1;i++){
            maxAdj = Math.max(maxAdj,Math.abs(nums[(i-1)%n]-nums[i%n]));
        }
        return maxAdj;
    }
}