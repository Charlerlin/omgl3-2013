package ctp;

public class HerlinCharlesDDT_algo {

	// Donner ici l'implémentation de la méthode qui effectue un calcul spécifié par une chaine de caractères
	// Seule la dernière version est demandée (ne pas garder en commentaire les versions intermédiaires)

	public int calc(String s){
		String[] split = s.split(" ");
		String operat = split[0];

		int[] operandes = new int[split.length-1];
		for(int i=1; i!=split.length; i++)
			operandes[i-1] = Integer.parseInt(split[i]);
		int res = 0;
		if(operat.equals("+")){
			res = 0;
			for(int i=0; i!=operandes.length; i++)
				res += operandes[i];
		}
		else if(operat.equals("*")){
			res = 1;
			for(int i=0; i!=operandes.length; i++)
				res *= operandes[i];
		}

		return res;
	}

}
