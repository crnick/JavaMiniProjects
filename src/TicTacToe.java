import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        char [][] board = new char[3][3];
        for (int row=0;row<board.length;row++){
            for (int col = 0; col < board[row].length;col++){
                board[row][col] = ' '; //initializing the board.
            }
        }
        //placing elements on board X or Circle, and where to place it
        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while(!gameOver){
            printBoard(board); // printing the board
            System.out.println("Player" + player + "enter:");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] == ' '){ //check if co-ordinate is empty or not
                board[row][col] = player; //place the element either X or O
                gameOver = hasWon(board,player);
                if(gameOver){
                    System.out.println("Player has won");
                }else{
                    if(player == 'X'){
                        player = 'O';

                    }else{
                        player = 'X';
                    }
                }
            }
            else{
                System.out.println("Invalid move. Try again!");
            }
        }
        printBoard(board);
    }
    public static boolean hasWon(char[][] board, char player){
        //check for row
        for (int row=0;row<board.length;row++){
            if(board[row][0] == player &&board[row][1] == player && board[row][2] == player ){
                return true;
            }
        }
        //check for col
        for (int col=0;col<board.length;col++){
            if(board[0][col] == player &&board[1][col] == player && board[2][col] == player ){
                return true;
            }
        }
        //check diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    public static void printBoard(char [][] board){
        for (int row=0;row<board.length;row++){
            for (int col = 0; col < board[row].length;col++){
                System.out.print(board[row][col]+" "); //initializing the board.
            }
            System.out.println();
        }
    }
}
