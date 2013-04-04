package ctp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HerlinCharlesBlanc {
	
	CtpBB c;
	
	
	// Question 4 : donnez ici la fonction de test
	@Before
	public void setupHistogramme(){
		c = new CtpBB();
	}
	@Test
	public void testHistogramme(){
		assertArrayEquals(new int[] {0,2,0,1}, c.histogramme(new int[] {1,1,3}, 3));
	}
	
	// Question 5 : indiquez par un commentaire les tests qui ont été ajoutés pour la Question 5

}
