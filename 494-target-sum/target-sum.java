class Solution {
    private int[][] t;

    private int subsetSum(int[] nums, int n, int s) {
        if (t[n][s] != -1) {
            return t[n][s];
        }
        if (s == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (nums[n - 1] == 0) {
            return t[n][s] = subsetSum(nums, n - 1, s);
        }
        if (nums[n - 1] <= s) {
            return t[n][s] = subsetSum(nums, n - 1, s - nums[n - 1]) + subsetSum(nums, n - 1, s);
        } else {
            return t[n][s] = subsetSum(nums, n - 1, s);
        }
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        long zeros = Arrays.stream(nums).filter(x -> x == 0).count();

        if (target > sum) {
            return 0;
        }
        if ((sum - target) % 2 != 0) {
            return 0;
        }

        int s1 = (sum - target) / 2;
        t = new int[nums.length + 1][s1 + 1];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        return (int) Math.pow(2, zeros) * subsetSum(nums, nums.length, s1);
    }
}
