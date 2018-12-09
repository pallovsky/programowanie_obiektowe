
package lab3.MicroDVD;

import java.io.*;

public class Program {

    public static int miliseconds_to_frames(int miliseconds, int fps){
        return (miliseconds*fps)/1000;
    }

    public static void delay(String in, String out,int delay, int fps){

        FileReader fr = null;
        String linia = "";


        // OTWIERANIE PLIKU:
        try {
            File file = new File(in);
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }
        BufferedReader bfr = new BufferedReader(fr);
        String new_content="";
        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        try {
            while((linia = bfr.readLine()) != null){
                //edycji linii w stringu
                String linia_zmieniona[];
                linia_zmieniona=linia.split("}");
                linia_zmieniona[0]=linia_zmieniona[0].substring(1);
                linia_zmieniona[1]=linia_zmieniona[1].substring(1);
                int newBegin = Integer.parseInt(linia_zmieniona[0]) + miliseconds_to_frames(delay, fps);
                int newEnd = Integer.parseInt(linia_zmieniona[1]) + miliseconds_to_frames(delay, fps);
                String newLine = "{" + Integer.toString(newBegin) + "}{" + Integer.toString(newEnd) + "}" + linia_zmieniona[2] + '\n';
                new_content = new_content + newLine;
                //System.out.print(newLine + "\n");
                //przekopiowanie do nowego pliku
                File file2 = new File(out);
                PrintWriter zapis = new PrintWriter(file2);
                zapis.print(newLine + "\n");
                zapis.close();
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

        File file2 = new File(out);
        try {
            PrintWriter zapis = new PrintWriter(file2);
            zapis.print(new_content + "\n");
            zapis.close();
        }
        catch (IOException e){
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }


    }

    public static void main (String args []){
        delay("/home/krzysztof/IdeaProjects/programowanie_obiektowe/src/lab3/MicroDVD/napisy", "/home/krzysztof/IdeaProjects/programowanie_obiektowe/src/lab3/MicroDVD/out", 3000, 60);
    }

}
