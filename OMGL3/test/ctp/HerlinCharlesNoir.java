package ctp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import abonnement.*;

public class HerlinCharlesNoir {
	
	Abonnement a;
	
	// --------------------------------------------------------------------------
	// DONNEZ ICI VOS RÉPONSES SANS EFFACER
	// --------------------------------------------------------------------------
	// Question 1 : COMPLÉTEZ ICI les classes d'équivalence pour chaque variable
	// prixDeBase : ]-infini ; -1](invalide) [0 ; +infini[(valide) -> test 1000
	// age		  : ]-infini ; -1](invalide) [0; 25](valide) [26; +infini[(valide) -> test 15, 30
	// dureeMois  : {6(valide), 12(valide), 24(valide), toute autre valeur(invalide)} -> test 6, 12, 24
	
	// Question 3 : COMPLETEZ ICI : Recommandez-vous l'une des implémentations. Laquelle ?
	// Réponse : L'implémentation recommandée est la 3
	
	// Question 2 : COMPÉTEZ CI-DESSOUS en donnant les fonctions de test nécessaires
	// ------------------------------------------------------------------------
	
	@Before
	public void setupAb(){
		a = new AbonnementImpl3();
	}
	//Test des cas invalides 
	@Test (expected=IllegalArgumentException.class)
	public void testAbEprix(){
		a.prixAbonnement(-1, 12, 12);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testAbEage(){
		a.prixAbonnement(1000, -1, 12);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testAbEduree(){
		a.prixAbonnement(1000, 12, 1);
	}
	//Test des classes d'équivalence
	@Test
	public void testAbClasses(){
		assertEquals(900, a.prixAbonnement(1000, 15, 6)); //10
		assertEquals(1746, a.prixAbonnement(1000, 15, 12)); //10, 3
		assertEquals(3312, a.prixAbonnement(1000, 15, 24)); //10, 8
		assertEquals(1000, a.prixAbonnement(1000, 30, 6)); //
		assertEquals(1940, a.prixAbonnement(1000, 30, 12)); //3
		assertEquals(3680, a.prixAbonnement(1000, 30, 24)); //8
	}
}
