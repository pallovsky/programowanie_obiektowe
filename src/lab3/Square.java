package lab3;

public class Square extends Shape {
    public String name;
    public Square(String n){
        name=n;
    }
    public void draw(){
        System.out.print("______\n");
        System.out.print("|     |\n");
        System.out.print("|     |\n");
        System.out.print("______\n\n");
    }
}
