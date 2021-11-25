public class Argdecls implements Token {
	Argdecllist a;

	public Argdecls(){}

	public Argdecls(Object a){
		a = (Argdecllist) a;
	}

	public String toString(int t){
		if(a == null)
			return "";
		return a.toString();
	}
}
