package projekt;

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

    public Crossword(){
        entries = null;
        b = null;
        cwdb = null;
    }

    public Board getBoardCopy(){
        Board b = this.b;
        return b;}

    public InteliCwDB getCwDB(){return cwdb;}

    public void setCwDB(InteliCwDB cwdb){this.cwdb = cwdb;}

    public LinkedList<CwEntry> getEntries() {
        return entries;
    }

    public Board getB() {
        return b;
    }

    public InteliCwDB getCwdb() {
        return cwdb;
    }

    public long getID() {
        return ID;
    }

    public void setEntries(LinkedList<CwEntry> entries) {
        this.entries = entries;
    }

    public void setB(Board b) {
        this.b = b;
    }

    public void setCwdb(InteliCwDB cwdb) {
        this.cwdb = cwdb;
    }

    public boolean contains(String word){
        for (Entry ACw: cwdb.dict){
            if(ACw.getWord() == word){
                return true;
            }
        }
        return false;
    }

    public final void addCwEntry(CwEntry cwe, Strategy s){
        entries.add(cwe);
    }
}
