package ConverNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConvert {
	Convert c = new Convert();
	
	@Test
	public void test0(){
		assertEquals("zero", c.c(0));
	}
	@Test
	public void test1(){
		assertEquals("un", c.c(1));
	}
	@Test
	public void test5(){
		assertEquals("cinq", c.c(5));
	}
	@Test
	public void testDizaine(){
		assertEquals("dix", c.c(10));
		assertEquals("vingt", c.c(20));
	}
	@Test
	public void testInf20(){
		assertEquals("seize", c.c(16));
		assertEquals("onze", c.c(11));
		assertEquals("dix-sept", c.c(17));
	}
	@Test
	public void testInf100(){
		assertEquals("vingt-deux", c.c(22));
		assertEquals("vingt et un", c.c(21));
		assertEquals("septante et un", c.c(71));
	}

	@Test
	public void testInf1000(){
		assertEquals("cent", c.c(100));
		assertEquals("cent trois", c.c(103));
		assertEquals("deux cent trois", c.c(203));
		assertEquals("huit cent septante-deux", c.c(872));
		assertEquals("deux cents", c.c(200));
	}
	@Test
	public void testMille(){
		assertEquals("mille", c.c(1000));
	}
	@Test
	public void testPlusMille(){
		assertEquals("mille deux cent trois", c.c(1203));
		assertEquals("deux mille", c.c(2000));
		assertEquals("deux mille trois", c.c(2003));
		assertEquals("deux cent trois mille vingt-quatre", c.c(203024));
		assertEquals("deux cent vingt-trois mille cent vingt-quatre", c.c(223124));
		assertEquals("neuf cent nonante-neuf mille neuf cent nonante-neuf", c.c(999999));
	}
	@Test 
	public void grandnombres(){
		assertEquals("huit cents mille", c.c(800000));
		assertEquals("cent vingt-trois millions quatre cent cinquante-six mille sept cent huitante-neuf", c.c(123456789));
		assertEquals("neuf cent nonante-neuf millions neuf cent nonante-neuf mille neuf cent nonante-neuf", c.c(999999999));
		assertEquals("quatre cents millions", c.c(400000000));
		assertEquals("quatre cents millions cent vingt-trois mille quatre cent cinquante-six", c.c(400123456));
	}
}
