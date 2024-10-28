class Solution {
    public int longestSquareStreak(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);

        int maxStr = 0;

        for(int num : nums) {
            int root = (int) Math.sqrt(num);

            if(root*root == num && map.containsKey(root)){
                map.put(num,map.get(root)+1);
            }
            else {
                map.put(num,1);
            }
            maxStr = Math.max(maxStr, map.get(num));
        }
        return maxStr < 2 ? -1 :maxStr;
    }
}