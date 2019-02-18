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
            Entry EntryRand1 = ICwCopy.getRandom("^" + EntryRand.getWord().substring(i,i+1));
            ListOfEntries.add(EntryRand1);
            ICwCopy.dict.remove(EntryRand1);

            ListOfCwEntries.add(new CwEntry(EntryRand1.getWord(), EntryRand1.getClue(), CwEntry.Direction.HORIZ));
            if (length < EntryRand1.getWord().length()){
                length = EntryRand1.getWord().length();
            }
        }
        result.setEntries(ListOfCwEntries);

        BoardCell[][] boardCells;
        int height = EntryRand.getWord().length();
        boardCells = new BoardCell[height][length];
        for (int x = 0; x < height; x++){
            for (int y = 0; y < length; y++){
                if (y < ListOfEntries.get(x).getWord().length()){
                    String content = ListOfEntries.get(x).getWord().charAt(y) + "";
                    boardCells[x][y] = new BoardCell(content);
                }
            }
        }

        result.setB(new Board(boardCells));

        return result;
    }
}
