class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int ans = -1;
        int st = 0,end = n-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(nums[mid] == target){
                ans = mid;
            }
            if(nums[st]<=nums[mid]){
                if(nums[st]<=target && target<=nums[mid]){
                    end = mid-1;
                }
                else {
                    st = mid+1;
                }
            }
            else {
                if(nums[mid]<=target && target<=nums[end]){
                    st = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return ans;
    }
}