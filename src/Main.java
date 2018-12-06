import lab2.Cryptographer.*;

public class Main {
    public static void main (String args []){
        Polybus szyfr = new Polybus();
        String result = szyfr.crypt("szyfr");
        System.out.print(result + "\n");
        String g = szyfr.decrypt(result);
        System.out.print(g);
    }
}

