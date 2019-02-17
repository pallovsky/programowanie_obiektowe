package projekt;


public class CwEntry extends Entry{

    public CwEntry(String word, String clue, Direction d) {
        super(word, clue);
        this.d = d;
    }

    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setD(Direction d) {
        this.d = d;
    }

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
