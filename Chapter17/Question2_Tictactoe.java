public class TicTacToe{
    /* Design an algorithm to figure out if someone has won a game of tictactoe
     */ 
    public static void tictactoe(char[][] board) {
        /* convert the char board to int board, count to know which one win
         */ 
        int count = 0;//empty space
        
        //check row       
        for (int row = 0; row < board.length; row++) {
            if (!board[row][0].isEmpty){
                for (int column = 0; column < board[i].length; column++) {
                    if (board[row][column] != board[row][column+1]) {
                        break;
                    } 
                
                    if (column = board.length) {
                        return board[row][0];
                    }                   
                }       
            }                   
        }
        
        
        //check column
        for (int column = 0; column < board.length; column++) {
            if(!board[0][column].isEmpty) {
                for (int row = 0; row < board[i].length; row++) {
                    if (board[row][column] != board[row+1][column]) {
                        break;
                    }
                    
                    if (row = board.length) {
                        return board[0][column];
                    }
                }
            }
        }
        
        
        //check left diagonal
        if (!board[0][0].isEmpty) {
            for (int row = 0; row < board.length; row++) {
                if (board[row][row] != board[row+1][row+1]) {
                    break;
                }
                
                if (row = board.length) {
                    return board[0][0];
                }
            }
        }
        
        
        //check right diagonal
        if (!board[0][board.length].isEmpty) {
            for (int row = board.length - 1; row > 0; row--) {
                if (board[board.length - row][row] != board[board.length - row + 1][row + 1]) {
                    break;
                }
                
                if (row = 0) {
                    return board[0][board.length - 1];
                }
            }
        }
        
    }
}
