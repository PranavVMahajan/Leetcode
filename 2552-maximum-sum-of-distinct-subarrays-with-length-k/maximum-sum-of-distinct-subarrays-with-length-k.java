class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       int n = nums.length;
       int i = 0;
       int j = 0;
       long result = 0; 
       long currSum = 0;
       HashSet<Integer> set = new HashSet<>();
       while(j<n) {
        while(set.contains(nums[j])) {
            currSum -= nums[i];
            set.remove(nums[i]);
            i++;
        }
         currSum +=nums[j];
         set.add(nums[j]);

         if(j-i+1 == k) {
            result = Math.max(result,currSum);
            currSum -= nums[i];
            set.remove(nums[i]);
            i++;
         }
         j++;
       }
       return result;
    }
}