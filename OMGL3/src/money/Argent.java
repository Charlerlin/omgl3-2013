package money;

/** Représente une quantité d'argent dans une devise.
 * Les instances de cette classes sont "immutable" : une fois l'objet créé, on
 * ne peut pas modifier son état (à l'image des classes standard String, Integer, etc).
 * 
 * @author Iovka Boneva
 *
 */
public class Argent {
	
	/** Le montant est exprimé en "centimes", ou toute autre somme minimale correspondante. */
	private int montant;
	/** Le nom de la devise. */
	private String devise;
	
	/** Argent à partir de la devise et le montant.
	 * 
	 * @param devise La devise de l'argent. Ne peut être null, ni la chaine vide.
	 * @param montant Le montant d'argent. Ne peut être négatif
	 * @exception IllegalArgumentException si la devise ou le montant ne respectent pas les contraintes
	 */
	public Argent(String devise, int montant) throws IllegalArgumentException{
		if(devise==null || devise.isEmpty())
			throw new IllegalArgumentException("Devise non conforme");
		else
			this.devise = devise;
		if(montant<0)
			throw new IllegalArgumentException("Montant négatif");
		else
			this.montant = montant;
	}

	/** Ajoute l'argent donné à cet argent.
	 * 
	 * @param a la quantité d'argent à ajouter
	 * @return l'argent résultant après l'ajout, ou null si la devise n'est pas la même
	 */
	public Argent ajouter(Argent a) {
		if(a.devise.equals(this.devise))
			return new Argent(a.devise, a.montant+this.montant);
		else
			return null;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((devise == null) ? 0 : devise.hashCode());
		result = prime * result + montant;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Argent other = (Argent) obj;
		if (devise == null) {
			if (other.devise != null)
				return false;
		} else if (!devise.equals(other.devise))
			return false;
		if (montant != other.montant)
			return false;
		return true;
	}
	
	/** La devise de cet argent.
	 * 
	 * @return La devise
	 */
	public String devise () {
		return devise;
	}
	
	/** Le montant de cet argent
	 * 
	 * @return Le montant
	 */
	public int montant () {
		return montant;
	}

	@Override
	public String toString() {
		return "Argent [devise=" + devise + ", montant=" + montant + "]";
	}
	
	
	
}

