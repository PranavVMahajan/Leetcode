class Solution {
    public void rotate(int[] nums, int k) {
        int s=nums.length;
        int[] temp = new int[s];
        for(int i =0;i<s;i++) {
            temp[(i+k)%s]=nums[i];
        }
        for(int i=0;i<s;i++){
            nums[i]=temp[i];
        }
     }
}