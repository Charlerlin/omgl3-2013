package ctp;

public class CtpBB {

	/** Permet de calculer la fréquence d'apparition de chaque valeur
	 * en vue de la construction d'un histogramme.
	 * @param valeurs Contient la liste des valeurs, comprises entre 0 et valeurMax 
	 * @param valeurMax La valeur maximale qui apparaît dans la liste de valeurs
	 * @return un tableau de frequences contenant à chaque indice i le nombre d'apparitions de i dans le tableau valeurs
	 */
	public int[] histogramme (int[] valeurs, int valeurMax) {
		int[] freq = new int[valeurMax + 1];
		
		int indiceDebut = 0;
		int i = 1;
		while (i < valeurs.length) {
			if (valeurs[i] != valeurs[i-1]) {
				freq[valeurs[i-1]] = (i - indiceDebut);
				indiceDebut = i;
			}
			i++;
		}
		if (i-1 < valeurs.length) {
			freq[valeurs[i-1]] = (i - indiceDebut);
		}
		return freq;
	}

}
