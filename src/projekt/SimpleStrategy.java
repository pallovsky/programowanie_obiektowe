package projekt;

import org.junit.runners.ParentRunner;

import java.util.LinkedList;

public class SimpleStrategy extends Strategy {

    @Override
    public CwEntry findEntry(Crossword cw) {
        return null;
    }

    @Override
    public void updateBoard(Board b, CwEntry e) {

    }

    public static Crossword generateCw(InteliCwDB ICw){
        Crossword result = new Crossword();
        result.setCwdb(ICw);

        InteliCwDB ICwCopy = ICw;
        Entry EntryRand = ICwCopy.getRandom();
        LinkedList<Entry> ListOfEntries = new LinkedList<>();
        LinkedList<CwEntry> ListOfCwEntries = new LinkedList<>();
        ListOfCwEntries.add(new CwEntry(EntryRand.getWord(), EntryRand.getClue(), CwEntry.Direction.VERT));
        ICwCopy.dict.remove(EntryRand);
        int length = 0;
        for (int i=0; i<EntryRand.getWord().length(); i++){
            Entry EntryRand1 = ICwCopy.getRandom(EntryRand.getWord().substring(0,1));
            ListOfEntries.add(EntryRand1);
            ICwCopy.dict.remove(EntryRand1);

            ListOfCwEntries.add(new CwEntry(EntryRand1.getWord(), EntryRand1.getClue(), CwEntry.Direction.HORIZ));
            if (length < EntryRand.getWord().length()){
                length = EntryRand.getWord().length();
            }
        }
        result.setEntries(ListOfCwEntries);

        BoardCell[][] boardCells;
        boardCells = new BoardCell[length][EntryRand.getWord().length()];

        for (int i = 0; i < length ; i ++){
            for (int j = 0; j < EntryRand.getWord().length() ; j++)
                if (j < ListOfEntries.get(j).getWord().length() ) {
                    String content = ListOfEntries.get(j).getWord().charAt(j) + "";
                    boardCells[i][j] = new BoardCell(content);
                } else {
                    boardCells[i][j] = new BoardCell(" ");
                }
        }
        result.setB(new Board(boardCells));

        return result;
    }
}
