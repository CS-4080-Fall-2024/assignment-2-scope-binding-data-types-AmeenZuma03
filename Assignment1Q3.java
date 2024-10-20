package assignment1;

public class Assignment1Q3 {
	/**
	 * Ameen Saleh
	 * Jamshidi
	 * October 20, 2024
	 * CS 4080
	 * @param board
	 */
	
	//this our function that takes the board and solves it 
	public void solve(char[][] board) {
	    dfs(board, 0);
	  }

	//this is the function that goes row by row 
	  private boolean dfs(char[][] board, int s) {
		  //this checks if the board is the correct size and has the correct parameters
	    if (s == 81)
	      return true;

	    final int i = s / 9;
	    final int j = s % 9;
//this goes through and looks at all the blank spaces on the board and begins to clear them
	    if (board[i][j] != '.')
	      return dfs(board, s + 1);
//this fills the chart with the numbers 
	    for (char c = '1'; c <= '9'; ++c)
	      if (isValid(board, i, j, c)) {
	        board[i][j] = c;
	        if (dfs(board, s + 1))
	          return true;
	        board[i][j] = '.';
	      }

	    return false;
	  }
//this function checks and makes sure that the variables that are input are not repeating/don't break the rules of sudoku
	  private boolean isValid(char[][] board, int row, int col, char c) {
		  //the for loop goes through each row and colmun to ensure validity
	    for (int i = 0; i < 9; ++i)
	      if (board[i][col] == c || board[row][i] == c ||
	          board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
	        return false;
	    return true;
	  }

	

}
