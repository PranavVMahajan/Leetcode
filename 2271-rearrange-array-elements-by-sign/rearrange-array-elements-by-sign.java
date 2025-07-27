class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ar1[] = new int[n/2];
        int ar2[] = new int[n/2];
        int p = 0,q = 0;

        for(int num:nums){
            if(num>0){
                ar1[p++] = num;
            }
            else{
                ar2[q++] = num;
            }
        }
        int i=0,j=0,k=0;
        while(i<n){
            nums[i++] = ar1[j++];
            nums[i++] = ar2[k++];
        }
        return nums;
    }
}