class Solution {
    public long findNearestPalindrome(Long firstHalf, boolean isOdd) {
        long res = firstHalf;
        if(isOdd) {
            firstHalf /= 10;
        }
        while(firstHalf>0) {
            res = res*10 + (firstHalf%10);
            firstHalf/=10;
        }
        return res;
    }
    public String nearestPalindromic(String n) {
        ArrayList<Long> list = new ArrayList<Long>();
        int len = n.length();
        boolean isOdd = (len%2 != 0);
        int mid = (len%2 == 0)?(len/2):((len/2)+1);
        Long firstHalf = Long.parseLong(n.substring(0,mid));
        list.add(findNearestPalindrome(firstHalf,isOdd));
        list.add(findNearestPalindrome(firstHalf+1,isOdd));
        list.add(findNearestPalindrome(firstHalf-1,isOdd));
        list.add((long)Math.pow(10,len-1)-1); // all 9's
        list.add((long)Math.pow(10,len)+1);
        long num = Long.parseLong(n);
        long minDiff = Long.MAX_VALUE;
        long res = Long.MAX_VALUE;
        for(Long element : list) {
            if(element == num) continue;
            long currDiff = Math.abs(element - num);
            if(currDiff < minDiff) {
                res = element;
                minDiff = currDiff;
            }
            else if(currDiff == minDiff){
                res = Math.min(res,element);
            }
        }
        return String.valueOf(res);
    }
}