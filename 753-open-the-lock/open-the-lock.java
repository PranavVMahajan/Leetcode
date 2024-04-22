import java.util.*;

class Solution {

    public void fillNeighbour(Queue<String> que, String curr, HashSet<String> st) {
        char[] currArray = curr.toCharArray();
        for (int i = 0; i < 4; i++) {
            char ch = currArray[i];
            char dec = ch == '0' ? '9' : (char)(ch - 1);
            char inc = ch == '9' ? '0' : (char)(ch + 1);

            currArray[i] = dec;
            String newString = new String(currArray);
            if (!st.contains(newString)) {
                st.add(newString);
                que.add(newString);
            }

            currArray[i] = inc;
            newString = new String(currArray);
            if (!st.contains(newString)) {
                st.add(newString);
                que.add(newString);
            }

            currArray[i] = ch;
        }
    }

    public int openLock(String[] deadends, String target) {
        HashSet<String> st = new HashSet<>(Arrays.asList(deadends));
        String start = "0000";

        if(st.contains(start)) {
            return -1;
        }

        Queue<String> que = new LinkedList<>();
        que.add(start);

        int level = 0;
        while (!que.isEmpty()) {
            int n = que.size();
            while (n-- > 0) {
                String curr = que.poll();

                if (curr.equals(target)) {
                    return level;
                }
                fillNeighbour(que, curr, st);
            }
            level++;
        }
        return -1;
    }
}
