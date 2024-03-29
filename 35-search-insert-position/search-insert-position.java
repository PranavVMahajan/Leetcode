class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int i=0;i<nums.length;i++) { 
            if(nums[i]==target) {
                return i;
            }
            if (i == 0 && target < nums[i]) 
                return i; 
            if (i > 0 && target > nums[i-1] && target < nums[i])
                return i; 
            count++;
        }
        return count;
    }
}