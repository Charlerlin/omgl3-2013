package boiteNoire;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assurance.Assurance;
import assurance.AssuranceImpl1;

public class TestAssurance {

	int[] res;
	int[] prix;
	int[] age;
	int[] deg;
	boolean[] fkm;
	Assurance a;

	@Before
	public void setup(){
		res = new int[] {};
		prix = new int[] {-1, 100};
		age = new int[] {10, 20, 30};
		deg = new int[] {-1, 1000, 35000, 120000};
		fkm = new boolean[] {false, true};
		a = new AssuranceImpl1();
	}

	@Test
	public void testValeur(){
		int ires=0; 
		for(int iprix=0; iprix!=2; iprix++){
			for(int iage=0; iage!=3; iage++){
				for(int ideg=0; ideg!=4; ideg++){
					for(int ifkm=0; ifkm!=2; ifkm++){
						if(ires>=34 && ires<=38 || ires>=41 && ires<=47 )
							assertEquals(res[ires], a.prixAssurance(prix[iprix], age[iage], deg[ideg], fkm[ifkm]));
						ires++;
					}
				}
			}
		}
	}
	
//	public static void main(String[] args) {
//		Assurance b = new AssuranceImpl1();
//		b.prixAssurance(100, 10, 1000, false);
//	}

}
