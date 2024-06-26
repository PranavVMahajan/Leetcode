class Solution {
    int result;
    int K;
    public void dfs(int nums[],int idx,Map<Integer,Integer> mp) {
        if(idx == nums.length) {
            result++;
            return;
        }
        //not_take
        dfs(nums,idx+1,mp);

        //take
        if(!mp.containsKey(nums[idx]-K) && !mp.containsKey(nums[idx]+K)) {
            mp.put(nums[idx],mp.getOrDefault(nums[idx],0)+1);
            dfs(nums,idx+1,mp);
            mp.put(nums[idx],mp.get(nums[idx])-1);

            // Remove the key if its count drops to 0 
            if(mp.get(nums[idx]) == 0) {
                mp.remove(nums[idx]);
            }
        }
    }
    public int beautifulSubsets(int[] nums, int k) {
        result = 0;
        K = k;
        Map<Integer, Integer> mp = new HashMap<>();
        dfs(nums,0,mp);
        return result-1;// -1 because we don't want to count the empty subset in the resul 
    }
}