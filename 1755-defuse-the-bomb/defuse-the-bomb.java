class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans[] = new int[n];
        int st = 0;
        int end = 0;
        if(k==0){
            return ans;
        }
        if(k>0){
            st=1;
            end=k;
        }
        else {
            st = n-Math.abs(k);
            end = n-1;
        }
        int sum = 0;
        for(int i=st;i<=end;i++) {
            sum += code[i]; 
        }

        for(int i=0;i<n;i++) {
            ans[i] = sum ; 
            sum = sum - code[(st)%n];
            sum = sum + code[(end+1)%n]; 
            st++; 
            end++;  
        }
        return ans;

    }
}