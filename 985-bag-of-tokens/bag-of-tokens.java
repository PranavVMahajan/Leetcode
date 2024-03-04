import java.util.*;
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int st = 0;
        int end = tokens.length-1;
        int max =0;
        int score = 0;
        while(st<=end) {
            if(power>=tokens[st]) {
                power -= tokens[st];
                st++;
                score++;
            } else if (max>0) {
                power += tokens[end];
                end--;
                score--;
            } else {
                break;
            }
            max = Math.max(max,score);
        }
        return max;
    }
}