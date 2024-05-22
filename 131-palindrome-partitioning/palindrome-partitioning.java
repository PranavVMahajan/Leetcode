class Solution {
    List<List<String>> res = new ArrayList<>();
    int n;
    public List<List<String>> partition(String s) {
        n = s.length();
        recur(s,0,new ArrayList<>());
        return res;
    }
    public boolean isPalindrome(String s, int start,int end) {
        while(start<end) { // single char is always palindrome
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void recur(String s,int PartIdx,List<String> sublist) {
        //base case
        if(PartIdx == n) {
            res.add(new ArrayList<>(sublist));
            return;
        }
        //explore the possiblities
        for(int end=PartIdx ;end<n;end++) {
            if(isPalindrome(s,PartIdx,end)) {
                //add in list
                sublist.add(s.substring(PartIdx,end+1));
                //explore
                recur(s,end+1,sublist);
                //backtrack
                sublist.remove(sublist.size()-1);
                
            }
        }
    }
}