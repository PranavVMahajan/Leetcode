class Solution {
    public int maxAscendingSum(int[] nums) {
        int n =  nums.length;
        int sum = 0;
        int count = nums[0];
        if(n == 0) return 0;
        for(int i=1;i<n;i++) {
            if(nums[i]>nums[i-1]) {
                count = nums[i] + count;
            }
            else {
                sum = Math.max(sum,count);
                count = nums[i] ;
            } 
        }
        return Math.max(sum,count); 
    }
}