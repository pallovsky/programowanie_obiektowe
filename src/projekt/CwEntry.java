package projekt;


public class CwEntry extends Entry{

    public CwEntry(String word, String clue) {
        super(word, clue);
    }

    private int x;
    private int y;

   enum Direction{
       HORIZ, VERT;
   }

   private Direction d;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDir() {
        return d;
    }
}
