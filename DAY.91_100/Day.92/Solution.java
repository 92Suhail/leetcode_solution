class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length ==0 ||word == null || word.length() ==0) {
            return false;
        }
        int rows = board.length;
        int cols = board[0].length;
        for (int row =0; row <rows; row++) {
            for (int col =0; col <cols; col++) {
                if (dfs(board, word, row, col, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) return true;
        if (row < 0 || row >=board.length || col< 0 ||col >= board[0].length ||board[row][col] !=word.charAt(index)) {
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#'; 
        boolean found = dfs(board, word, row + 1, col, index + 1) ||
                        dfs(board, word, row -1, col, index+ 1) ||
                        dfs(board, word, row, col +1, index + 1) ||
                        dfs(board, word, row, col -1, index+ 1);
        board[row][col] = temp; 
        return found;
    }
}
