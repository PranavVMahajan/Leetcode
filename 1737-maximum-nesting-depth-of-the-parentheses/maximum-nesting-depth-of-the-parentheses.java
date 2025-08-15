class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDep = 0;

        for(char c: s.toCharArray()){
            if(c == '('){
                depth++;
                maxDep = Math.max(depth,maxDep);
            }
            else if(c == ')'){
                depth--;
            }
        }
        return maxDep;
    }
}