public class Methoddecls implements Token {
	Methoddecl m;
	Methoddecls ms;

	public Methoddecls(){
	}

	public Methoddecls(Object m, Object ms){
		m = (Methoddecl) m;
		ms = (Methoddecls) ms;
	}

	public String toString(int i){
		if(m != null && ms != null)
			return m.toString() + " " + ms.toString();
		return "";
	}
}
