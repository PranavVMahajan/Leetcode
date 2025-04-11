class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int num = low; num <= high; num++) {
            String s = Integer.toString(num);
            int len = s.length();

            if (len % 2 != 0) {
                continue;
            }

            int leftSum = 0, rightSum = 0;

            for (int i = 0; i < len / 2; i++) {
                leftSum += s.charAt(i) - '0';
            }

            for (int i = len / 2; i < len; i++) {
                rightSum += s.charAt(i) - '0';
            }

            if (leftSum == rightSum) {
                count++;
            }
        }

        return count;
    }
}
