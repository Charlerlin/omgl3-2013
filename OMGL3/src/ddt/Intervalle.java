package ddt;

public class Intervalle {
	private int beg;
	private int end;
	
	public Intervalle(int b, int e){
		if(b>e)
			throw new IllegalArgumentException();
		else{
			beg=b;
			end=e;
		}
	}
	
	public boolean contains(int c){
		if(beg<=c && c<=end)
			return true;
		else
			return false;
	}
	
	public Intervalle intersect(Intervalle interv){
		if(this.contains(interv.beg))
			return new Intervalle(interv.beg, this.end);
		else if(interv.contains(this.beg))
			return new Intervalle(this.beg, interv.end);
		else
			return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + beg;
		result = prime * result + end;
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
		Intervalle other = (Intervalle) obj;
		if (beg != other.beg)
			return false;
		if (end != other.end)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Intervalle [" + beg + ", " + end + "]";
	}
	
	
	
	
}
