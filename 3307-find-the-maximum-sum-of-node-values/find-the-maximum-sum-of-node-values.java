class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        List<Integer> list = new ArrayList<>();
        long normalSum = 0;

        for (int num : nums) {
            list.add((num ^ k) - num);
            normalSum += (long) num;
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size() - 1; i += 2) {
            long pairSum = list.get(i) + list.get(i + 1);

            if (pairSum > 0) {
                normalSum += pairSum;
            }
        }
        return normalSum;
    }
}