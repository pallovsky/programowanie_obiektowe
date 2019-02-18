package projekt;

import java.util.LinkedList;

public class Board {

    private BoardCell[][] board;

    public Board(){
        board = null;
    }

    public void printBoard() {
        if (this.board != null) {
            for (int i = 0; i < this.getWidth(); i++) {
                for (int j = 0; j < this.getHeight(); j++){
                    if (board[i][j] != null){
                    System.out.print(board[i][j].getContent()  + i + j+ " ");
                    }
                }
                System.out.print("\n");
            }
        }
        else {
            System.out.print("Board is empty");
        }
    }
    public Board(BoardCell[][] board){
        this.board = board;
    }

    public int getWidth(){return board.length;}

    public int getHeight(){return board[0].length;}

    public BoardCell getCell(int x, int y){
        return board[x][y];
    }

    public void setCell(int x, int y, BoardCell c) {
        board[x][y] = c;
    }
/*
    public String getLineRegexp(int x) throws WordInLineException, WrongLineException{
        if (x < 0 || x > this.getWidth()){
            throw new WrongLineException();
        }
        String Regexp = "";
        for (int i = 0; i < this.getWidth(); i++){
            board[][x];
        }
    }
*/
    //public LinkedList<BoardCell> getStartCells(){

    //}

    //public void createPattern(int fromx, int fromy, int tox, int toy) {

    //}

}
