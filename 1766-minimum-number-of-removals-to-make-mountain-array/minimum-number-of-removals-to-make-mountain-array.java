class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        for(int i=0;i<n;i++){
            int j=i-1;
            pre[i]=1;
            while(j>=0){
                if(nums[j]<nums[i] && pre[i]<pre[j]+1){
                    pre[i]=pre[j]+1;
                }
                j--;
            }
            
        }  
        for(int i=n-1;i>=0;i--){
            int j=i+1;
            suf[i]=1;
            while(j<n){
                if(nums[j]<nums[i] && suf[i]<suf[j]+1){
                    suf[i]=suf[j]+1;
                }
                j++;
            }
            
        }
        
        int max=0;
        for(int i=0;i<n;i++){
            if(pre[i]==1 || suf[i]==1){
                continue;
            }
            max=Math.max(max,pre[i]+suf[i]-1);
        }
        
        return nums.length-max;
    }
}