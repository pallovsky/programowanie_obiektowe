package pl.edu.agh.kis.java2015.domain;
import pl.edu.agh.kis.java2015.domain.Heap
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
// Testy extractMax
	@Test
	public void extractMaxTest() {
		Heap heap = new Heap();
		heap.insert(0);
		heap.insert(2);
		int max = heap.extractMax();
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


}
