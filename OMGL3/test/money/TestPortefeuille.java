package money;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestPortefeuille {

	Argent usd5; // 5 USD
	Argent eur2; // 2 EUR
	Argent usd1; // 1 USD
	Portefeuille p;

	@Before
	public void initAjouterCombien(){
		usd5 = new Argent("USD", 5);
		eur2 = new Argent("EUR", 2);
		usd1 = new Argent("USD", 1);
		p = new Portefeuille();
	}

	@Test
	public void testAjouterCombien(){
		p.ajouter(usd5); p.ajouter(eur2); p.ajouter(usd1);
		System.out.println(p);
		//	p.combien(new String("USD")) -> 6
		System.out.println("Combien USD : "+p.combien("USD"));
		assertEquals(6, p.combien("USD"));

		//	p.combien(new String("EUR")) -> 2
		System.out.println("Combien EUR : "+p.combien("EUR"));
		assertEquals(2, p.combien("EUR"));
	}


	Argent eur0; // 0 EUR
	Argent usd2; // 2 USD
	Argent eur5; // 5 EUR

	@Before
	public void setUpSoustraire(){
		usd5 = new Argent("USD", 5); // 5 USD
		eur2 = new Argent("EUR", 2); // 2 EUR
		usd1 = new Argent("USD", 1); // 1 USD
		eur0 = new Argent("EUR", 0); // 0 EUR
		usd2 = new Argent("USD", 2); // 2 USD
		eur5 = new Argent("EUR", 5); // 5 EUR
		p = new Portefeuille();
	}

	@Test
	public void testSoustraire(){
		p.ajouter(usd5); p.ajouter(eur2); p.ajouter(usd1);
		//	p.soustraire(usd2) -> usd2
		assertEquals(usd2, p.soustraire(usd2));
		//	p.combien(new String("USD")) -> 4
		assertEquals(4, p.combien(new String("USD")));
		//	p.soustraire(eur5) -> eur0
		assertEquals(new Argent("EUR", 0), p.soustraire(eur5));
		//	p.combien(new String("EUR")  -> 2
		assertEquals(2, p.combien(new String("EUR")));
	}
}
