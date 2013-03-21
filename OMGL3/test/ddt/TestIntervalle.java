package ddt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestIntervalle {
	
	
	@Test (expected=IllegalArgumentException.class)
	public void testConstrEx(){
		new Intervalle(8, 2);
	}
	
	@Test
	public void testContains(){
		assertTrue(new Intervalle(1, 3).contains(2));
		assertFalse(new Intervalle(1, 3).contains(0));
	}
	
	@Test
	public void testIntersect(){
		assertEquals(new Intervalle(3, 4), new Intervalle(1, 4).intersect(new Intervalle(3, 6)));
		assertEquals(new Intervalle(9, 12), new Intervalle(5, 12).intersect(new Intervalle(9, 20)));
		assertEquals(null, new Intervalle(5, 7).intersect(new Intervalle(9, 12)));
		assertEquals(null, new Intervalle(9, 12).intersect(new Intervalle(5, 7)));
		assertEquals(new Intervalle(9, 12), new Intervalle(9, 20).intersect(new Intervalle(5, 12)));
	}
}
