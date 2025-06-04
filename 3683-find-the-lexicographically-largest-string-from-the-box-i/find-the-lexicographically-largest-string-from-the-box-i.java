class Solution {
    public String answerString(String word, int numFriends) {
        int n = word.length();
        if(numFriends == 1){
            return word;
        }

        int longPos = n -(numFriends - 1);
        String res = "";

        for(int i=0;i<n;i++){
            int cantakLen = Math.min(longPos,n-i);
            String sub =  word.substring(i,i+cantakLen);
            if(sub.compareTo(res)>0){
                res = sub;
            }
        }
        return res;
    }
}