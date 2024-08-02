class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int Windcount = 0;
        for(int num : nums) {
            Windcount += num;
        }
        int curZeros = 0 ;
        for(int i=0;i<Windcount;i++) {
            if(nums[i] == 0) {
                curZeros++;
            }
        }
        int minZero = curZeros;
        int st =0;
        int end = Windcount-1;
        while(st<n) {
            if(nums[st]==0) {
                curZeros--;
            }
            st++;
            end++;
            if(nums[end%n]== 0) {
                curZeros++;
            }
            minZero = Math.min(minZero,curZeros);
        }
        return minZero;
    }
}