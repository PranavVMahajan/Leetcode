class Solution {
    public boolean areNumbersAscending(String s) {
        int n = s.length();
        int prev = 0;
        for(String tok : s.split(" ")) {
            try {
                int num = Integer.parseInt(tok);
                if(num<= prev) {
                    return false;
                }
                prev = num;
            }
            catch(Exception e) {

            }
        }
        return true;
    }
}