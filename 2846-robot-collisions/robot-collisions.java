import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                //increasing order of positions sort
                //negative or 0 , no swapping
                //positive , swap
                return positions[a] - positions[b];
            }
        });
        
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int index: indexes ) {
            if(directions.charAt(index) == 'R') {
                stack.push(index);
            }
            else { // in - L
                boolean isSurvived = true;
                while(!stack.isEmpty()) {
                    int topIndex = stack.peek();
                    //case 1: if dir of top is 'L', then insert
                    if(directions.charAt(topIndex) == 'L') {
                        isSurvived = true;
                        break;
                    }
                    // case 2: 'topIndex' is 'R' & health is more than 'index'
                    else if(healths[topIndex] > healths[index]) {
                        isSurvived = false;
                        healths[index] = 0;
                        healths[topIndex] -= 1;
                        break;
                    }
                    // case 3: 'topIndex' is 'R' & health is less than 'index'
                    else if(healths[index] > healths[topIndex]) {
                        isSurvived = true;
                        healths[topIndex] = 0;
                        healths[index] -= 1;
                        stack.pop();
                    }
                    // case 4: 'topIndex' is 'R' & health is equal to 'index'
                    else {
                        isSurvived = false;
                        healths[topIndex] = 0;
                        healths[index] = 0;
                        stack.pop();
                        break;  
                    }
                }
                if(isSurvived) {
                    stack.push(index);
                }
            }
        }
        for(int i=0;i<n;i++) {
            if(healths[i]>0) {
                res.add(healths[i]);
            }
        }
        return res;
    }
}
