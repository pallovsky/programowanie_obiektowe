package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    public static void SymulateLogin(){
        InputStreamReader rd = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(rd);
        String login = "login";
        String haslo = "haslo";
        /**
         * tutaj jest login i haslo poprawne
         */

        System.out.print("Wpisz login: ");
        String text = null;
        try {
            text = bfr.readLine();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        System.out.print("Wpisz haslo: ");
        String texta = null;
        try {
            texta = bfr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(texta.equals(haslo) && text.equals(login)){
            System.out.print("Brawo");
        } else{
            System.out.print("Nie tym razem!");
        }
    }
}