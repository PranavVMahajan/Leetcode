class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyIndices = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }
        int j = 0; 
        for (int i = 0; i < nums.length; i++) {
            while (j < keyIndices.size() && keyIndices.get(j) < i - k) {
                j++;
            }
            if (j < keyIndices.size() && Math.abs(keyIndices.get(j) - i) <= k) {
                ans.add(i);
            }
        }

        return ans;
    }
}