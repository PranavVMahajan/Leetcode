class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int shiftidx = 0;
        for(int i=0;i<n;i++) {
            if( i<n-1 && nums[i]== nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[shiftidx];
                nums[shiftidx] = temp;
                shiftidx++;
            }

        }
        return nums;
    }
}