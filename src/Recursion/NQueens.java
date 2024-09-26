package Recursion;
public class NQueens {
    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];
        nQueens(board, 0, n);
    }
    static void nQueens(int[][] board, int row, int n){
        if(row == n){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int i = 0; i < n; i++){
            if(isSafe(board, row, i, n)){
                board[row][i] = 1;
                nQueens(board, row+1, n);
                board[row][i] = 0;
            }
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int n){
        for(int i = 0; i < row; i++){
            if(board[i][col] == 1){
                return false;
            }
        }
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row, j = col; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
