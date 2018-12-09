package lab4.maxheap.src.test.java.pl.edu.agh.kis.java2015.domain;
import lab4.maxheap.src.main.java.pl.edu.agh.kis.java2015.domain.Heap;
import static org.junit.Assert.*;

import org.junit.Test;

public class HeapTest {
	
	@Test
	public void insert0intoNewHeap_topIs0() {
		
		Heap heap = new Heap();
		heap.insert(0);
		
		assertEquals("size should be 1",1,heap.size());
		assertEquals(0,heap.top(),0.001);
		assertEquals(1,heap.size());
	}
	
	@Test
	public void insert0AndThen2intoNewHeap_topIs2() {
		
		Heap heap = new Heap();
		heap.insert(0);
		heap.insert(2);
		
		assertEquals("size should be 2",2,heap.size());
		assertEquals(2,heap.top(),0.001);
	}
	
	@Test
	public void insert0And2And3And5And6intoNewHeap_topIs6() {
		
		Heap heap = new Heap();
		heap.insert(0);
		heap.insert(2);
		heap.insert(3);
		heap.insert(5);
		heap.insert(6);
		
		assertEquals(6,heap.top(),0.001);
	}

	@Test
	public void extractMaxTest() {
		Heap heap = new Heap();
		heap.insert(0);
		heap.insert(2);
		double max = heap.extractMax();
		assertEquals("size should be 1",1,heap.size());
		assertEquals("top should be 0",0, heap.top(),0.001);
        assertEquals("2 should be returned",2,max , 0.001);
	}

    @Test
    public void deleteMaxTest() {
        Heap heap = new Heap();
        heap.insert(0);
        heap.insert(2);
        heap.deleteMax();
        assertEquals("size should be 1",1,heap.size());
        assertEquals("top should be 0",0, heap.top(),0.001);
    }

	@Test
	public void replaceTest(){
		Heap heap = new Heap();
		heap.insert(0);
		heap.insert(2);
		heap.replace(4);
		assertEquals("top should be 4",4, heap.top(),0.001);
	}

	@Test
	public void heapifyTest(){
		Heap heap = new Heap();
		double[] tab = {1, 2, 3};
		heap.heapify(tab);
		assertEquals("size should be 3",3,heap.size());
		assertEquals("top should be 3",3, heap.top(),0.001);
	}

	@Test
	public void mergeTest(){
		Heap h1 = new Heap;
		Heap h2 = new Heap;
		h1.insert(1);
		h1.insert(2);
		h2.insert(3);
		h2.insert(4);
		Heap heap = Heap.merge(h1,h2);

		assertEquals("size of h1 should be 2",2,h1.size());
		assertEquals("top of h1 should be 2",2, h1.top(),0.001);
		assertEquals("size of h2 should be 2",2,h2.size());
		assertEquals("top should be 4",4, h2.top(),0.001);
		assertEquals("size should be 4",4,heap.size());
		assertEquals("top should be 4",4, heap.top(),0.001);
	}

	@Test
	public void meldTest(){
		Heap heap = new Heap;
		Heap h2 = new Heap;
		heap.insert(4);
		heap.insert(3);
		h2.insert(2);
		h2.insert(1);
		Heap.meld(heap, h2);
		assertEquals("size should be 4",4,heap.size());
		assertEquals("top should be 4",4, heap.top(),0.001);
	}
}
