
import lab4.maxheap.src.main.java.pl.edu.agh.kis.java2015.domain.Heap;

import java.util.ArrayList;

public class Main {
    public static void main (String args []){
        ArrayList tab = new ArrayList();
        for (double i=0; i<10; i++){
            tab.add(i);
        }
        System.out.println(tab);
        Heap new_heap = new Heap(tab);
        System.out.println(new_heap.tab);
        double max = new_heap.extractMax();
        System.out.println(new_heap.tab);
        new_heap.deleteMax();
        System.out.println(new_heap.tab);
        new_heap.replace(5);
        System.out.println(new_heap.tab);
    }
}

