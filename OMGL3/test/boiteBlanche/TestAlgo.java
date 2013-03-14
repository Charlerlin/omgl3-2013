package boiteBlanche;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestAlgo {

	@Test
	public void testOterSpaces(){
		assertEquals("abc", new Algos().oterSpaces("   abc"));
		assertEquals("abc", new Algos().oterSpaces("abc"));
		assertEquals("", new Algos().oterSpaces(""));
		assertEquals("", new Algos().oterSpaces("   "));
	}

	@Test
	public void testDichotomicSearch(){
		assertEquals( 2, new Algos().dichotomicSearch(new int[] {1,2,3,4,5,6}, 3));
		assertEquals( -1, new Algos().dichotomicSearch(new int[] {}, 3));
		assertEquals( -1, new Algos().dichotomicSearch(new int[] {1,2,4,5,6}, 3));
		assertEquals(-1, new Algos().dichotomicSearch(new int[] {0,1,2,3}, 4));
	}

	@Test
	public void testCorrectBrackting(){
		assertTrue(new Algos().correctBracketing("(blabla(bla)rr)"));
		assertFalse(new Algos().correctBracketing("(blabla(blarr)"));
		assertFalse(new Algos().correctBracketing("(blabla(bla)rr))"));
		assertFalse(new Algos().correctBracketing("(blabla(bla)r)r)"));
		assertTrue(new Algos().correctBracketing("[blabla[bla]rr]"));
		assertTrue(new Algos().correctBracketing("(blabla[bla]rr)"));
		assertFalse(new Algos().correctBracketing("(blabla[bla)rr]"));
		assertTrue(new Algos().correctBracketing("{blabla(bla)rr}"));
		assertFalse(new Algos().correctBracketing("][blabla(bla)rr)"));
		assertFalse(new Algos().correctBracketing("(blabla(bla)][rr)"));
		assertTrue(new Algos().correctBracketing("[bla{bla}(bla)rr]"));
		assertTrue(new Algos().correctBracketing(""));
	}

	TreeSet<Double> r1 ;
	TreeSet<Double> r2;
	TreeSet<Double> r3;
	
	@Before
	public void setupFindRoots(){
		r1 = new TreeSet<Double>();
		r1.add(-1.0);
		r1.add(-3.0);
		r2 = new TreeSet<Double>();
		r2.add(-7.0);
		r2.add(3.0);
		r3 = new TreeSet<Double>();
		r3.add(new Double(-0.333333333333333333333333333333333333333));
	}

	@Test
	public void testFindRoots(){
		assertEquals(new TreeSet<Double>(), new Algos().findRoots(1, 2, 3));
		assertEquals(new TreeSet<Double>(), new Algos().findRoots(3, 2, 1));
		assertEquals(r1 , new Algos().findRoots(1, 4, 3));
		assertEquals(r2 , new Algos().findRoots(1, 4, -21));
		assertEquals(r3, new Algos().findRoots(9, 6, 1));
		assertEquals(new TreeSet<Double>(), new Algos().findRoots(-1, 6, -10));
	}

}
