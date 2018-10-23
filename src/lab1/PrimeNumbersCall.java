package lab1;

import java.io.*;
public class PrimeNumbersCall {
    public static void getInt() {
        int num;
        try{
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader bfr = new BufferedReader(rd);

            System.out.print("Wpisz liczbe:\n");
            num = Integer.parseInt(bfr.readLine());

            PrimeNumbers.Generate(num);
        }catch(IOException e){e.printStackTrace();}
    }
    public static String getString() {
        String text = null;
        try{
            System.out.print("Podaj nazwe");
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader bfr = new BufferedReader(rd);

            text = bfr.readLine();
        }catch(IOException e){e.printStackTrace();}
        return text;
    }
}