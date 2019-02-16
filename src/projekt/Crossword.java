package projekt;

import java.util.Iterator;
import java.util.LinkedList;

public class Crossword {
    private LinkedList<CwEntry> entries;
    private Board b;
    private InteliCwDB cwdb;
    private final long ID = -1;

    public Crossword(LinkedList<CwEntry> entries, Board b, InteliCwDB cwdb) {
        this.entries = entries;
        this.b = b;
        this.cwdb = cwdb;
    }

    public Board getBoardCopy(){
        Board b = this.b;
        return b;}

    public InteliCwDB getCwDB(){return cwdb;}

    public void setCwDB(InteliCwDB cwdb){this.cwdb = cwdb;}

    public boolean contains(String word){}

    public final void addCwEntry(CwEntry cwe, Strategy s){}
}
