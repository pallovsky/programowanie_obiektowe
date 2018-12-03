package lab1;

public class Macierz {
    public int columns;
    public int lines;
    public int[] values;

    public Macierz(int newColumns, int newLines, int[] values){
        int size=0;
        for (int i: values){size=size+1;}
        if (newColumns*newLines != size){
            System.out.print("Złe wymiary");
        }
        else {
            this.columns=newColumns;
            this.lines=newLines;
            this.values=values;
        }
    }

    public void print() {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(this.values[j+(i*this.columns)] + " ");
            }
            System.out.print("\n");
        }
    }

    public Macierz add(Macierz matrix){
        if (this.columns != matrix.columns || this.lines != matrix.lines){
            System.out.print("Złe wymiary macierzy");
            return null;
        }
        else {
            int[] newValues = new int[this.columns*this.lines];
            for (int i = 0; i<this.columns*this.lines; i++){
                newValues[i]=this.values[i]+matrix.values[i];
            }
            return new Macierz(this.columns, this.lines, newValues);
        }
    }

    public Macierz substract(Macierz matrix){
        if (this.columns != matrix.columns || this.lines != matrix.lines){
            System.out.print("Złe wymiary macierzy");
            return null;
        }
        else {
            int[] newValues = new int[this.columns*this.lines];
            for (int i = 0; i<this.columns*this.lines; i++){
                newValues[i]=this.values[i]-matrix.values[i];
            }
            return new Macierz(this.columns, this.lines, newValues);
        }
    }


        public static void main(String[] argv){
            int wartosci[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
            Macierz m1 = new Macierz(4,4, wartosci);
            m1.print();
            Macierz m2 = new Macierz(4,4, wartosci);
            Macierz m3 = m1.add(m2);
            m3.print();
            Macierz m4 = m1.substract(m2);
            m4.print();
        }
}
