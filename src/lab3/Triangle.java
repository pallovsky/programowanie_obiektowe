package lab3;

public class Triangle extends Shape {
    private String name;

    public Triangle(String n){
        name=n;
    }
    public void draw(){
        System.out.println("   /|");
        System.out.println("  / |");
        System.out.println(" /  |");
        System.out.println("/___|");
    }
}
