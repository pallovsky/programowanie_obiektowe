package projekt;

import java.util.LinkedList;

public class Board {

    private BoardCell[][] board;

    public Board(){
        board = null;
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

    //public LinkedList<BoardCell> getStartCells(){

    //}

    //public void createPattern(int fromx, int fromy, int tox, int toy) {

    //}

}
