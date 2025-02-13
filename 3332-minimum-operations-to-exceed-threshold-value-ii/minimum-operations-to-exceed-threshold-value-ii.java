class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int num:nums) {
            pq.add((long) num);
        }
        int count = 0;
        while(!pq.isEmpty() && pq.peek()<k) {
            long x = pq.poll();
            long y = pq.poll();

            pq.add(x*2+y);
            count++;
        }
        return count;
    }
}