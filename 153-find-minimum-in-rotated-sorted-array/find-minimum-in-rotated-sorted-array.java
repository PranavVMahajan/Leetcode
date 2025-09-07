class Solution {
    public int findMin(int[] nums) {
        int st =0,end=nums.length-1;
        int min = Integer.MAX_VALUE;
        while(st<=end){
            int mid = (st+end)/2;
            if(nums[st]<=nums[mid]){
                min=Math.min(nums[st],min);
                st=mid+1;
            }
            else{
                min=Math.min(nums[mid],min);
                end = mid-1;
            }
        }
        return min;
    }
}