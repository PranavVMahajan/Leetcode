class Solution {
    public int findMaxK(int[] nums) {
       int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            int alternate = i*(-1);
            if (set.contains(alternate)) {
                if (Math.abs(alternate) > max) max = Math.abs(alternate);
            }
            set.add(i);
        }
        return max == Integer.MIN_VALUE ? -1 : max; 
    }
}