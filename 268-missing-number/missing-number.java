class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n+1];
        for(int i=0;i<n;i++){
            temp[nums[i]]++;
        }
        for(int i=0;i<=n;i++){
            if(temp[i] == 0){
                return i;
            }
        }
        return -1;
    }
}