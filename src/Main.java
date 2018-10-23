//import lab1.*;
import lab2.*;
import lab3.*;

public class Main {
    public static void main (String args []){
            CwDB c = new CwDB("/home/krzysztof/IdeaProjects/obiektowe/src/lab2/plik");
            Entry alina=c.get("Agata");
            System.out.print(alina.getWord());
    }
}

