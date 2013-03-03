package money;

import java.util.ArrayList;

/** Un portefeuille contient de l'argent de différentes devises.
 * Le portefeuille ne peut pas être débiteur (pas de montants négatifs)
 * @author Iovka Boneva
 *
 */
public class Portefeuille {
	
	/** Les différents montants disponibles. */
	private ArrayList<Argent> largent;
	
	/** Crée un portefeuille vide. */
	public Portefeuille() {
		largent = new ArrayList<Argent>();
	}

	/** Ajoute de l'argent au portefeuille.
	 * 
	 * @param a L'argent à ajouter.
	 */
	public void ajouter(Argent a) {
		if(a!=null){
			Argent trouve = null;
			for(Argent al : largent){
				if(a.devise().equals(al.devise())){
					trouve = al;
					break;
				}
			}
			if(trouve==null)
				largent.add(a);
			else{
				largent.remove(trouve);
				trouve = trouve.ajouter(a);
				largent.add(trouve);
			}
		}
	}
	
	/** Vélifie la montant disponible pour une devise donnée.
	 * 
	 * @param devise La devise pour laquelle on vérifie le montant.
	 * @return Le montant disponible
	 */
	public int combien (String devise) {
		int ret = 0;
		for(Argent a : largent){
			if(a.devise().equals(devise))
				ret = a.montant();
		}
		return ret;
	}
	
	/** Soustrait de l'argent au portefeuille.
	 * Ne soustrait rien si la quantité demandée n'est pas disponible.
	 * @param a La quantité à soustraire
	 * 
	 * @return l'argent qui correspond à la quantité soustraite, ou l'argent de la même devise mais de montant 0 si la quantité disponible est insuffisante.
	 */
	public Argent soustraire (Argent a) {
		Argent ret = new Argent(a.devise(), 0);
		if(a!=null){
			Argent trouve = null;
			for(Argent al : largent){
				if(a.devise().equals(al.devise())){
					trouve = al;
					break;
				}
			}
			if(trouve==null)
				return new Argent(a.devise(), 0);
			else{
				largent.remove(trouve);
				
				/*Argent res = new Argent(a.devise(), trouve.montant()-a.montant());
				
				if(res.montant()<=0){
					res = new Argent(a.devise(), 0);
					retInt = a.montant()-trouve.montant();
				}
				else{
					retInt = a.montant();
				}*/
				
				/*int resInt = trouve.montant()-a.montant();
				
				if(resInt<=0){
					retInt = a.montant()-trouve.montant();
					resInt = 0;
				}
				else{
					retInt = a.montant();
				}
				
				Argent res = new Argent(a.devise(), resInt);
				largent.add(res);*/
				int retInt = trouve.montant()-a.montant();
				if(retInt>=0){
					ret = new Argent(a.devise(), a.montant());
					Argent res = new Argent(trouve.devise(), trouve.montant()-a.montant());
					largent.add(res);
				}
				else{};
				
			}
		}
		return ret;
	}

	@Override
	public String toString() {
		return "Portefeuille [largent=" + largent + "]";
	}
	
	
	
}
