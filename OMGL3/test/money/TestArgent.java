package money;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*Argent usd5 = new Argent(new String("USD"), 5);
usd5.montant() -> 5
usd5.devise() -> "USD"
new Argent(null, 1) -> IllegalArgumentException
new Argent(new String("USD"), -1) -> IllegalArgumentException*/

public class TestArgent {

	Argent usd5;
	@Before
	public void setUp () {
		usd5 = new Argent(new String("USD"), 5);
	}
	@Test
	public void testConstructeurAccesseurs() {
		assertEquals( "USD", usd5.devise());
		assertEquals( 5 , usd5.montant());
	}
	@Test (expected=IllegalArgumentException.class) // à compléter ici pour tester la levée d’exception                                            
	public void testConstructeurException1() { 
		Argent badDevise5 = new Argent("", 5);
		Argent badDevise2 = new Argent(null, 2);
	}

	@Test (expected=IllegalArgumentException.class) // à compléter ici pour tester la levée d’exception                                           
	public void testConstructeurException2() { 
		Argent badMontant = new Argent("USD", -1);
	}

	Argent usd5_autre;
	Argent usd0;
	Argent eur5;
	@Before
	public void setUpForEquals(){
		usd5 = new Argent(new String("USD"), 5);
		usd5_autre = new Argent(new String("USD"), 5);
		usd0 = new Argent(new String("USD"), 0);
		eur5 = new Argent(new String("EUR"), 5);
	}

	@Test
	public void testEquals(){
		//		usd5.equals(usd5_autre) -> true
		assertTrue(usd5.equals(usd5_autre));
		//		usd5_autre.equals(usd5) -> true
		assertTrue(usd5_autre.equals(usd5));
		//		usd5.equals(eur5) -> false
		assertFalse(usd5.equals(eur5));
		//		usd5.equals(usd0) -> false
		assertFalse(usd5.equals(usd0));

	}

	@Before
	public void setUpAjouter(){
		usd5 = new Argent(new String("USD"), 5);
		usd0 = new Argent(new String("USD"), 0);
		eur5 = new Argent(new String("EUR"), 5);
	}
	
	@Test
	public void testAjouter(){
//		usd5.ajouter(usd0) -> usd5
		assertEquals(usd5, usd5.ajouter(usd0));
//		eur5.ajouter(usd5) -> null
		assertEquals(null, eur5.ajouter(usd5));

	}

}


