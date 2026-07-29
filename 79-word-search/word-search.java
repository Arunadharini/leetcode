class Solution {
    public boolean exist(char[][] board, String word) {
      for(int i =0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]==word.charAt(0)){
                if(check(i,j,board,word,0)== true) return true;
            }
        }
      }
      return false; 
    }
    public boolean check(int row , int col , char[][]board ,String word , int word_ind){
        if(word_ind==word.length()) return true;

        if(row<0||col<0||row==board.length||col==board[0].length||board[row][col]!=word.charAt(word_ind)) return false;

        char ch = board[row][col];
        board[row][col]='-';

        boolean up= check(row-1,col,board,word,word_ind+1);
        boolean down=check(row+1,col,board,word,word_ind+1);
        boolean right=check(row,col+1,board,word,word_ind+1);
        boolean left=check(row,col-1,board,word,word_ind+1);

        board[row][col]=ch;
        if(up||down||left||right) return true;
        return false;
    }
}