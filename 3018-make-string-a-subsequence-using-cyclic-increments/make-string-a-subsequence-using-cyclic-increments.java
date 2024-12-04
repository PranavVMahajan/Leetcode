class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        // Min(n,m)
        int idx1=0;
        int idx2=0;
        int n=str1.length();
        int m=str2.length();
        if(m>n){
            return false;
        }
        while(idx2<m && idx1<n){
            if(str1.charAt(idx1) == str2.charAt(idx2)||
            (str1.charAt(idx1) == str2.charAt(idx2)-1)||
            (str1.charAt(idx1)=='z' && str2.charAt(idx2)=='a')){
                idx2++;
            }
            idx1++;
        }
        return (idx2 == m);
    }
}