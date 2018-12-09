package lab4.maxheap.src.main.java.pl.edu.agh.kis.java2015.domain;

import java.util.ArrayList;

public class Heap {

	public int heapSize;

	public ArrayList<Double> tab ;

	public Heap(){
	    this.heapSize = 0;
	    this.tab = new ArrayList<>();
    }

	public Heap(ArrayList<Double> tab){
	    Heap new_heap= new Heap();
        for (Object aTab : tab) {
            new_heap.insert((Double) aTab);
        }
        this.tab = new_heap.tab;
	    this.heapSize = new_heap.heapSize;
    }

	public void insert(double value) {
		int currentIndex = heapSize;
		int parentIndex = parentIndex(currentIndex);
		tab.add(value);
		while( isChildGreaterThanParent(currentIndex, parentIndex) ) {
			swapElements(currentIndex, parentIndex);
			currentIndex = parentIndex;
			parentIndex = parentIndex(currentIndex);
		}
		heapSize++;
	}

	public boolean isChildGreaterThanParent(int currentIndex, int parentIndex) {
		return tab.get(currentIndex) > tab.get(parentIndex);
	}

	public void swapElements(int currentIndex, int parentIndex) {
		Double parentValue = parentValue(currentIndex);
		Double currentValue = tab.get(currentIndex);
		tab.set(parentIndex, currentValue);
		tab.set(currentIndex, parentValue);
	}

	public Double parentValue(int currentIndex) {
		Double parentValue = tab.get(parentIndex(currentIndex));
		return parentValue;
	}

	public int parentIndex(int currentIndex) {
		return (currentIndex-1)/2;
	}

	public int size() {
		return heapSize ;
	}

	public double top() {
		return tab.get(0);
	}

	public double extractMax(){
        ArrayList<Double> new_list;
        new_list = this.tab;
        double max = new_list.remove(0);
        Heap new_heap = new Heap(new_list);
        this.heapSize = new_heap.heapSize;
        this.tab = new_heap.tab;
		return max;
	}

	public void deleteMax(){
        ArrayList<Double> new_list;
        new_list = this.tab;
        double max = new_list.remove(0);
        Heap new_heap = new Heap(new_list);
        this.heapSize = new_heap.heapSize;
        this.tab = new_heap.tab;
	}

	public Heap heapify(double tab[]){
	    Heap new_heap = new Heap();
		for (double element: tab){
		    new_heap.insert(element);
        }
	    return new_heap;
	}

	public void replace(double replacement){
        ArrayList<Double> new_list;
        new_list = this.tab;
        new_list.remove(0);
        new_list.add(0, replacement);
        Heap new_heap = new Heap(new_list);
        this.heapSize = new_heap.heapSize;
        this.tab = new_heap.tab;
	}

	public static Heap merge(Heap h1, Heap h2){
	    ArrayList<Double> mergedArray = h1.tab;
	    mergedArray.addAll(h2.tab);
        return new Heap(mergedArray);
	}

	public static void meld(Heap h1, Heap h2){
        for (Object aTab : h2.tab) {
            h1.insert((Double) aTab);
        }
	}

}
