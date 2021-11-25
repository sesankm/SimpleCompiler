public class Argdecllist implements Token {
	Argdecl a;
	Argdecllist al;

	public Argdecllist(Object a){
		a = (Argdecl) a;
	}

	public Argdecllist(Object a, Object al){
		a = (Argdecl) a;
		al = (Argdecllist) al;
	}


	public String toString(int t){
		if(al == null)
			return a.toString();
		return a.toString() + "," + al.toString();
	}
}
