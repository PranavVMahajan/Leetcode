class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        int lastSmall = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 0;

        for(int i=0;i<n;i++){
            if(nums[i] - 1 == lastSmall){
                cnt += 1;
                lastSmall = nums[i];
            }
            else if(nums[i] != lastSmall){
                cnt = 1;
                lastSmall  = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
        
    }
}