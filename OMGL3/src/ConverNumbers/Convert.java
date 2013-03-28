package ConverNumbers;

public class Convert {

	private String[] unite = new String[] {"zero", "un", "deux", "trois", 
			"quatre", "cinq", "six", "sept", "huit", "neuf"};
	private String[] dizaine = new String[] {"", "dix", "vingt", "trente", "quarante", 
			"cinquante", "soixante", "septante", "huitante", "nonante"};
	private String[] ze = new String[] {"", "onze", "douze", "treize", "quatorze", "quinze", "seize"};

	public String c(int i) {
		return infMilliard(i);
	}

	private String inf100(int i){
		int u = i%10;
		int d = i/10%10;
		if(i<10)
			return unite[i];
		else if(d!=0 && u==0)
			return dizaine[d];
		else if(d>1 && u==1)
			return dizaine[d]+" et "+unite[u];
		else if(i<17)
			return ze[i%10];
		else
			return dizaine[d]+"-"+unite[u];
	}

	private String infMille(int i){
		int c = i/100;
		if(i<100)
			return inf100(i);
		else if(i/100==1)
			if(i%100==0)
				return "cent";
			else
				return "cent "+inf100(i%100);
		else if(i%100==0)
			return unite[c]+" cents";
		else
			return unite[c]+" cent "+inf100(i%100);
	}
	
	private String infMillion(int i){
		int m = i/1000;
		if(i<1000)
			return infMille(i);
		else if(i/1000==1)
			if(i%1000==0)
				return "mille";
			else
				return "mille "+infMille(i%1000);
		else if(i%1000==0)
			return infMille(m)+" mille";
		else
			return infMille(m)+" mille "+infMille(i%1000);
	}
	
	private String infMilliard(int i){
		int mil = 1000000;
		int m = i/mil;
		if(i<mil)
			return infMillion(i);
		else if(i%mil==0)
			return infMille(m)+" millions";
		else
			return infMille(m)+" millions "+infMillion(i%mil);
	}

}
