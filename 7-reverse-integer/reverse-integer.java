class Solution {
    public int reverse(int x) {
        boolean isNeg = false;

        if(x<0){
            isNeg = true;
            x=x*(-1);
        }
        int rev = 0;
        while(x>0 ){
            if(rev > Integer.MAX_VALUE / 10){
                return 0;
            }
            rev = rev *10 + x%10;
            x= x/10;
        }
        if(isNeg==true){
            rev = rev*(-1);
        }
       
        return rev;
    }
}