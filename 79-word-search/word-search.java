class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int r=0;r<m;r++) {
            for(int c=0;c<n;c++) {
                if(word.charAt(0) == board[r][c]) {
                    boolean found =dfs(board,r,c,word,0);
                    if(found) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,int r,int c,String word,int wordIndex) {
        // Base case
        //valid case
        if(wordIndex == word.length()) {
            return true;
        }
        int rows = board.length;
        int cols = board[0].length;
        // Out of bound case
        if(r<0 || c<0 || r>=rows || c>=cols) {
            return false;
        }
        // Invalid cases
        if(board[r][c] == ' ' || board[r][c] != word.charAt(wordIndex)) {
            return false;
        }
        char ch = board[r][c];
        board[r][c] = ' ';
        //DFS calls
        if(dfs( board,r-1,c,word,wordIndex+1) ||
        dfs( board,r,c+1,word,wordIndex+1) ||
        dfs( board,r+1,c,word,wordIndex+1) ||
        dfs( board,r,c-1,word,wordIndex+1) ) {
            return true;
        }
        // Backtracking 
        board[r][c] = ch;
        return false; 
    } 
}