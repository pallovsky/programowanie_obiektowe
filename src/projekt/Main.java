package projekt;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       InteliCwDB icw = new InteliCwDB("/home/krzysztof/IdeaProjects/programowanie_obiektowe/src/projekt/plik");
       Crossword cw = SimpleStrategy.generateCw(icw);
       cw.getBoardCopy().printBoard();

    }

}
