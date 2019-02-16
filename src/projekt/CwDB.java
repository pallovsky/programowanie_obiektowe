package projekt;

import java.io.*;
import java.util.LinkedList;

public class CwDB {
    protected LinkedList<Entry> dict = new LinkedList<>();

    public CwDB(String filename){
        createDB(filename);
    }

    public void add(String new_word, String new_clue){
        if (dict==null){
            dict = new LinkedList<>();
            dict.add(new Entry(new_word, new_clue));
        }
        else {
            dict.add(new Entry(new_word, new_clue));
        }
    }

    public Entry get(String word){
        for (Entry aDict : dict) {
            if (aDict.getWord().equals(word)) {
                return aDict;
            }
        }
        return null;
    }

    public void remove(String word){
        for (Entry aDict : dict) {
            if (aDict.getWord().equals(word)) {
                dict.remove(aDict);
            }
        }
    }

    public int getSize(){return dict.size();}

    protected void createDB(String filename){
        FileReader fr = null;
        String linia = "";
        LinkedList<String> data= new LinkedList<>();

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }
        BufferedReader bfr = new BufferedReader(fr);

        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        try {
            while((linia = bfr.readLine()) != null){
                data.add(linia);
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

        // ZAMYKANIE PLIKU
        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }

        for (int i=0; i<data.size(); i=i+2){
            String new_word = data.get(i);
            String new_clue = data.get(i+1);
            dict.add(new Entry(new_word, new_clue));
        }
    }

    public void saveDB(String filename){
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (Entry aDict : dict) {
            printWriter.println(aDict.getWord());
            printWriter.println(aDict.getClue());
        }

        printWriter.close();
    }
}
