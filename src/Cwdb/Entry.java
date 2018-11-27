package Cwdb;

public class Entry {
    private String word;
    private String clue;
    public Entry(String w, String c){
        word=w;
        clue=c;
    }
    public String getWord(){return word;}
    public String getClue(){return clue;}
}
