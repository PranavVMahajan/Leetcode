class Solution {
    // O(N)time
// O(1)space
public int numberOfSubarrays(int[] nums, int k) {
    int[] r  = new int[2];
    int res = 0;
    int pre = 0, cur = 0;
    for(int i = 0; i < nums.length; i++){
        r[nums[i] & 1]++;
        if(r[1] == k){
            pre = cur;
        }
        while(r[1] == k){
            r[nums[cur] & 1]--;
            cur++;
        }    
        res += cur - pre;
    }
    return res;
    }
}