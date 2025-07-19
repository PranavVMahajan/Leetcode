class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prfx = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prfx) != 0){
                prfx = prfx.substring(0,prfx.length()-1);
                if(prfx.isEmpty()) return "";
            }
        }
        return prfx;
    }
}