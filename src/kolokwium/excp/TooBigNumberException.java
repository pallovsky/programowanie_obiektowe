package kolokwium.excp;

public class TooBigNumberException extends Exception {
    public TooBigNumberException(int x){
        System.out.print("Podane za duże x: ");
        System.out.print(x);
    }
}