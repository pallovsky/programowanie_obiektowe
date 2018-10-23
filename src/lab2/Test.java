/*
import java.util.LinkedList;
import java.util.Scanner;
import lab2.*;

public class Test {
    private LinkedList<Punkt3D> punkty=new LinkedList<Punkt3D>;

    public static void main(String[] args){
        System.out.print("1. Wczytaj punkt 3D\n" +
                "2. Wyświetl wszystkie punkty\n" +
                "3. Oblicz odległość\n" +
                "4. Zakończ");
        while (true){
            Scanner odczyt1 = new Scanner(System.in);
            int i = odczyt1.nextInt();
            switch(i){
                case (1):
                    System.out.println("Podaj X\n");
                    Scanner x1 = new Scanner(System.in);
                    System.out.println("Podaj Y\n");
                    Scanner y1 = new Scanner(System.in);
                    System.out.println("Podaj Z\n");
                    Scanner z1 = new Scanner(System.in);
                    Punkt3D pkt;
                    pkt = new Punkt3D;
                    pkt(x1,y1,z1);
                    punkty.add(pkt);
                    }
                case (2):
                    for (int i=0; i<punkty().size; i++)
                        System.out.println("Punkt " + punkty().get(i).nazwa + " ("punkty().get(i).getX() + ", " + punkty().get(i).getY() + ", " + punkty().get(i).z + ")");
                case (3):
                    System.out.println("Podaj nazwę punktu 1: ");
                    Scanner nazwa1 = new Scanner(System.in);
                    System.out.println("Podaj nazwę punktu 2: ");
                    Scanner nazwa2 = new Scanner(System.in);
                    Punkt3D punkt1, punkt2;
                    for (int i=0; i<punkty().size; i++){
                        if (punkty())
                    }
                case (4):
                    return true;
                default:
                    System.out.println("Idiot detected, try again ");
            }
        }
    }
}
*/