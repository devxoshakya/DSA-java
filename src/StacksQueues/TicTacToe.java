package StacksQueues;
import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean isGameOver = false;

        Scanner sc = new Scanner(System.in);
        while(!isGameOver){
            printBoard(board);
            System.out.println("Player "+player+" turn. Enter row and column");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] != ' '){
                System.out.println("Invalid move. Try again");
                continue;
            }
            else{
                board[row][col] = player;
                isGameOver = haveWon(board, player);
                if(!isGameOver){
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
        }
        printBoard(board);


    }

    private static void printBoard(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
                if(j!=2){
                    System.out.print(" |");
                }
            }
            System.out.println();
            if(i!=2){
                System.out.println("---------");
            }
        }
    }

    private static boolean haveWon(char[][] board, char player){
        for(int i=0;i<3;i++){
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player){
                System.out.println("Player "+player+" wins");
                return true;
            }
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player){
                System.out.println("Player "+player+" wins");
                return true;
            }
        }
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            System.out.println("Player "+player+" wins");
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            System.out.println("Player "+player+" wins");
            return true;
        }
        return false;
    }
}
