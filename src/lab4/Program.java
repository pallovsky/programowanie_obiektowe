package lab4;

import lab2.Entry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Program {

    public double miliseconds_to_frames(const int miliseconds, const int fps){
        return (miliseconds*fps)/1000;
    }

    public void delay(const char in, const char out,int delay, int fps){

        FileReader fr = null;
        String linia = "";
        

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader(in);
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }
        BufferedReader bfr = new BufferedReader(fr);

        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        try {
            while((linia = bfr.readLine()) != null){
                //edycji linii w stringu
                String linia_zmieniona[]=null;
                linia_zmieniona=linia.split("}");
                linia_zmieniona[0]=linia_zmieniona[0].substring(1);
                linia_zmieniona[1]=linia_zmieniona[1].substring(1);
                int begin = Integer.parseInt(linia_zmieniona[0]);
                int end = Integer.parseInt(linia_zmieniona[1]);
                //przekopiowanie do nowego pliku

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

    }


}
