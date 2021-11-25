public class Memberdecls implements Token {
	Fielddecls f;
	Methoddecls m;

	public Memberdecls(Object f, Object m){
		f = (Fielddecls) f;
		m = (Methoddecls) m;
	}

	public Memberdecls(){
	}

	public String toString(int t){
		if(f != null && m != null)
			return f.toString() + m.toString();
		else
			return "";
	}
}
