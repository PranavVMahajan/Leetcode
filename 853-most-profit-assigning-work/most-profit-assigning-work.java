class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2];
        
        // Combine difficulty and profit into a single array
        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        
        // Sort the jobs array by difficulty
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        // Sort the worker array
        Arrays.sort(worker);
        
        int maxProfit = 0;
        int bestProfit = 0;
        int j = 0;
        
        // Iterate over each worker
        for (int i = 0; i < worker.length; i++) {
            // Assign the best possible job for this worker
            while (j < n && worker[i] >= jobs[j][0]) {
                bestProfit = Math.max(bestProfit, jobs[j][1]);
                j++;
            }
            maxProfit += bestProfit;
        }
        
        return maxProfit;
    }
}