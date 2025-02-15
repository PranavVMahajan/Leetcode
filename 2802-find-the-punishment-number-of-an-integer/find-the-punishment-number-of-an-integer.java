class Solution {
    public int punishmentNumber(int n) {
        int punish = 0;
        for(int i=1;i<=n;i++) {
            int sqr = i*i;
            if(canPartition(sqr,i,0)) {
                punish += sqr;
            }
        }
        return punish;
    }

    public boolean canPartition(int num, int target, int sum) {
        if(num == 0) return sum == target;

        int part = 0, factor = 1;
        while(num>0) {
            part = (num %10) * factor + part;
            num /= 10;
            if( sum+part >target) break;
            if(canPartition(num,target,sum+part)) return true;
            factor *= 10;
        }
        return false;
    }
}