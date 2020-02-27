package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * This class is a Test class and is used to test the SimpleList class. It tests
 * all the methods implemented in the SimpleList class. It also checks the
 * constructor of the class.
 * 
 * @author Jerrel Senter Class ID: 181 Assignment Number: 1
 */
public class SimpleListTest {

	@Test
	public void constructorTest() {
		SimpleList simpleList = new SimpleList();
		assertEquals(0, simpleList.count());
	}

	@Test
	public void addTest() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(10);
		simpleList.add(20);
		assertEquals(2, simpleList.count());
		simpleList.add(30);
		simpleList.add(40);
		simpleList.add(50);
		simpleList.add(60);
		assertEquals(6, simpleList.count());
		simpleList.add(70);
		simpleList.add(80);
		simpleList.add(90);
		simpleList.add(100);
		assertEquals(10, simpleList.count());
		simpleList.add(110);
		simpleList.add(120);
		assertEquals(12, simpleList.count());
		simpleList.add(110);
		simpleList.add(120);
		simpleList.add(110);
		simpleList.add(120);
		assertEquals(16, simpleList.count());
	}

	@Test
	public void firstTest() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(10);
		simpleList.add(20);
		simpleList.add(30);
		simpleList.add(40);
		simpleList.add(50);
		simpleList.add(60);
		assertEquals(60, simpleList.first());
	}

	@Test
	public void lastTest() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(10);
		simpleList.add(20);
		simpleList.add(30);
		simpleList.add(40);
		simpleList.add(50);
		simpleList.add(60);
		assertEquals(10, simpleList.last());
	}
	
	@Test
	public void appendTest() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(10);
		simpleList.add(20);
		simpleList.add(30);
		simpleList.append(40);
		simpleList.add(40);
		simpleList.add(50);
		simpleList.add(60);
		assertEquals(40, simpleList.last());
	}

	@Test
	public void removeTest() {
		SimpleList simpleList = new SimpleList();
		simpleList.remove(3);
		assertEquals(0, simpleList.count());
		simpleList.add(5);
		simpleList.add(10);
		simpleList.add(15);
		simpleList.remove(10);
		assertEquals(2, simpleList.count());
	}

	@Test
	public void countTest() {
		SimpleList simpleList = new SimpleList();
		assertEquals(0, simpleList.count());
		simpleList.add(20);
		simpleList.add(40);
		assertEquals(2, simpleList.count());
	}

	@Test
	public void toStringTest() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(10);
		assertEquals("10", simpleList.toString());
		simpleList.add(20);
		simpleList.add(30);
		simpleList.add(40);
		simpleList.add(50);
		simpleList.add(60);
		assertEquals("60 50 40 30 20 10", simpleList.toString());
		simpleList.add(70);
		simpleList.add(80);
		simpleList.add(90);
		simpleList.add(100);
		simpleList.add(110);
		assertEquals("110 100 90 80 70 60 50 40 30 20 10", simpleList.toString());
		simpleList.remove(80);
		assertEquals("110 100 90 70 60 50 40 30 20 10", simpleList.toString());
		simpleList.remove(110);
		assertEquals("100 90 70 60 50 40 30 20 10", simpleList.toString());
		simpleList.remove(20);
		assertEquals("100 90 70 60 50 40 30 10", simpleList.toString());
	}

	@Test
	public void searchTest() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(20);
		simpleList.add(40);
		simpleList.add(50);
		assertEquals(0, simpleList.search(50));
		assertEquals(1, simpleList.search(40));
		assertEquals(2, simpleList.search(20));
	}
}
