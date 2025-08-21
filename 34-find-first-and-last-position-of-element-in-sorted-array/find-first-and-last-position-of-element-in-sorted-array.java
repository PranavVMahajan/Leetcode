class Solution {
    public int lowerB(int[] nums, int target){
        int ans = -1;
        int st = 0,end = nums.length-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(nums[mid] >= target){
                end = mid -1;
                if(nums[mid] == target) ans = mid;
            }
            else {
                st = mid +1;
            }
        }
        return ans; 
    }
    public int UpperB(int[] nums, int target){
        int ans = -1;
        int st = 0,end = nums.length-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(nums[mid] <= target){
                st = mid +1;
                if(nums[mid] == target) ans = mid;
            }
            else {
                end = mid -1;
            }
        }
        return ans; 
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[]{lowerB(nums,target),UpperB(nums,target)};
        return ans;
        
    }
}