import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        char [][] board = new char[3][3];
        for (int row=0;row<board.length;row++){
            for (int col = 0; col < board[row].length;col++){
                board[row][col] = ' '; //initializing the board.
            }
        }

        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.println("Player" + player + "enter:");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = player;
            }
            else{
                System.out.println("Invalid move. Try again!");
            }
        }
    }

    public static void printBoard(char [][] board){

    }
}
