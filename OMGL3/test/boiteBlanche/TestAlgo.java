package boiteBlanche;

import static org.junit.Assert.*;
import org.junit.After;
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
	}
	
}
