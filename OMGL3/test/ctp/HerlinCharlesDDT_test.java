package ctp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HerlinCharlesDDT_test {
	
	HerlinCharlesDDT_algo a;
	
	// Donnez ici la suite de tests. Chaque cas de test dans une méthode différente.
	// La lecture de haut en bas doit donner la chronologie d'écriture des tests
	
	@Before
	public void setup(){
		a = new HerlinCharlesDDT_algo();
	}
	@Test
	public void add2(){
		assertEquals(3, a.calc("+ 1 2"));
	}
	@Test
	public void add2bis(){
		assertEquals(5, a.calc("+ 3 2"));
	}
	@Test 
	public void add3more(){
		assertEquals(10, a.calc("+ 3 2 5"));
		assertEquals(60, a.calc("+ 10 20 30"));
		assertEquals(45, a.calc("+ 1 2 3 4 5 6 7 8 9 "));
	}
	@Test
	public void mul2(){
		assertEquals(6, a.calc("* 3 2"));
		assertEquals(6, a.calc("* 3 2  "));
	}
	@Test
	public void mulmore(){
		assertEquals(362880, a.calc("* 1 2 3 4 5 6 7 8 9"));
		assertEquals(500, a.calc("* 5 100"));
	}
	@Test
	public void withNeg(){
		assertEquals(-1, a.calc("+ -3 2"));
		assertEquals(-6, a.calc("* 3 -2"));
		assertEquals(6, a.calc("* -3 -2"));
	}
}
