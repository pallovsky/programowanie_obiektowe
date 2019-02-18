package projekt;

import java.util.LinkedList;

public class AdvancedStrategy extends Strategy {
    @Override
    public CwEntry findEntry(Crossword cw) {
        return null;
    }

    @Override
    public void updateBoard(Board b, CwEntry e) {

    }

    public static Crossword generateCw(InteliCwDB ICw){
        InteliCwDB ICwCopy = ICw;
        LinkedList<CwEntry> entries = new LinkedList<>();

        Entry HEntry = ICwCopy.getRandom();
        int length = HEntry.getWord().length();
        CwEntry HCwEntry = new CwEntry(HEntry.getWord(), HEntry.getClue(), CwEntry.Direction.HORIZ);
        entries.add(HCwEntry);
        Entry VEntry = ICwCopy.getRandom();
        int height = VEntry.getWord().length();
        CwEntry VCwEntry = new CwEntry(VEntry.getWord(), VEntry.getClue(), CwEntry.Direction.VERT);
        entries.add(VCwEntry);

        BoardCell[][] boardCells = new BoardCell[height][length];

        for (int i = 0; i < length ; i++){
            boardCells[0][i] = new BoardCell(HEntry.getWord().charAt(i) + "", 0);
        }
        for (int i = 0; i < height ; i++){
            boardCells[i][0] = new BoardCell(VEntry.getWord().charAt(i) + "", 0);
        }
        boardCells[0][0].setNumber(1);
        Board b = new Board(boardCells);

        return new Crossword(entries, b, ICw);
    }
}
