class Solution {
    public int findMax(int score[] ) {
        int max = Integer.MIN_VALUE;
        for(int element :score) {
            max = Math.max(element,max);
        }
        return max;
    }
    public String[] findRelativeRanks(int[] score) {
        int maxVal = findMax(score);
        int map[] = new int[maxVal +1];
        int n = score.length;
        for(int i = 0;i<n;i++) {
            map[score[i]] = i+1; //+1 to distinguish b/w not present and index 0
        }
        String res[] = new String[n];
        int rank = 1;
        for(int i = maxVal;i>=0;i--) {
            if(map[i] != 0) {
                int originalIdx = map[i]-1; //-1 to get original index 
                if(rank == 1) {
                    res[originalIdx] = "Gold Medal";
                }
                else if(rank == 2) {
                    res[originalIdx] = "Silver Medal";
                }
                else if(rank == 3) {
                    res[originalIdx] = "Bronze Medal";
                }
                else {
                    res[originalIdx] = Integer.toString(rank);
                }
                rank++;
            }
            if(rank>n) {
                break;
            }
        }
        return res;
    }
}