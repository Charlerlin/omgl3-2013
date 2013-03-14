package boiteNoire;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import revisions_tp.*;

public class TestSoldes {
	Soldes s; 
	
	@Before
	public void setUp() {s = new SoldesImpl3();}
	@Test
	public void un_test() {
	    assertEquals( 30, s.aPayer(20,10));
	    assertEquals( 75, s.aPayer(70,10));
	    assertEquals( 200, s.aPayer(200,10));
	    assertEquals( 210, s.aPayer(200,30));
	    assertEquals( 70, s.aPayer(70,2));
//	    assertEquals( , s.aPayer(,));
//	    assertEquals( , s.aPayer(,));
//	    assertEquals( , s.aPayer(,));
//	    assertEquals( , s.aPayer(,));
//	    assertEquals( , s.aPayer(,));
	}

}
