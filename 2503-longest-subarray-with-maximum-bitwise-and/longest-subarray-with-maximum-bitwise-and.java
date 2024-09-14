class Solution {
    public int longestSubarray(int[] nums) {
        int maxNo = 0;
        for(int i=0;i<nums.length;i++) {
            maxNo = Math.max(nums[i],maxNo);
        }
        int cnt = 0;
        int ans = 1;
        for(int i =0;i<nums.length;i++) {
            if(nums[i] == maxNo) {
                cnt++;
            }
            else {
                cnt = 0;
            }
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}